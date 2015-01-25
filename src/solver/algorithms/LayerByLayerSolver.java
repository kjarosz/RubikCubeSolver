package solver.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import solver.algorithms.Algorithm.Move;
import solver.algorithms.Cube.Edge;
import solver.ui.ProgressReporter;

public class LayerByLayerSolver implements SolvingAlgorithm {

   private boolean mStop;
   
   private HashMap<String, Move[]> mFLEPermutations;
   
   public LayerByLayerSolver() {
      mFLEPermutations = generateFLEPermutations();
   }
   
   private HashMap<String, Move[]> generateFLEPermutations() {
      System.out.println("Generating Edge Arrangements.");
      
      HashMap<String, Move[]> permutations = new HashMap<>();
      
      Cube startCube = new Cube();
      permutations.put(getBottomEdgeArrangement(startCube), new Move[0]);
      
      Move moveset[] = Move.values();
      
      Algorithm startAlg = new Algorithm(startCube);
      LinkedList<Algorithm> algorithmQueue = new LinkedList<>();
      for(int i = 0; i < 12; i++) {
         Algorithm newAlgorithm = new Algorithm(startAlg, moveset[i]);
         algorithmQueue.add(newAlgorithm);
         
         String arrangement = getBottomEdgeArrangement(newAlgorithm.cubeState);
         Move move[] = new Move[1];
         move[0] = moveset[i];
         permutations.put(arrangement, move);
      }

      // For progress tracking.
      int level = 0;
      
      LinkedList<Algorithm> nextAlgorithmQueue = new LinkedList<>();
      do {
         if(!nextAlgorithmQueue.isEmpty()) {
            algorithmQueue.addAll(nextAlgorithmQueue);
            nextAlgorithmQueue.clear();
         }
         
         System.out.println("Current level: " + (++level));
         while(!algorithmQueue.isEmpty()) {
            Algorithm alg = algorithmQueue.removeFirst();
            
            moveLoop:
            for(int i = 0; i < 12; i++) {
               Algorithm newAlg = new Algorithm(alg, moveset[i]);
               
               String arrangement = getBottomEdgeArrangement(newAlg.cubeState);
               if(permutations.containsKey(arrangement)) {
                  continue moveLoop;
               }
               
               nextAlgorithmQueue.add(newAlg);
               
               Move moves[] = new Move[newAlg.moves.size()];
               Iterator<Move> moveIt = newAlg.moves.iterator();
               for(int j = 0; j < moves.length; j++) {
                  moves[j] = moveIt.next();
               }
               
               permutations.put(arrangement, moves);
            }
         }
      } while(!nextAlgorithmQueue.isEmpty());
      
      System.out.println("Edge Permutations Generated: " + permutations.size());
      
      return permutations;
   }
   
   private String getBottomEdgeArrangement(Cube cube) {
      final Edge EDGES[] = { Edge.DF, Edge.DR, Edge.DB, Edge.DL };
      
      StringBuilder builder = new StringBuilder();
      for(Edge edge: EDGES) {
         Edge edgeLocation = cube.findEdge(edge);
         builder.append(Cube.EDGE_STRINGS[edgeLocation.ordinal()]);
      }
      return builder.toString();
   }
   
   @Override
   public Algorithm solveCube(Cube startingCube,
         ProgressReporter progressReporter) {
      mStop = false;
      
      if(startingCube.cubeSolved()) {
         mStop = true;
         return new Algorithm(startingCube);
      }
      
      Algorithm firstLayerSolved = solveFirstLayer(startingCube);
      
      if(mStop)
         return null;
      
      return firstLayerSolved;
   }
   
   private Algorithm solveFirstLayer(Cube startingCube) {
      String arrangement = getBottomEdgeArrangement(startingCube);
      Move moves[] = (Move[])mFLEPermutations.get(arrangement);
      Algorithm alg = new Algorithm(startingCube);
      for(Move move: moves) {
         alg.cubeState.performTransform(move);
         alg.moves.add(move);
      }
      return alg;
   }

   @Override
   public void stop() {
      mStop = true;
   }

}
