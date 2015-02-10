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
         algorithm.moves[i] = invertMove(moves[moves.length - 1 - i]);
         algorithm.cubeState.performTransform(algorithm.moves[i]);
      }
      return algorithm;
   }
   
   public void addReverseMoveset(byte[] moveset) {
      byte newMoves[] = new byte[moves.length + moveset.length];
      for(int i = 0; i < moves.length; i++) {
         newMoves[i] = moves[i];
      }
      for(int i = 0; i < moveset.length; i++) {
         newMoves[moves.length + i] = invertMove(moveset[moveset.length-1-i]);
         cubeState.performTransform(newMoves[moves.length + i]);
      }
      moves = newMoves;
   }
   
   private static byte invertMove(byte move) {
      if(move % 2 == 0) {
         return (byte)(move + 1);
      } else {
         return (byte)(move - 1);
      }
   }
   
   public boolean moveIsStupid(byte move) {
      if(moves.length == 0) {
         return false;
      }
      
      byte lastMove = moves[moves.length-1];
      byte secondLastMove = -1;
      
      if(moves.length > 1)
         secondLastMove = moves[moves.length - 2];
      
      return moveIsStupid(secondLastMove, lastMove, move);
   }
   
   public static boolean moveIsStupid(byte secondLastMove, byte lastMove, byte move) {
      // Do not repeat move
      if(move == lastMove && secondLastMove == move) {
            return true;
      }
      
      // Commutative moves
      switch(move) {
      case Algorithm.D:
      case Algorithm.Di:
         if(lastMove == Algorithm.U || lastMove == Algorithm.Ui) {
            return true;
         }
         break;
      case Algorithm.L:
      case Algorithm.Li:
         if(lastMove == Algorithm.R || lastMove == Algorithm.Ri) {
            return true;
         }
         break;
      case Algorithm.B:
      case Algorithm.Bi:
         if(lastMove == Algorithm.F || lastMove == Algorithm.Fi) {
            return true;
         }
         break;
      default:
         break;
      }
      
      // If move undoes the last one.
      if(move % 2 == 0) {
         return lastMove == move + 1;
      } else {
         return lastMove == move - 1;
      }
   }
}
