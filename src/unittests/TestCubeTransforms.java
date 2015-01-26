package unittests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solver.algorithms.Algorithm;
import solver.algorithms.Cube;

public class TestCubeTransforms {
   
   public final static byte TEST_MOVES[] = {
      Algorithm.L, Algorithm.F, Algorithm.R, Algorithm.B, Algorithm.U, Algorithm.D, 
      Algorithm.Li, Algorithm.Fi, Algorithm.Ri, Algorithm.Bi, Algorithm.Ui, Algorithm.Di, 
      Algorithm.Li, Algorithm.Fi, Algorithm.Ri, Algorithm.Bi, Algorithm.Ui, Algorithm.Di, 
      Algorithm.L, Algorithm.F, Algorithm.R, Algorithm.B, Algorithm.U, Algorithm.D 
   };
   
   @Test
   public void testPerformTransform() {
      Cube testCube = new Cube();
      for(byte i = 0; i < TEST_MOVES.length; i++) {
         testCube.performTransform(TEST_MOVES[i]);
         byte descriptor[][] = testCube.getDescriptor();
         assertTrue(
               "Move " + Algorithm.MOVE_STRINGS[TEST_MOVES[i]] + " is invalid.", 
               transformIsValid(i, descriptor));
      }
   }
   
   private boolean transformIsValid(int index, byte descriptor[][]) {
      for(byte i = 0; i < 6; i++) {
         for(byte j = 0; j < 9; j++) {
            if(descriptor[i][j] != ValidCubeTransforms.TEST_RESULTS[index][i][j])
               return false;
         }
      }
      return true;
   }

}
