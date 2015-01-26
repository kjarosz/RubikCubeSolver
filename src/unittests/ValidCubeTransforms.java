package unittests;

import solver.algorithms.Cube;

public class ValidCubeTransforms {
   public static byte TEST_RESULTS[][][] = {
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
            Cube.BACK,          Cube.BACK,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BACK,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BACK,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM
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
            Cube.LEFT,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.LEFT,          Cube.LEFT,          Cube.BOTTOM
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
            Cube.BACK,          Cube.BACK,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BACK,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BACK,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM
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
            Cube.LEFT,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.LEFT,          Cube.LEFT,          Cube.BOTTOM
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.BOTTOM, 
            Cube.TOP,          Cube.BACK,          Cube.BOTTOM, 
            Cube.TOP,          Cube.BACK,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BACK, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BACK
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
            Cube.TOP,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.BACK,          Cube.LEFT,          Cube.BOTTOM
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BOTTOM, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BACK
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BACK, 
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
            Cube.TOP,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.BACK,          Cube.LEFT,          Cube.BOTTOM
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BOTTOM, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.BOTTOM,          Cube.BACK, 
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
            Cube.TOP,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM, 
            Cube.BACK,          Cube.LEFT,          Cube.BOTTOM
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BOTTOM
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BOTTOM,          Cube.RIGHT, 
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
            Cube.RIGHT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.TOP,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.TOP,          Cube.TOP,          Cube.BOTTOM
         },
         { // FRONT
            Cube.LEFT,          Cube.TOP,          Cube.BACK, 
            Cube.LEFT,          Cube.FRONT,          Cube.BOTTOM, 
            Cube.LEFT,          Cube.LEFT,          Cube.BOTTOM
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.BOTTOM,          Cube.RIGHT, 
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
            Cube.RIGHT,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.TOP,          Cube.FRONT,          Cube.LEFT, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.TOP,          Cube.LEFT, 
            Cube.FRONT,          Cube.RIGHT,          Cube.BOTTOM, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BOTTOM,          Cube.RIGHT, 
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
            Cube.RIGHT,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.BOTTOM,          Cube.BACK, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.LEFT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.TOP,          Cube.RIGHT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.FRONT
         },
         { // BACK
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.BACK,          Cube.LEFT, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BOTTOM,          Cube.LEFT, 
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
            Cube.FRONT,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.LEFT,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.BOTTOM,          Cube.BACK, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.LEFT,          Cube.BOTTOM,          Cube.TOP, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // BACK
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BOTTOM,          Cube.LEFT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
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
            Cube.FRONT,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.BACK,          Cube.BOTTOM,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // BACK
            Cube.LEFT,          Cube.BOTTOM,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BOTTOM,          Cube.LEFT, 
            Cube.FRONT,          Cube.FRONT,          Cube.BOTTOM
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
            Cube.FRONT,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // RIGHT
            Cube.BACK,          Cube.BOTTOM,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.BOTTOM
         },
         { // BACK
            Cube.LEFT,          Cube.BOTTOM,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.LEFT,          Cube.TOP,          Cube.BACK
         },
         { // BOTTOM
            Cube.BOTTOM,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.FRONT, 
            Cube.BOTTOM,          Cube.BACK,          Cube.FRONT
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
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.FRONT,          Cube.RIGHT
         },
         { // RIGHT
            Cube.BACK,          Cube.BOTTOM,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.BOTTOM
         },
         { // BACK
            Cube.LEFT,          Cube.BOTTOM,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.BACK,          Cube.LEFT,          Cube.BOTTOM, 
            Cube.RIGHT,          Cube.BOTTOM,          Cube.FRONT, 
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
            Cube.BOTTOM,          Cube.FRONT,          Cube.FRONT, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM
         },
         { // RIGHT
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BACK, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.BOTTOM
         },
         { // BACK
            Cube.LEFT,          Cube.BOTTOM,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.RIGHT,          Cube.BOTTOM,          Cube.FRONT, 
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
            Cube.BOTTOM,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.LEFT,          Cube.BACK
         },
         { // BACK
            Cube.FRONT,          Cube.BOTTOM,          Cube.TOP, 
            Cube.FRONT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.BOTTOM,          Cube.FRONT, 
            Cube.TOP,          Cube.BACK,          Cube.BOTTOM
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
            Cube.BOTTOM,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BOTTOM,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.BACK, 
            Cube.BOTTOM,          Cube.LEFT,          Cube.LEFT
         },
         { // BACK
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.BACK,          Cube.TOP, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.BOTTOM,          Cube.FRONT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BOTTOM
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
            Cube.BOTTOM,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.TOP,          Cube.FRONT,          Cube.TOP, 
            Cube.BOTTOM,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BACK
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.BACK, 
            Cube.BOTTOM,          Cube.LEFT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BOTTOM,          Cube.BACK,          Cube.TOP, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.BOTTOM,          Cube.FRONT, 
            Cube.BACK,          Cube.RIGHT,          Cube.BOTTOM
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
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.FRONT,          Cube.TOP, 
            Cube.BOTTOM,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BOTTOM,          Cube.BACK,          Cube.TOP, 
            Cube.BOTTOM,          Cube.BACK,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.RIGHT,          Cube.FRONT,          Cube.BOTTOM, 
            Cube.LEFT,          Cube.BOTTOM,          Cube.RIGHT, 
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
            Cube.BOTTOM,          Cube.BACK,          Cube.TOP, 
            Cube.BOTTOM,          Cube.LEFT,          Cube.TOP, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT
         },
         { // FRONT
            Cube.LEFT,          Cube.FRONT,          Cube.TOP, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.BOTTOM,          Cube.BACK,          Cube.LEFT, 
            Cube.BOTTOM,          Cube.BACK,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.TOP,          Cube.FRONT,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // F 
         { // TOP
            Cube.RIGHT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.TOP, 
            Cube.RIGHT,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.BOTTOM,          Cube.BACK,          Cube.TOP, 
            Cube.BOTTOM,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.FRONT,          Cube.BOTTOM
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
            Cube.BOTTOM,          Cube.BACK,          Cube.LEFT, 
            Cube.BOTTOM,          Cube.BACK,          Cube.RIGHT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.RIGHT, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // R 
         { // TOP
            Cube.RIGHT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.FRONT, 
            Cube.RIGHT,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.BOTTOM,          Cube.BACK,          Cube.TOP, 
            Cube.BOTTOM,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.FRONT,          Cube.BOTTOM
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
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.RIGHT,          Cube.BACK
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
            Cube.RIGHT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // FRONT
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.BOTTOM
         },
         { // BACK
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.LEFT,          Cube.FRONT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BACK
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
            Cube.RIGHT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // FRONT
            Cube.BACK,          Cube.TOP,          Cube.BACK, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // RIGHT
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.BOTTOM
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.LEFT,          Cube.FRONT
         },
         { // BOTTOM
            Cube.FRONT,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BACK
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
            Cube.RIGHT,          Cube.FRONT,          Cube.BOTTOM
         },
         { // RIGHT
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.BACK,          Cube.BOTTOM
         },
         { // BOTTOM
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.FRONT, 
            Cube.BOTTOM,          Cube.BOTTOM,          Cube.BOTTOM, 
            Cube.BACK,          Cube.BOTTOM,          Cube.BOTTOM
         }
      }
   };
}
