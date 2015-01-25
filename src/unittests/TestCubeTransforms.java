package unittests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solver.algorithms.Algorithm;
import solver.algorithms.Cube;
import solver.algorithms.Algorithm.Move;

public class TestCubeTransforms {
   
   public final static Move TEST_MOVES[] = {
      Move.L, Move.F, Move.R, Move.B, Move.U, Move.D, 
      Move.Li, Move.Fi, Move.Ri, Move.Bi, Move.Ui, Move.Di, 
      Move.Li, Move.Fi, Move.Ri, Move.Bi, Move.Ui, Move.Di, 
      Move.L, Move.F, Move.R, Move.B, Move.U, Move.D 
   };
   
   @Test
   public void testPerformTransform() {
      Cube testCube = new Cube();
      for(int i = 0; i < TEST_MOVES.length; i++) {
         testCube.performTransform(TEST_MOVES[i]);
         Cube.CubeColor descriptor[][] = testCube.getDescriptor();
         assertTrue(
               "Move " + Algorithm.MOVE_STRINGS[TEST_MOVES[i].ordinal()] + " is invalid.", 
               transformIsValid(i, descriptor));
      }
   }
   
   private boolean transformIsValid(int index, Cube.CubeColor descriptor[][]) {
      for(int i = 0; i < 6; i++) {
         for(int j = 0; j < 9; j++) {
            if(descriptor[i][j] != ValidCubeTransforms.TEST_RESULTS[index][i][j])
               return false;
         }
      }
      return true;
   }

}
