package solver;

public class ValidCubeTransforms {
   public static int TEST_RESULTS[][][] = {
      { // L 
         { // TOP
            Cube.BACK,          Cube.TOP,          Cube.TOP, 
            Cube.BACK,          Cube.TOP,          Cube.TOP, 
            Cube.BACK,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT
         },
         { // FRONT
            Cube.TOP,          Cube.FRONT,          Cube.FRONT, 
            Cube.TOP,          Cube.FRONT,          Cube.FRONT, 
            Cube.TOP,          Cube.FRONT,          Cube.FRONT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK
         }
      },
      { // F 
         { // TOP
            Cube.BACK,          Cube.TOP,          Cube.TOP, 
            Cube.BACK,          Cube.TOP,          Cube.TOP, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT
         },
         { // LEFT
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT, 
            Cube.LEFT,          Cube.LEFT,          Cube.BACK, 
            Cube.LEFT,          Cube.LEFT,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.FRONT,          Cube.FRONT, 
            Cube.FRONT,          Cube.FRONT,          Cube.FRONT
         },
         { // RIGHT
            Cube.BACK,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.TOP,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.TOP,          Cube.RIGHT,          Cube.RIGHT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK
         }
      },
      { // R 
         { // TOP
            Cube.BACK,          Cube.TOP,          Cube.TOP, 
            Cube.BACK,          Cube.TOP,          Cube.FRONT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // LEFT
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT, 
            Cube.LEFT,          Cube.LEFT,          Cube.BACK, 
            Cube.LEFT,          Cube.LEFT,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.BACK,          Cube.BACK
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK
         }
      },
      { // B 
         { // TOP
            Cube.BACK,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.BACK,          Cube.TOP,          Cube.FRONT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // LEFT
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.TOP,          Cube.LEFT,          Cube.BACK, 
            Cube.BACK,          Cube.LEFT,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BACK
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT
         }
      },
      { // U 
         { // TOP
            Cube.LEFT,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.RIGHT
         },
         { // LEFT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.BACK, 
            Cube.BACK,          Cube.LEFT,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT
         }
      },
      { // D 
         { // TOP
            Cube.LEFT,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.RIGHT
         },
         { // LEFT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK, 
            Cube.BACK,          Cube.LEFT,          Cube.BACK
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BOTTOM
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.BACK
         }
      },
      { // Li
         { // TOP
            Cube.TOP,          Cube.BACK,          Cube.BACK, 
            Cube.FRONT,          Cube.TOP,          Cube.RIGHT, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT
         },
         { // LEFT
            Cube.RIGHT,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.LEFT,          Cube.BACK, 
            Cube.TOP,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.LEFT,          Cube.TOP,          Cube.BACK, 
            Cube.LEFT,          Cube.FRONT,          Cube.BACK, 
            Cube.LEFT,          Cube.LEFT,          Cube.BACK
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK
         }
      },
      { // Fi
         { // TOP
            Cube.TOP,          Cube.BACK,          Cube.BACK, 
            Cube.FRONT,          Cube.TOP,          Cube.RIGHT, 
            Cube.TOP,          Cube.RIGHT,          Cube.FRONT
         },
         { // LEFT
            Cube.RIGHT,          Cube.BACK,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.FRONT,          Cube.LEFT, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.TOP,          Cube.LEFT, 
            Cube.FRONT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT, 
            Cube.FRONT,          Cube.BACK,          Cube.BACK
         }
      },
      { // Ri
         { // TOP
            Cube.TOP,          Cube.BACK,          Cube.RIGHT, 
            Cube.FRONT,          Cube.TOP,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.TOP
         },
         { // LEFT
            Cube.RIGHT,          Cube.BACK,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.LEFT,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.FRONT
         },
         { // BACK
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.BACK,          Cube.LEFT, 
            Cube.BACK,          Cube.RIGHT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.FRONT,          Cube.BACK,          Cube.LEFT
         }
      },
      { // Bi
         { // TOP
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.TOP,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.TOP
         },
         { // LEFT
            Cube.FRONT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.LEFT,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // BACK
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         },
         { // BOTTOM
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         }
      },
      { // Ui
         { // TOP
            Cube.RIGHT,          Cube.BACK,          Cube.TOP, 
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.TOP
         },
         { // LEFT
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.LEFT,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.FRONT,          Cube.BACK,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         },
         { // BOTTOM
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BACK
         }
      },
      { // Di
         { // TOP
            Cube.RIGHT,          Cube.BACK,          Cube.TOP, 
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.TOP
         },
         { // LEFT
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // FRONT
            Cube.FRONT,          Cube.BACK,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.LEFT,          Cube.TOP,          Cube.BACK
         },
         { // BOTTOM
            Cube.BACK,          Cube.LEFT,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.FRONT
         }
      },
      { // Li
         { // TOP
            Cube.FRONT,          Cube.BACK,          Cube.TOP, 
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.TOP
         },
         { // LEFT
            Cube.LEFT,          Cube.FRONT,          Cube.FRONT, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT, 
            Cube.FRONT,          Cube.BACK,          Cube.LEFT
         },
         { // FRONT
            Cube.BACK,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.BACK,          Cube.LEFT,          Cube.BACK, 
            Cube.RIGHT,          Cube.BACK,          Cube.FRONT, 
            Cube.TOP,          Cube.BACK,          Cube.FRONT
         }
      },
      { // Fi
         { // TOP
            Cube.FRONT,          Cube.BACK,          Cube.TOP, 
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.BACK,          Cube.TOP,          Cube.BACK
         },
         { // LEFT
            Cube.LEFT,          Cube.FRONT,          Cube.TOP, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT, 
            Cube.FRONT,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.BACK,          Cube.FRONT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.RIGHT,          Cube.BACK,          Cube.FRONT, 
            Cube.TOP,          Cube.BACK,          Cube.FRONT
         }
      },
      { // Ri
         { // TOP
            Cube.FRONT,          Cube.BACK,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.BACK,          Cube.TOP,          Cube.LEFT
         },
         { // LEFT
            Cube.LEFT,          Cube.FRONT,          Cube.TOP, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT, 
            Cube.FRONT,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.BACK,          Cube.LEFT,          Cube.BACK
         },
         { // BACK
            Cube.FRONT,          Cube.BACK,          Cube.TOP, 
            Cube.FRONT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.BACK,          Cube.FRONT, 
            Cube.TOP,          Cube.BACK,          Cube.BACK
         }
      },
      { // Bi
         { // TOP
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.BACK,          Cube.TOP,          Cube.LEFT
         },
         { // LEFT
            Cube.TOP,          Cube.FRONT,          Cube.TOP, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.LEFT,          Cube.LEFT
         },
         { // BACK
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.BACK,          Cube.BACK,          Cube.TOP, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // Ui
         { // TOP
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.TOP,          Cube.BACK
         },
         { // LEFT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.TOP,          Cube.FRONT,          Cube.TOP, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.LEFT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.TOP, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // Di
         { // TOP
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.TOP,          Cube.BACK
         },
         { // LEFT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.FRONT,          Cube.TOP, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.FRONT,          Cube.BACK, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.FRONT,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // L 
         { // TOP
            Cube.RIGHT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.TOP,          Cube.BACK
         },
         { // LEFT
            Cube.BACK,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.LEFT,          Cube.TOP, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT
         },
         { // FRONT
            Cube.LEFT,          Cube.FRONT,          Cube.TOP, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.TOP,          Cube.FRONT,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // F 
         { // TOP
            Cube.RIGHT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.TOP, 
            Cube.RIGHT,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.BACK,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.FRONT,          Cube.BACK
         },
         { // FRONT
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.FRONT,          Cube.FRONT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.TOP
         },
         { // RIGHT
            Cube.FRONT,          Cube.RIGHT,          Cube.TOP, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.FRONT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // R 
         { // TOP
            Cube.RIGHT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.FRONT, 
            Cube.RIGHT,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.BACK,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.FRONT,          Cube.BACK
         },
         { // FRONT
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.TOP,          Cube.FRONT, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.TOP
         },
         { // BACK
            Cube.TOP,          Cube.BACK,          Cube.FRONT, 
            Cube.TOP,          Cube.BACK,          Cube.LEFT, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // B 
         { // TOP
            Cube.FRONT,          Cube.RIGHT,          Cube.TOP, 
            Cube.TOP,          Cube.TOP,          Cube.FRONT, 
            Cube.RIGHT,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.BACK
         },
         { // FRONT
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.LEFT,          Cube.FRONT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         }
      },
      { // U 
         { // TOP
            Cube.RIGHT,          Cube.TOP,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.TOP
         },
         { // LEFT
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.TOP,          Cube.BACK, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // RIGHT
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.LEFT,          Cube.FRONT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         }
      },
      { // D 
         { // TOP
            Cube.RIGHT,          Cube.TOP,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.TOP
         },
         { // LEFT
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.LEFT,          Cube.FRONT
         },
         { // FRONT
            Cube.BACK,          Cube.TOP,          Cube.BACK, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.BACK
         },
         { // RIGHT
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.BACK,          Cube.BACK
         },
         { // BOTTOM
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BACK,          Cube.BACK,          Cube.BACK
         }
      }
   };
}
