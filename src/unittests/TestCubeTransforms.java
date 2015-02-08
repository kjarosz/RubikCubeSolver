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
         assertTrue(
               "Move " + Algorithm.MOVE_STRINGS[TEST_MOVES[i]] + " is invalid.", 
               transformIsValid(i, testCube.getCube()));
      }
   }
   
   private boolean transformIsValid(int index, byte descriptor[]) {
      for(byte i = 0; i < (12+8); i++) {
         if(descriptor[i] != ValidCubeTransforms.TEST_RESULTS[index][i]) {
            printCube(descriptor);
            printCube(ValidCubeTransforms.TEST_RESULTS[index]);
            return false;
         }
      }
      return true;
   }

   private void printCube(byte descriptor[]) {
      for(int i = 0; i < 12; i++) {
         System.out.print(Cube.EDGE_STRINGS[descriptor[i]] + " ");
      }
      for(int i = 0; i < 8; i++) {
         System.out.print(Cube.CORNER_STRINGS[descriptor[i+12]] + " ");
      }
      System.out.println();
   }
}
