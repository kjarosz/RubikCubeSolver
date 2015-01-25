package unittests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import solver.algorithms.Algorithm.Move;
import solver.algorithms.Cube;
import solver.algorithms.Cube.Edge;

public class TestEdgeIndices {

   final static Move MOVESET[] = {
      Move.Ri, Move.B, Move.U, Move.F, Move.R, Move.D, Move.Li, 
      Move.F, Move.Li, Move.Fi, Move.U, Move.D, Move.R,
      Move.Bi, Move.Ri, Move.D, Move.F, Move.Di, Move.R, Move.Di, 
      Move.Ui, Move.Ri, Move.Li, Move.Bi, Move.L  
   };
   
   final static Edge SOLUTIONS[] = {
      Edge.DL, Edge.BL, Edge.DR, Edge.DB,
      Edge.BU, Edge.FD, Edge.FL, Edge.UR,
      Edge.FU, Edge.UL, Edge.RB, Edge.FR,
      Edge.LD, Edge.LB, Edge.RD, Edge.BD,
      Edge.UB, Edge.DF, Edge.LF, Edge.RU,
      Edge.UF, Edge.LU, Edge.BR, Edge.RF
   };
   
   @Test
   public void testEdgeIndices() {
      Cube cube = new Cube();
      
      for(Move move: MOVESET) {
         cube.performTransform(move);
      }
      
      for(Edge edge: Cube.Edge.values()) {
         
         Edge location = cube.findEdge(edge);
         assertTrue("Failed at " + edge + ".\n" + SOLUTIONS[edge.ordinal()] + " != " + location, SOLUTIONS[edge.ordinal()] == location);
      }
   }

}
