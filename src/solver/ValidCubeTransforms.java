package solver;

public class ValidCubeTransforms {
   public static Cube.CubeColor TEST_RESULTS[][][] = {
      { // L 
         { // TOP
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.RED
         },
         { // RIGHT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW
         },
         { // BACK
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN
         }
      },
      { // F 
         { // TOP
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         },
         { // LEFT
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.RED, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.RED
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW
         },
         { // BACK
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN
         }
      },
      { // R 
         { // TOP
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // LEFT
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // RIGHT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE
         }
      },
      { // B 
         { // TOP
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // LEFT
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // RIGHT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.RED
         },
         { // BACK
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         }
      },
      { // U 
         { // TOP
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // LEFT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // RIGHT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.RED
         },
         { // BACK
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         }
      },
      { // D 
         { // TOP
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // LEFT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN
         },
         { // RIGHT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.RED
         },
         { // BOTTOM
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE
         }
      },
      { // Li
         { // TOP
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // LEFT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN
         },
         { // RIGHT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE
         }
      },
      { // Fi
         { // TOP
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.RED
         },
         { // LEFT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // FRONT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         },
         { // RIGHT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE
         },
         { // BOTTOM
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE
         }
      },
      { // Ri
         { // TOP
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // FRONT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // RIGHT
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.RED, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.RED
         },
         { // BACK
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE
         },
         { // BOTTOM
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE
         }
      },
      { // Bi
         { // TOP
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // FRONT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // RIGHT
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // BACK
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         }
      },
      { // Ui
         { // TOP
            Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // FRONT
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         }
      },
      { // Di
         { // TOP
            Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // FRONT
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // BOTTOM
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED
         }
      },
      { // Li
         { // TOP
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE
         },
         { // FRONT
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW
         },
         { // BOTTOM
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED
         }
      },
      { // Fi
         { // TOP
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // LEFT
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // FRONT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.RED,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN
         },
         { // RIGHT
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED
         }
      },
      { // Ri
         { // TOP
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE
         },
         { // LEFT
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // FRONT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE
         },
         { // BACK
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN
         }
      },
      { // Bi
         { // TOP
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.WHITE
         },
         { // LEFT
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // FRONT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         },
         { // BACK
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.WHITE
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN
         }
      },
      { // Ui
         { // TOP
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // LEFT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE
         },
         { // RIGHT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         },
         { // BACK
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.WHITE
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.GREEN
         }
      },
      { // Di
         { // TOP
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // LEFT
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE
         },
         { // FRONT
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         },
         { // RIGHT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.WHITE
         },
         { // BACK
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // BOTTOM
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         }
      },
      { // L 
         { // TOP
            Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE
         },
         { // LEFT
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW
         },
         { // FRONT
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE
         },
         { // RIGHT
            Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.RED,          Cube.CubeColor.WHITE
         },
         { // BACK
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // BOTTOM
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         }
      },
      { // F 
         { // TOP
            Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.RED, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE
         },
         { // RIGHT
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.RED,          Cube.CubeColor.WHITE
         },
         { // BACK
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         }
      },
      { // R 
         { // TOP
            Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.RED, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.RED, 
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE
         },
         { // BACK
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.WHITE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.YELLOW
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         }
      },
      { // B 
         { // TOP
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.RED, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         },
         { // RIGHT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE
         }
      },
      { // U 
         { // TOP
            Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // FRONT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         },
         { // RIGHT
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // BOTTOM
            Cube.CubeColor.RED,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.ORANGE
         }
      },
      { // D 
         { // TOP
            Cube.CubeColor.YELLOW,          Cube.CubeColor.BLUE,          Cube.CubeColor.RED, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.BLUE,          Cube.CubeColor.RED,          Cube.CubeColor.BLUE
         },
         { // LEFT
            Cube.CubeColor.RED,          Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.WHITE,          Cube.CubeColor.RED
         },
         { // FRONT
            Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.RED,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.YELLOW,          Cube.CubeColor.RED,          Cube.CubeColor.GREEN
         },
         { // RIGHT
            Cube.CubeColor.WHITE,          Cube.CubeColor.BLUE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.RED,          Cube.CubeColor.YELLOW,          Cube.CubeColor.YELLOW, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.YELLOW,          Cube.CubeColor.ORANGE
         },
         { // BACK
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.BLUE, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.ORANGE, 
            Cube.CubeColor.WHITE,          Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN
         },
         { // BOTTOM
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.RED, 
            Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN, 
            Cube.CubeColor.ORANGE,          Cube.CubeColor.GREEN,          Cube.CubeColor.GREEN
         }
      }
   };
}
