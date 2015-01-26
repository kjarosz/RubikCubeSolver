package solver.algorithms;

import java.util.Iterator;
import java.util.LinkedList;


public class Algorithm {
   public static final byte 
   L = 0, Li = 1, F = 2, Fi = 3, R = 4, Ri = 5,
   B = 6, Bi = 7, U = 8, Ui = 9, D = 10, Di = 11;
     
   public static final String MOVE_STRINGS[] = {
     "L ", "Li", "F ", "Fi", "R ", "Ri", "B ", "Bi", "U ", "Ui", "D ", "Di"
   };
     
   public Cube cubeState;
   public LinkedList<Byte> moves;
   
   public Algorithm(Cube cube) {
      cubeState = new Cube(cube);
      moves = new LinkedList<>();
   }
   
   public Algorithm(Algorithm algorithm, byte newMove) {
      cubeState = new Cube(algorithm.cubeState);
      cubeState.performTransform(newMove);
      moves = new LinkedList<>(algorithm.moves);
      moves.addFirst(newMove);
   }
   
   public Algorithm getReverseAlgorithm() {
      Algorithm algorithm = new Algorithm(cubeState);
      
      for(byte move = 0; move < 12; move++) {
         if(move % 2 == 0) {
            algorithm.moves.addFirst(move);
         } else {
            algorithm.moves.addFirst(move);
         }
      }
      
      Iterator<Byte> moveset = algorithm.moves.iterator();
      while(moveset.hasNext()) {
         algorithm.cubeState.performTransform(moveset.next().byteValue());
      }
      
      return algorithm;
   }
}
