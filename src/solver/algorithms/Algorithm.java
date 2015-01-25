package solver.algorithms;

import java.util.LinkedList;


public class Algorithm {
   public static enum Move {
     L, Li, F, Fi, R, Ri,
     B, Bi, U, Ui, D, Di;
   }
     
   public static final String MOVE_STRINGS[] = {
     "L ", "Li", "F ", "Fi", "R ", "Ri", "B ", "Bi", "U ", "Ui", "D ", "Di"
   };
     
   public Cube cubeState;
   public LinkedList<Move> moves;
   
   public Algorithm(Cube cube) {
      cubeState = new Cube(cube);
      moves = new LinkedList<>();
   }
   
   public Algorithm(Algorithm algorithm, Move newMove) {
      cubeState = new Cube(algorithm.cubeState);
      cubeState.performTransform(newMove);
      moves = new LinkedList<>(algorithm.moves);
      moves.addFirst(newMove);
   }
   
   public Algorithm getReverseAlgorithm() {
      Algorithm algorithm = new Algorithm(cubeState);
      
      Move values[] = Move.values();
      for(Move move: moves) {
         int ordinal = move.ordinal();
         if(ordinal % 2 == 0) {
            algorithm.moves.addFirst(values[ordinal+1]);
         } else {
            algorithm.moves.addFirst(values[ordinal]);
         }
      }
      
      for(Move move: algorithm.moves) {
         algorithm.cubeState.performTransform(move);
      }
      
      return algorithm;
   }
}
