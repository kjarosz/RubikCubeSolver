package solver;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCubeTransforms {
   
   public final static Solver.Move TEST_MOVES[] = {
      Solver.Move.L, Solver.Move.F, Solver.Move.R, Solver.Move.B, Solver.Move.U, Solver.Move.D, 
      Solver.Move.Li, Solver.Move.Fi, Solver.Move.Ri, Solver.Move.Bi, Solver.Move.Ui, Solver.Move.Di, 
      Solver.Move.Li, Solver.Move.Fi, Solver.Move.Ri, Solver.Move.Bi, Solver.Move.Ui, Solver.Move.Di, 
      Solver.Move.L, Solver.Move.F, Solver.Move.R, Solver.Move.B, Solver.Move.U, Solver.Move.D 
   };
   
   @Test
   public void testPerformTransform() {
      Cube testCube = new Cube();
      for(int i = 0; i < TEST_MOVES.length; i++) {
         testCube.performTransform(TEST_MOVES[i]);
         Cube.CubeColor descriptor[][] = testCube.getDescriptor();
         assertTrue(
               "Move " + Solver.MOVE_STRINGS[TEST_MOVES[i].ordinal()] + " is invalid.", 
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
