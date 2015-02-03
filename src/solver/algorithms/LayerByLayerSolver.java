package solver.algorithms;

import java.util.HashMap;
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
               
               permutations.put(arrangement, newAlg.moves);
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
      algorithm = solveBottomCorners(algorithm);
      
      return algorithm;
   }
   
   private Algorithm solveBottomCross(Cube startingCube) {
      String arrangement = getBottomEdgeArrangement(startingCube);
      byte moves[] = (byte[])mFLEPermutations.get(arrangement);
      printMoves(moves);
      return Algorithm.getReverseAlgorithm(startingCube, moves);
   }
   
   private Algorithm solveBottomCorners(Algorithm algorithm) {
      algorithm = solveDRF(algorithm);
      algorithm = solveDFL(algorithm);
      algorithm = solveDLB(algorithm);
      algorithm = solveDBR(algorithm);
      return algorithm;
   }
   
   private boolean cornerIsOnBottom(byte location) {
      return (location % 8) >= 4 && (location % 8) < 8;
   }
   
   private Algorithm solveDRF(Algorithm algorithm) {
      byte cornerLocation = algorithm.cubeState.findCorner(Cube.DRF);
      if(cornerLocation == Cube.DRF)
         return algorithm;
      
      if(cornerIsOnBottom(cornerLocation)) {
         
      }
      
      return algorithm;
   }
   
   private Algorithm solveDFL(Algorithm algorithm) {
      return algorithm;
   }
   
   private Algorithm solveDLB(Algorithm algorithm) {
      return algorithm;
   }
   
   private Algorithm solveDBR(Algorithm algorithm) {
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
