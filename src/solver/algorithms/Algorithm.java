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
    
}
