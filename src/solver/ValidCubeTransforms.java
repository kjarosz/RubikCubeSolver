package solver;

public class ValidCubeTransforms {
   
   public final static Cube.CubeColor RESULTING_TRANSFORMS[][][] = {
      // L
      {     
            {   
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE
            }, 
            {
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.WHITE 
            }, 
            {
               Cube.CubeColor.BLUE, Cube.CubeColor.RED, Cube.CubeColor.RED, 
               Cube.CubeColor.BLUE, Cube.CubeColor.RED, Cube.CubeColor.RED, 
               Cube.CubeColor.BLUE, Cube.CubeColor.RED, Cube.CubeColor.RED 
            }, 
            {
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            }, 
            { 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN
            }, 
            {
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN
            } 
      },
      // F
      {     
            {   // TOP
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.WHITE
            }, 
            {  // LEFT
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN 
            }, 
            {  // FRONT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.RED, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.RED 
            }, 
            {  // RIGHT
               Cube.CubeColor.ORANGE, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.BLUE, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.BLUE, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            }, 
            {  // BACK
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN
            }, 
            {  // BOTTOM
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN
            } 
      },
      // R
      {     
            {   // TOP
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.RED, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED
            }, 
            {  // LEFT
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN 
            }, 
            {  // FRONT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.GREEN, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.GREEN 
            }, 
            {  // RIGHT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            }, 
            {  // BACK
               Cube.CubeColor.WHITE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN
            }, 
            {  // BOTTOM
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.ORANGE
            } 
      },
      // B
      {     
            {   // TOP
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.RED, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED
            }, 
            {  // LEFT
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN 
            }, 
            {  // FRONT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN 
            }, 
            {  // RIGHT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.GREEN
            }, 
            {  // BACK
               Cube.CubeColor.WHITE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            }, 
            {  // BOTTOM
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE
            } 
      },
      // U
      {     
            {   // TOP
               Cube.CubeColor.WHITE, Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.BLUE
            }, 
            {  // LEFT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN 
            }, 
            {  // FRONT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN 
            }, 
            {  // RIGHT
               Cube.CubeColor.WHITE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.GREEN
            }, 
            {  // BACK
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED,
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            }, 
            {  // BOTTOM
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE
            } 
      },
      // D
      {     
            {   // TOP
               Cube.CubeColor.WHITE, Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.BLUE
            }, 
            {  // LEFT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            }, 
            {  // FRONT
               Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN
            }, 
            {  // RIGHT
               Cube.CubeColor.WHITE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN 
            }, 
            {  // BACK
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED,
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.GREEN
            }, 
            {  // BOTTOM
               Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, Cube.CubeColor.RED, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, Cube.CubeColor.RED, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            } 
      },
      // Li
      {     
            {   // TOP
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.BLUE, Cube.CubeColor.RED, Cube.CubeColor.BLUE
            }, 
            {  // LEFT
               Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.YELLOW
            }, 
            {  // FRONT
               Cube.CubeColor.ORANGE, Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.RED, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN
            }, 
            {  // RIGHT
               Cube.CubeColor.WHITE, Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN 
            }, 
            {  // BACK
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED,
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.WHITE, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.WHITE
            }, 
            {  // BOTTOM
               Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, Cube.CubeColor.RED, 
               Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, Cube.CubeColor.RED, 
               Cube.CubeColor.RED, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            } 
      },
      // Fi
      {     
            {   // TOP
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.YELLOW, Cube.CubeColor.WHITE
            }, 
            {  // LEFT
               Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, Cube.CubeColor.BLUE, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.RED, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.BLUE
            }, 
            {  // FRONT
               Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, 
               Cube.CubeColor.BLUE, Cube.CubeColor.RED, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE
            }, 
            {  // RIGHT
               Cube.CubeColor.RED, Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, 
               Cube.CubeColor.GREEN, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.GREEN, Cube.CubeColor.WHITE, Cube.CubeColor.GREEN 
            }, 
            {  // BACK
               Cube.CubeColor.WHITE, Cube.CubeColor.WHITE, Cube.CubeColor.RED,
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.WHITE, 
               Cube.CubeColor.RED, Cube.CubeColor.RED, Cube.CubeColor.WHITE
            }, 
            {  // BOTTOM
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, 
               Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, Cube.CubeColor.RED, 
               Cube.CubeColor.RED, Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW
            } 
      },
      // Ri
      {     
            {   // TOP
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.RED, 
               Cube.CubeColor.RED, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.YELLOW, Cube.CubeColor.WHITE
            }, 
            {  // LEFT
               Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, Cube.CubeColor.BLUE, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.RED, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.BLUE
            }, 
            {  // FRONT
               Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.BLUE, Cube.CubeColor.RED, Cube.CubeColor.BLUE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.WHITE
            }, 
            {  // RIGHT
               Cube.CubeColor.GREEN, Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.YELLOW, Cube.CubeColor.WHITE, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN 
            }, 
            {  // BACK
               Cube.CubeColor.YELLOW, Cube.CubeColor.WHITE, Cube.CubeColor.RED,
               Cube.CubeColor.RED, Cube.CubeColor.ORANGE, Cube.CubeColor.WHITE, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.RED, Cube.CubeColor.WHITE
            }, 
            {  // BOTTOM
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, 
               Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.YELLOW, Cube.CubeColor.ORANGE
            } 
      },
      // Bi
      {     
            {   // TOP
               Cube.CubeColor.BLUE, Cube.CubeColor.ORANGE, Cube.CubeColor.RED, 
               Cube.CubeColor.RED, Cube.CubeColor.BLUE, Cube.CubeColor.BLUE, 
               Cube.CubeColor.WHITE, Cube.CubeColor.YELLOW, Cube.CubeColor.WHITE
            }, 
            {  // LEFT
               Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, Cube.CubeColor.BLUE, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.RED, 
               Cube.CubeColor.BLUE, Cube.CubeColor.WHITE, Cube.CubeColor.BLUE
            }, 
            {  // FRONT
               Cube.CubeColor.ORANGE, Cube.CubeColor.GREEN, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.BLUE, Cube.CubeColor.RED, Cube.CubeColor.BLUE, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.ORANGE, Cube.CubeColor.WHITE
            }, 
            {  // RIGHT
               Cube.CubeColor.GREEN, Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, 
               Cube.CubeColor.ORANGE, Cube.CubeColor.YELLOW, Cube.CubeColor.WHITE, 
               Cube.CubeColor.RED, Cube.CubeColor.GREEN, Cube.CubeColor.GREEN 
            }, 
            {  // BACK
               Cube.CubeColor.YELLOW, Cube.CubeColor.WHITE, Cube.CubeColor.RED,
               Cube.CubeColor.RED, Cube.CubeColor.ORANGE, Cube.CubeColor.WHITE, 
               Cube.CubeColor.YELLOW, Cube.CubeColor.RED, Cube.CubeColor.WHITE
            }, 
            {  // BOTTOM
               Cube.CubeColor.YELLOW, Cube.CubeColor.YELLOW, Cube.CubeColor.GREEN, 
               Cube.CubeColor.GREEN, Cube.CubeColor.GREEN, Cube.CubeColor.ORANGE, 
               Cube.CubeColor.RED, Cube.CubeColor.YELLOW, Cube.CubeColor.ORANGE
            } 
      }
   };
}
