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
      
      // For progress tracking.
      int level = 0;
      
      LinkedList<Algorithm> algorithmQueue = new LinkedList<>();
      LinkedList<Algorithm> nextAlgorithmQueue = new LinkedList<>();

      Algorithm startAlg = new Algorithm(startCube);
      nextAlgorithmQueue.add(startAlg);
      
      while (!nextAlgorithmQueue.isEmpty()) {
         algorithmQueue.addAll(nextAlgorithmQueue);
         nextAlgorithmQueue.clear();
         
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
      }
      
      System.out.println("Edge Permutations Generated: " + permutations.size());
      
      return permutations;
   }
   
   private String getBottomEdgeArrangement(Cube cube) {
      final byte EDGES[] = { Cube.DF, Cube.DR, Cube.DB, Cube.DL };
      
      StringBuilder builder = new StringBuilder();
      for(byte edge: EDGES) {
         builder.append(Cube.EDGE_STRINGS[cube.findEdge(edge)]);
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
      Algorithm algorithm = solveBottomCross(startingCube);
      
      return algorithm;
   }
   
   private Algorithm solveBottomCross(Cube startingCube) {
      String arrangement = getBottomEdgeArrangement(startingCube);
      byte moves[] = (byte[])mFLEPermutations.get(arrangement);
      Algorithm alg = new Algorithm(startingCube);
      for(byte i = 0 ; i < moves.length; i++) {
         if(moves[i] % 2 == 0) {
            alg.cubeState.performTransform((byte)(moves[i]+1));
            alg.moves.addFirst((byte)(moves[i]+1));
         } else {
            alg.cubeState.performTransform((byte)(moves[i]-1));
            alg.moves.addFirst((byte)(moves[i]-1));
         }
      }
      
      return alg;
   }

   @Override
   public void stop() {
      mStop = true;
   }

}
