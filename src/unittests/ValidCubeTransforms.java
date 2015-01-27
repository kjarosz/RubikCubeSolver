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
            Cube.BACK,          Cube.BACK,          Cube.DOWN, 
            Cube.BACK,          Cube.BACK,          Cube.DOWN, 
            Cube.BACK,          Cube.BACK,          Cube.DOWN
         },
         { // DOWN
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN, 
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN, 
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN
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
            Cube.LEFT,          Cube.LEFT,          Cube.DOWN, 
            Cube.LEFT,          Cube.LEFT,          Cube.DOWN
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
            Cube.BACK,          Cube.BACK,          Cube.DOWN, 
            Cube.BACK,          Cube.BACK,          Cube.DOWN, 
            Cube.BACK,          Cube.BACK,          Cube.DOWN
         },
         { // DOWN
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN, 
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN
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
            Cube.LEFT,          Cube.LEFT,          Cube.DOWN, 
            Cube.LEFT,          Cube.LEFT,          Cube.DOWN
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.RIGHT
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.DOWN, 
            Cube.TOP,          Cube.BACK,          Cube.DOWN, 
            Cube.TOP,          Cube.BACK,          Cube.DOWN
         },
         { // DOWN
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.DOWN,          Cube.BACK, 
            Cube.FRONT,          Cube.DOWN,          Cube.BACK
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
            Cube.TOP,          Cube.LEFT,          Cube.DOWN, 
            Cube.BACK,          Cube.LEFT,          Cube.DOWN
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.DOWN, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BACK
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN
         },
         { // DOWN
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.DOWN,          Cube.BACK, 
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
            Cube.TOP,          Cube.LEFT,          Cube.DOWN, 
            Cube.BACK,          Cube.LEFT,          Cube.DOWN
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.DOWN, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN
         },
         { // DOWN
            Cube.RIGHT,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.DOWN,          Cube.BACK, 
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
            Cube.TOP,          Cube.LEFT,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN
         },
         { // FRONT
            Cube.TOP,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN, 
            Cube.BACK,          Cube.LEFT,          Cube.DOWN
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.DOWN, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.FRONT
         },
         { // DOWN
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.DOWN,          Cube.RIGHT, 
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
            Cube.RIGHT,          Cube.DOWN,          Cube.DOWN, 
            Cube.TOP,          Cube.LEFT,          Cube.DOWN, 
            Cube.TOP,          Cube.TOP,          Cube.DOWN
         },
         { // FRONT
            Cube.LEFT,          Cube.TOP,          Cube.BACK, 
            Cube.LEFT,          Cube.FRONT,          Cube.DOWN, 
            Cube.LEFT,          Cube.LEFT,          Cube.DOWN
         },
         { // RIGHT
            Cube.TOP,          Cube.TOP,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.DOWN, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.LEFT
         },
         { // DOWN
            Cube.FRONT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.BACK,          Cube.DOWN,          Cube.RIGHT, 
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
            Cube.RIGHT,          Cube.DOWN,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.DOWN,          Cube.DOWN, 
            Cube.TOP,          Cube.FRONT,          Cube.LEFT, 
            Cube.LEFT,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.TOP,          Cube.LEFT, 
            Cube.FRONT,          Cube.RIGHT,          Cube.DOWN, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
         },
         { // BACK
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.BACK,          Cube.LEFT, 
            Cube.RIGHT,          Cube.RIGHT,          Cube.LEFT
         },
         { // DOWN
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.BACK,          Cube.DOWN,          Cube.RIGHT, 
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
            Cube.RIGHT,          Cube.DOWN,          Cube.RIGHT, 
            Cube.TOP,          Cube.LEFT,          Cube.FRONT, 
            Cube.TOP,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.DOWN,          Cube.BACK, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.LEFT,          Cube.DOWN,          Cube.DOWN, 
            Cube.TOP,          Cube.RIGHT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.FRONT
         },
         { // BACK
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.RIGHT,          Cube.BACK,          Cube.LEFT, 
            Cube.DOWN,          Cube.RIGHT,          Cube.LEFT
         },
         { // DOWN
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.BACK,          Cube.DOWN,          Cube.LEFT, 
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
            Cube.FRONT,          Cube.DOWN,          Cube.RIGHT, 
            Cube.BACK,          Cube.LEFT,          Cube.FRONT, 
            Cube.LEFT,          Cube.TOP,          Cube.BACK
         },
         { // FRONT
            Cube.BACK,          Cube.DOWN,          Cube.BACK, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.LEFT,          Cube.DOWN,          Cube.TOP, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // BACK
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.DOWN
         },
         { // DOWN
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.BACK,          Cube.DOWN,          Cube.LEFT, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
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
            Cube.FRONT,          Cube.DOWN,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.LEFT,          Cube.FRONT
         },
         { // RIGHT
            Cube.BACK,          Cube.DOWN,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // BACK
            Cube.LEFT,          Cube.DOWN,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.BACK,          Cube.RIGHT,          Cube.DOWN
         },
         { // DOWN
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.BACK,          Cube.DOWN,          Cube.LEFT, 
            Cube.FRONT,          Cube.FRONT,          Cube.DOWN
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
            Cube.FRONT,          Cube.DOWN,          Cube.RIGHT, 
            Cube.TOP,          Cube.FRONT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.FRONT,          Cube.RIGHT
         },
         { // RIGHT
            Cube.BACK,          Cube.DOWN,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.DOWN
         },
         { // BACK
            Cube.LEFT,          Cube.DOWN,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.RIGHT, 
            Cube.LEFT,          Cube.TOP,          Cube.BACK
         },
         { // DOWN
            Cube.DOWN,          Cube.LEFT,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.FRONT, 
            Cube.DOWN,          Cube.BACK,          Cube.FRONT
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
            Cube.DOWN,          Cube.DOWN,          Cube.RIGHT, 
            Cube.DOWN,          Cube.FRONT,          Cube.RIGHT, 
            Cube.DOWN,          Cube.FRONT,          Cube.RIGHT
         },
         { // RIGHT
            Cube.BACK,          Cube.DOWN,          Cube.BACK, 
            Cube.TOP,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.DOWN
         },
         { // BACK
            Cube.LEFT,          Cube.DOWN,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // DOWN
            Cube.BACK,          Cube.LEFT,          Cube.DOWN, 
            Cube.RIGHT,          Cube.DOWN,          Cube.FRONT, 
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
            Cube.DOWN,          Cube.FRONT,          Cube.FRONT, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN
         },
         { // RIGHT
            Cube.DOWN,          Cube.DOWN,          Cube.BACK, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK, 
            Cube.BACK,          Cube.RIGHT,          Cube.DOWN
         },
         { // BACK
            Cube.LEFT,          Cube.DOWN,          Cube.TOP, 
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // DOWN
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT, 
            Cube.RIGHT,          Cube.DOWN,          Cube.FRONT, 
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
            Cube.DOWN,          Cube.FRONT,          Cube.RIGHT, 
            Cube.DOWN,          Cube.DOWN,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.DOWN, 
            Cube.DOWN,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.DOWN,          Cube.LEFT,          Cube.BACK
         },
         { // BACK
            Cube.FRONT,          Cube.DOWN,          Cube.TOP, 
            Cube.FRONT,          Cube.BACK,          Cube.TOP, 
            Cube.LEFT,          Cube.TOP,          Cube.RIGHT
         },
         { // DOWN
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.DOWN,          Cube.FRONT, 
            Cube.TOP,          Cube.BACK,          Cube.DOWN
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
            Cube.DOWN,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.DOWN,          Cube.FRONT,          Cube.RIGHT, 
            Cube.DOWN,          Cube.DOWN,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.DOWN,          Cube.RIGHT,          Cube.BACK, 
            Cube.DOWN,          Cube.LEFT,          Cube.LEFT
         },
         { // BACK
            Cube.TOP,          Cube.TOP,          Cube.RIGHT, 
            Cube.DOWN,          Cube.BACK,          Cube.TOP, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // DOWN
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.DOWN,          Cube.FRONT, 
            Cube.BACK,          Cube.RIGHT,          Cube.DOWN
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
            Cube.DOWN,          Cube.BACK,          Cube.RIGHT
         },
         { // FRONT
            Cube.TOP,          Cube.FRONT,          Cube.TOP, 
            Cube.DOWN,          Cube.FRONT,          Cube.RIGHT, 
            Cube.DOWN,          Cube.DOWN,          Cube.BACK
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.DOWN,          Cube.RIGHT,          Cube.BACK, 
            Cube.DOWN,          Cube.LEFT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.DOWN,          Cube.BACK,          Cube.TOP, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // DOWN
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.RIGHT,          Cube.DOWN,          Cube.FRONT, 
            Cube.BACK,          Cube.RIGHT,          Cube.DOWN
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
            Cube.DOWN,          Cube.DOWN,          Cube.BACK
         },
         { // FRONT
            Cube.TOP,          Cube.FRONT,          Cube.TOP, 
            Cube.DOWN,          Cube.FRONT,          Cube.RIGHT, 
            Cube.DOWN,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.DOWN,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.DOWN,          Cube.BACK,          Cube.TOP, 
            Cube.DOWN,          Cube.BACK,          Cube.RIGHT
         },
         { // DOWN
            Cube.RIGHT,          Cube.FRONT,          Cube.DOWN, 
            Cube.LEFT,          Cube.DOWN,          Cube.RIGHT, 
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
            Cube.DOWN,          Cube.BACK,          Cube.TOP, 
            Cube.DOWN,          Cube.LEFT,          Cube.TOP, 
            Cube.BACK,          Cube.FRONT,          Cube.RIGHT
         },
         { // FRONT
            Cube.LEFT,          Cube.FRONT,          Cube.TOP, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.FRONT,          Cube.LEFT,          Cube.LEFT
         },
         { // RIGHT
            Cube.RIGHT,          Cube.RIGHT,          Cube.TOP, 
            Cube.DOWN,          Cube.RIGHT,          Cube.BACK, 
            Cube.FRONT,          Cube.FRONT,          Cube.LEFT
         },
         { // BACK
            Cube.BACK,          Cube.BACK,          Cube.FRONT, 
            Cube.DOWN,          Cube.BACK,          Cube.LEFT, 
            Cube.DOWN,          Cube.BACK,          Cube.RIGHT
         },
         { // DOWN
            Cube.TOP,          Cube.FRONT,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.RIGHT, 
            Cube.DOWN,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // F 
         { // TOP
            Cube.RIGHT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.TOP, 
            Cube.RIGHT,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.DOWN,          Cube.BACK,          Cube.TOP, 
            Cube.DOWN,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.FRONT,          Cube.DOWN
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
            Cube.DOWN,          Cube.BACK,          Cube.LEFT, 
            Cube.DOWN,          Cube.BACK,          Cube.RIGHT
         },
         { // DOWN
            Cube.FRONT,          Cube.DOWN,          Cube.RIGHT, 
            Cube.DOWN,          Cube.DOWN,          Cube.RIGHT, 
            Cube.DOWN,          Cube.RIGHT,          Cube.BACK
         }
      },
      { // R 
         { // TOP
            Cube.RIGHT,          Cube.LEFT,          Cube.LEFT, 
            Cube.TOP,          Cube.TOP,          Cube.FRONT, 
            Cube.RIGHT,          Cube.TOP,          Cube.TOP
         },
         { // LEFT
            Cube.DOWN,          Cube.BACK,          Cube.TOP, 
            Cube.DOWN,          Cube.LEFT,          Cube.FRONT, 
            Cube.BACK,          Cube.FRONT,          Cube.DOWN
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
         { // DOWN
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.DOWN,          Cube.RIGHT,          Cube.BACK
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
            Cube.RIGHT,          Cube.FRONT,          Cube.DOWN
         },
         { // FRONT
            Cube.FRONT,          Cube.LEFT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // RIGHT
            Cube.BACK,          Cube.TOP,          Cube.BACK, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.DOWN
         },
         { // BACK
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.LEFT,          Cube.FRONT
         },
         { // DOWN
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.BACK
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
            Cube.RIGHT,          Cube.FRONT,          Cube.DOWN
         },
         { // FRONT
            Cube.BACK,          Cube.TOP,          Cube.BACK, 
            Cube.LEFT,          Cube.FRONT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // RIGHT
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.BACK,          Cube.DOWN
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.RIGHT,          Cube.LEFT,          Cube.FRONT
         },
         { // DOWN
            Cube.FRONT,          Cube.DOWN,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.DOWN,          Cube.DOWN,          Cube.BACK
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
            Cube.RIGHT,          Cube.FRONT,          Cube.DOWN
         },
         { // RIGHT
            Cube.LEFT,          Cube.TOP,          Cube.TOP, 
            Cube.FRONT,          Cube.RIGHT,          Cube.RIGHT, 
            Cube.LEFT,          Cube.RIGHT,          Cube.BACK
         },
         { // BACK
            Cube.LEFT,          Cube.BACK,          Cube.TOP, 
            Cube.BACK,          Cube.BACK,          Cube.BACK, 
            Cube.LEFT,          Cube.BACK,          Cube.DOWN
         },
         { // DOWN
            Cube.DOWN,          Cube.DOWN,          Cube.FRONT, 
            Cube.DOWN,          Cube.DOWN,          Cube.DOWN, 
            Cube.BACK,          Cube.DOWN,          Cube.DOWN
         }
      }
   };
}
