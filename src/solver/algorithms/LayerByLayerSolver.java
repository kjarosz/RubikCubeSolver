package solver.algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import solver.ui.ProgressReporter;

public class LayerByLayerSolver implements SolvingAlgorithm {

   private boolean mStop;
   
   private HashMap<String, byte[]> mFLEPermutations;
   private HashMap<String, byte[]> mF2LPermutations;
   
   public LayerByLayerSolver() {
      mFLEPermutations = generateFLEPermutations();
      mF2LPermutations = generateF2LPermutations();
   }
   
   // Generates all cases for the First Layer Edges (bottom cross)
   private HashMap<String, byte[]> generateFLEPermutations() {
      System.out.println("Generating FLE Permutations.");
      
      HashMap<String, byte[]> permutations = new HashMap<>();
      
      // For progress tracking.
      int level = 0;

      // State 0 for algorithm.
      Queue<Algorithm> algorithmQueue = new LinkedList<>();
      Queue<Algorithm> nextAlgorithmQueue = new LinkedList<>();

      Cube startCube = new Cube();
      permutations.put(getBottomCrossArrangement(startCube), new byte[0]);
      
      Algorithm startAlg = new Algorithm(startCube);
      nextAlgorithmQueue.add(startAlg);
      
      while (!nextAlgorithmQueue.isEmpty()) {
         algorithmQueue.addAll(nextAlgorithmQueue);
         nextAlgorithmQueue.clear();
         
         System.out.println("Current level: " + (++level));
         while(!algorithmQueue.isEmpty()) {
            Algorithm alg = algorithmQueue.remove();
            
            moveLoop:
            for(byte i = 0; i < 12; i++) {
               Algorithm newAlg = new Algorithm(alg, i);
               
               String arrangement = getBottomCrossArrangement(newAlg.cubeState);
               if(permutations.containsKey(arrangement)) {
                  continue moveLoop;
               }
               
               nextAlgorithmQueue.add(newAlg);
               
               permutations.put(arrangement, newAlg.moves);
            }
         }
      }
      
      System.out.println("FLE Permutations Generated: " + permutations.size());
      
      return permutations;
   }
   
   private String getBottomCrossArrangement(Cube cube) {
      final byte EDGES[] = { Cube.DF, Cube.DR, Cube.DB, Cube.DL };
      
      StringBuilder builder = new StringBuilder();
      for(byte edge: EDGES) {
         builder.append(Cube.EDGE_STRINGS[cube.findEdge(edge)]);
      }
      return builder.toString();
   }
   
   private HashMap<String, byte[]> generateF2LPermutations() {
      System.out.println("Generating F2L permutations.");
      
      HashMap<String, byte[]> permutations = new HashMap<>();
      
      // For level tracking
      int level = 0;
      
      // Prepare start state for algorithm
      Queue<Algorithm> algorithmQueue = new LinkedList<>();
      Queue<Algorithm> nextLevelQueue = new LinkedList<>();
      
      Cube solvedCube = new Cube();
      permutations.insert(getF2LArrangement(solvedCube), new byte[0]);
      
      
      System.out.println("F2L Permutations Generated: " + permutations.size());
      
      return permutations;
   }
   
   private String getF2LArrangement(Cube cube) {
      final byte EDGES[] = { 
            Cube.FL, Cube.FR, Cube.BR, Cube.BL,
            Cube.DFL, Cube.DRF, Cube.DBR, Cube.DLB 
      };
      final byte CORNERS[] = {
            
      };
      
      StringBuilder arrangement = new StringBuilder();
      for(byte cubie: CUBIES) {
         builder.append(Cube.)
      }
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
      algorithm = solveF2L(algorithm);
      
      return algorithm;
   }
   
   private Algorithm solveBottomCross(Cube startingCube) {
      String arrangement = getBottomCrossArrangement(startingCube);
      byte moves[] = (byte[])mFLEPermutations.get(arrangement);
      printMoves(moves);
      return Algorithm.getReverseAlgorithm(startingCube, moves);
   }
   
   private Algorithm solveF2L(Algorithm algorithm) {
      return algorithm;
   }

   private void printMoves(byte moves[]) {
      for(byte move: moves) {
         System.out.print(Algorithm.MOVE_STRINGS[move] + " ");
         
      }
      System.out.println();
   }
   
   @Override
   public void stop() {
      mStop = true;
   }

}
