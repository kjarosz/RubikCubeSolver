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
      Edge.LF, Edge.DL, Edge.FD, Edge.FR,
      Edge.RD, Edge.UL, Edge.UB, Edge.UF,
      Edge.DB, Edge.BL, Edge.RB, Edge.UR,
      Edge.FL, Edge.LD, Edge.DF, Edge.RF,
      Edge.DR, Edge.LU, Edge.BU, Edge.FU,
      Edge.BD, Edge.LB, Edge.BR, Edge.RU
   };
   
   @Test
   public void testEdgeIndices() {
      Cube cube = new Cube();
      
      for(Move move: MOVESET) {
         cube.performTransform(move);
      }
      
      for(Edge edge: Cube.Edge.values()) {
         assertTrue(edge + " has not been found correctly.", SOLUTIONS[edge.ordinal()] == cube.findEdge(edge));
      }
   }

}
