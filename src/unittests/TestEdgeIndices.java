package unittests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solver.algorithms.Algorithm;
import solver.algorithms.Cube;
import solver.algorithms.CubeConstants;

public class TestEdgeIndices {

   final static byte MOVESET[] = {
      Algorithm.Ri, Algorithm.B, Algorithm.U, Algorithm.F, Algorithm.R, Algorithm.D, Algorithm.Li, 
      Algorithm.F, Algorithm.Li, Algorithm.Fi, Algorithm.U, Algorithm.D, Algorithm.R,
      Algorithm.Bi, Algorithm.Ri, Algorithm.D, Algorithm.F, Algorithm.Di, Algorithm.R, Algorithm.Di, 
      Algorithm.Ui, Algorithm.Ri, Algorithm.Li, Algorithm.Bi, Algorithm.L  
   };
   
   final static byte SOLUTIONS[] = {
      CubeConstants.DL, CubeConstants.BL, CubeConstants.DR, CubeConstants.DB,
      CubeConstants.BU, CubeConstants.FD, CubeConstants.FL, CubeConstants.UR,
      CubeConstants.FU, CubeConstants.UL, CubeConstants.RB, CubeConstants.FR,
      CubeConstants.LD, CubeConstants.LB, CubeConstants.RD, CubeConstants.BD,
      CubeConstants.UB, CubeConstants.DF, CubeConstants.LF, CubeConstants.RU,
      CubeConstants.UF, CubeConstants.LU, CubeConstants.BR, CubeConstants.RF
   };
   
   @Test
   public void testEdgeIndices() {
      Cube cube = new Cube();
      
      for(byte move: MOVESET) {
         cube.performTransform(move);
      }
      
      for(byte edge = 0; edge < 24; edge++) {
         
         byte location = cube.findEdge(edge);
         assertTrue("Failed at " + edge + ".\n" + SOLUTIONS[edge] + " != " + location, SOLUTIONS[edge] == location);
      }
   }

}
