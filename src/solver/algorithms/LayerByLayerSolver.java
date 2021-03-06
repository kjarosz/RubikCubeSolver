package solver.algorithms;

import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LayerByLayerSolver extends SolvingAlgorithm {
   // Bottom Cross 
   private static final byte BOTTOM_CROSS_EDGES[] = {
      CubeConstants.DF, CubeConstants.DR, CubeConstants.DB, CubeConstants.DL
   };
   
   // F2L
   private static final byte F2L_EDGES[] = {
      CubeConstants.FL, CubeConstants.FR, CubeConstants.BR, CubeConstants.BL
   };
   
   private static final byte F2L_CORNERS[] = {
      CubeConstants.DFL, CubeConstants.DRF, CubeConstants.DBR, CubeConstants.DLB 
   };
   
   private HashMap<String, byte[]> mFLEPermutations;
   private HashMap<String, byte[]> mF2LPermutations;
   
   private boolean mPermutationsComputed;
   
   public LayerByLayerSolver(PropertyChangeListener propertyTracker) {
      super(propertyTracker);
      mPermutationsComputed = false;
   }
   
   public void computePermutations() {
      if(!isCancelled())
         mFLEPermutations = generateFLEPermutations();
      
      if(!isCancelled())
         mF2LPermutations = generateF2LPermutations();
   }
   
   // Generates all cases for the First Layer Edges (bottom cross)
   private HashMap<String, byte[]> generateFLEPermutations() {
      publish("Generating FLE Permutations.");
      
      HashMap<String, byte[]> permutations = new HashMap<>();
      
      // For progress tracking.
      int level = 0;

      // State 0 for algorithm.
      Queue<Algorithm> algorithmQueue = new LinkedList<>();
      Queue<Algorithm> nextAlgorithmQueue = new LinkedList<>();

      Cube startCube = new Cube();
      permutations.put(getEdgeArrangement(startCube, BOTTOM_CROSS_EDGES), new byte[0]);
      
      Algorithm startAlg = new Algorithm(startCube);
      nextAlgorithmQueue.add(startAlg);
      
      while (!nextAlgorithmQueue.isEmpty()) {
         algorithmQueue.addAll(nextAlgorithmQueue);
         nextAlgorithmQueue.clear();
         
         publish("Current level: " + (++level));
         while(!algorithmQueue.isEmpty()) {
            Algorithm alg = algorithmQueue.remove();
            
            if(isCancelled())
               return null;
            
            moveLoop:
            for(byte i = 0; i < 12; i++) {
               Algorithm newAlg = new Algorithm(alg, i);
               
               String arrangement = getEdgeArrangement(newAlg.cubeState, BOTTOM_CROSS_EDGES);
               if(permutations.containsKey(arrangement)) {
                  continue moveLoop;
               }
               permutations.put(arrangement, newAlg.moves);
               
               nextAlgorithmQueue.add(newAlg);
            }
         }
      }
      
      publish("FLE Permutations Generated: " + permutations.size());
      
      return permutations;
   }
   
   private String getEdgeArrangement(Cube cube, byte edges[]) {
      StringBuilder builder = new StringBuilder();
      getEdgeArrangement(cube, edges, builder);
      return builder.toString();
   }
   
   private StringBuilder getEdgeArrangement(Cube cube, byte edges[], StringBuilder builder) {
      for(byte edge: edges) {
         builder.append(CubeConstants.EDGE_STRINGS[cube.findEdge(edge)]);
      }
      return builder;
   }
   
   private StringBuilder getCornerArrangement(Cube cube, byte corners[], StringBuilder builder) {
      for(byte corner: corners) {
         builder.append(CubeConstants.CORNER_STRINGS[cube.findEdge(corner)]);
      }
      return builder;
   }
   
   private HashMap<String, byte[]> generateF2LPermutations() {
      publish("Generating F2L permutations.");
      
      HashMap<String, byte[]> permutations = new HashMap<>();
      
      // For level tracking
      int level = 0;
      
      // Prepare start state for algorithm
      Queue<Algorithm> algorithmQueue = new LinkedList<>();
      Queue<Algorithm> nextLevelQueue = new LinkedList<>();
      
      Cube solvedCube = new Cube();
      permutations.put(getF2LArrangement(solvedCube), new byte[0]);
      
      nextLevelQueue.add(new Algorithm(solvedCube));
      
      HashSet<String> visitedPermutations = new HashSet<>();
      
      while(!nextLevelQueue.isEmpty()) {
         algorithmQueue.addAll(nextLevelQueue);
         nextLevelQueue.clear();
         
         publish("Current level: " + (++level));
         if(level > 20) {
            throw new RuntimeException("Level should not go above 20!");
         }
         
         while(!algorithmQueue.isEmpty()) {
            Algorithm alg = algorithmQueue.remove();
            
            if(isCancelled())
               return null;
            
            moveLoop:
            for(byte i = 0; i < 12; i++) {
               Algorithm newAlg = new Algorithm(alg, i);
               
               String permutation = getF2LArrangement(newAlg.cubeState);
               if(visitedPermutations.contains(permutation)) {
                  continue moveLoop;
               } else {
                  visitedPermutations.add(permutation);
               }
               
               if(crossSolved(newAlg.cubeState)) {
                  if(permutations.containsKey(permutation)) {
                     permutations.put(permutation, newAlg.moves);
                     continue moveLoop;
                  }
               }
               
               nextLevelQueue.add(newAlg);
            }
         }
      }
      
      publish("F2L Permutations Generated: " + permutations.size());
      
      return permutations;
   }
   
   private String getF2LArrangement(Cube cube) {
      StringBuilder arrangement = new StringBuilder();
      arrangement = getEdgeArrangement(cube, F2L_EDGES, arrangement);
      arrangement = getCornerArrangement(cube, F2L_CORNERS, arrangement);
      return arrangement.toString();
   }
   
   private boolean verifyEdgeArrangement(Cube cube, byte edges[]) {
      for(byte edge: edges) {
         if(cube.findEdge(edge) != edge)
            return false;
      }
      return true;
   }
   
   private boolean crossSolved(Cube cube) {
      return verifyEdgeArrangement(cube, BOTTOM_CROSS_EDGES);
   }
   
   @Override
   protected Algorithm doInBackground() {
      if(startingCube.cubeSolved()) {
         return new Algorithm(startingCube);
      }
      
      if(!mPermutationsComputed) {
         computePermutations();
      }
      
      if(isCancelled())
         return null;
      
      Algorithm firstLayerSolved = solveFirstLayer(startingCube);
      
      if(isCancelled())
         return null;
      
      return firstLayerSolved;
   }
   
   private Algorithm solveFirstLayer(Cube startingCube) {
      Algorithm algorithm = solveBottomCross(startingCube);
      //algorithm = solveF2L(algorithm);
      
      return algorithm;
   }
   
   private Algorithm solveBottomCross(Cube startingCube) {
      String arrangement = getEdgeArrangement(startingCube, BOTTOM_CROSS_EDGES);
      byte moves[] = (byte[])mFLEPermutations.get(arrangement);
      return Algorithm.getReverseAlgorithm(startingCube, moves);
   }
   
   private Algorithm solveF2L(Algorithm algorithm) {
      if(!crossSolved(algorithm.cubeState)) {
         throw new RuntimeException("Cross was not solved before F2L!");
      }
      
      String arrangement = getF2LArrangement(algorithm.cubeState);
      byte moves[] = (byte[])mF2LPermutations.get(arrangement);
      algorithm.addReverseMoveset(moves);
      return algorithm;
   }

   private void printMoves(byte moves[]) {
      for(byte move: moves) {
         System.out.print(Algorithm.MOVE_STRINGS[move] + " ");
         
      }
      System.out.println();
   }
}
