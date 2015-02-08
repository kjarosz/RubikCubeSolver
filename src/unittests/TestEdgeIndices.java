package unittests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solver.algorithms.Algorithm;
import solver.algorithms.Cube;

public class TestEdgeIndices {

   final static byte MOVESET[] = {
      Algorithm.Ri, Algorithm.B, Algorithm.U, Algorithm.F, Algorithm.R, Algorithm.D, Algorithm.Li, 
      Algorithm.F, Algorithm.Li, Algorithm.Fi, Algorithm.U, Algorithm.D, Algorithm.R,
      Algorithm.Bi, Algorithm.Ri, Algorithm.D, Algorithm.F, Algorithm.Di, Algorithm.R, Algorithm.Di, 
      Algorithm.Ui, Algorithm.Ri, Algorithm.Li, Algorithm.Bi, Algorithm.L  
   };
   
   final static byte SOLUTIONS[] = {
      Cube.DL, Cube.BL, Cube.DR, Cube.DB,
      Cube.BU, Cube.FD, Cube.FL, Cube.UR,
      Cube.FU, Cube.UL, Cube.RB, Cube.FR,
      Cube.LD, Cube.LB, Cube.RD, Cube.BD,
      Cube.UB, Cube.DF, Cube.LF, Cube.RU,
      Cube.UF, Cube.LU, Cube.BR, Cube.RF
   };
   
   @Test
   public void testEdgeIndices() {
      Cube cube = new Cube();
      
      for(byte move: MOVESET) {
         cube.performTransform(move);
      }
      
      for(byte edge = 0; edge < 24; edge++) {
         
         byte location = cube.findEdge(edge);
         assertTrue("\nFailed at " + Cube.EDGE_STRINGS[edge] + ".\n" 
         + Cube.EDGE_STRINGS[SOLUTIONS[edge]] + " != " + Cube.EDGE_STRINGS[location], SOLUTIONS[edge] == location);
      }
   }

}
