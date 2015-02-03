package solver.algorithms;



public class Algorithm {
   public static final byte 
   L = 0, Li = 1, F = 2, Fi = 3, R = 4, Ri = 5,
   B = 6, Bi = 7, U = 8, Ui = 9, D = 10, Di = 11;
     
   public static final String MOVE_STRINGS[] = {
     "L ", "Li", "F ", "Fi", "R ", "Ri", "B ", "Bi", "U ", "Ui", "D ", "Di"
   };
     
   public Cube cubeState;
   public byte moves[];
   
   public Algorithm(Cube cube) {
      cubeState = new Cube(cube);
      moves = new byte[0];
   }
   
   public Algorithm(Algorithm algorithm, byte newMove) {
      cubeState = new Cube(algorithm.cubeState);
      cubeState.performTransform(newMove);
      moves = new byte[algorithm.moves.length+1];
      for(int i = 0; i < algorithm.moves.length; i++) {
         moves[i] = algorithm.moves[i];
      }
      moves[moves.length - 1] = newMove;
   }
   
   public Algorithm(Algorithm algorithm, byte moveset[]) {
      cubeState = new Cube(algorithm.cubeState);
      moves = new byte[algorithm.moves.length + moveset.length];
      for(int i = 0; i < algorithm.moves.length; i++) {
         moves[i] = algorithm.moves[i];
      }
      for(int i = 0; i < moveset.length; i++) {
         moves[i + algorithm.moves.length] = moveset[i];
         cubeState.performTransform(moveset[i]);
      }
   }
   
   public Algorithm(Cube cube, byte moveset[]) {
      cubeState = new Cube(cube);
      moves = new byte[moveset.length];
      for(int i = 0; i < moves.length; i++) {
         moves[i] = moveset[i];
         cubeState.performTransform(moves[i]);
      }
   }
   
   public Algorithm getReverseAlgorithm() {
      return getReverseAlgorithm(cubeState, moves);
   }
   
   public static Algorithm getReverseAlgorithm(Cube cubeState, byte[] moves) {
      Algorithm algorithm = new Algorithm(cubeState);
      
      algorithm.moves = new byte[moves.length];
      for(int i = 0; i < moves.length; i++) {
         if(moves[moves.length - 1 - i] % 2 == 0) {
            algorithm.moves[i] =
                  (byte)(moves[moves.length-1-i] + 1);
         } else {
            algorithm.moves[i] =
                  (byte)(moves[moves.length-1-i] - 1);
         }
         algorithm.cubeState.performTransform(algorithm.moves[i]);
      }
      return algorithm;
   }
}
