package solver.algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import solver.ui.ProgressReporter;

public class LayerByLayerSolver implements SolvingAlgorithm {

   private boolean mStop;
   
   private HashMap<String, byte[]> mFLEPermutations;
   
   public LayerByLayerSolver() {
      mFLEPermutations = generateFLEPermutations();
   }
   
   private HashMap<String, byte[]> generateFLEPermutations() {
      System.out.println("Generating Edge Arrangements.");
      
      HashMap<String, byte[]> permutations = new HashMap<>();
      
      Cube startCube = new Cube();
      permutations.put(getBottomEdgeArrangement(startCube), new byte[0]);
      
      Algorithm startAlg = new Algorithm(startCube);
      LinkedList<Algorithm> algorithmQueue = new LinkedList<>();
      for(byte i = 0; i < 12; i++) {
         Algorithm newAlgorithm = new Algorithm(startAlg, i);
         algorithmQueue.add(newAlgorithm);
         
         String arrangement = getBottomEdgeArrangement(newAlgorithm.cubeState);
         byte move[] = new byte[1];
         move[0] = i;
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
            for(byte i = 0; i < 12; i++) {
               Algorithm newAlg = new Algorithm(alg, i);
               
               String arrangement = getBottomEdgeArrangement(newAlg.cubeState);
               if(permutations.containsKey(arrangement)) {
                  continue moveLoop;
               }
               
               nextAlgorithmQueue.add(newAlg);
               
               byte moves[] = new byte[newAlg.moves.size()];
               Iterator<Byte> moveIt = newAlg.moves.iterator();
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
      final byte EDGES[] = { Cube.DF, Cube.DR, Cube.DB, Cube.DL };
      
      StringBuilder builder = new StringBuilder();
      for(byte edge: EDGES) {
         builder.append(Cube.EDGE_STRINGS[edge]);
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
      byte moves[] = (byte[])mFLEPermutations.get(arrangement);
      Algorithm alg = new Algorithm(startingCube);
      for(byte move: moves) {
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
