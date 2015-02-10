package unittests;

import solver.algorithms.CubeConstants;

public class ValidCubeTransforms {
   public static byte TEST_RESULTS[][][] = {
      { // L 
         { // TOP
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.FRONT
         },
         { // RIGHT
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.RIGHT
         },
         { // BACK
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN
         }
      },
      { // F 
         { // TOP
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT
         },
         { // LEFT
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.FRONT, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.FRONT
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.RIGHT
         },
         { // BACK
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN
         }
      },
      { // R 
         { // TOP
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // LEFT
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // RIGHT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.RIGHT
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.DOWN, 
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.DOWN, 
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.BACK
         }
      },
      { // B 
         { // TOP
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // LEFT
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // RIGHT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.DOWN, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.FRONT
         },
         { // BACK
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.LEFT, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT
         }
      },
      { // U 
         { // TOP
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // LEFT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // RIGHT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.LEFT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.DOWN, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.FRONT
         },
         { // BACK
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT
         }
      },
      { // D 
         { // TOP
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // LEFT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.DOWN
         },
         { // RIGHT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.LEFT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.FRONT
         },
         { // DOWN
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.BACK
         }
      },
      { // Li
         { // TOP
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // LEFT
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.DOWN, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.DOWN
         },
         { // RIGHT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.LEFT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.LEFT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.LEFT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.BACK
         }
      },
      { // Fi
         { // TOP
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.FRONT
         },
         { // LEFT
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // FRONT
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT
         },
         { // RIGHT
            CubeConstants.RIGHT,          CubeConstants.TOP,          CubeConstants.LEFT, 
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.DOWN, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.LEFT, 
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.LEFT
         },
         { // DOWN
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.BACK
         }
      },
      { // Ri
         { // TOP
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // FRONT
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // RIGHT
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.FRONT, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.FRONT
         },
         { // BACK
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.RIGHT,          CubeConstants.BACK,          CubeConstants.LEFT, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.LEFT
         },
         { // DOWN
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.LEFT, 
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.LEFT
         }
      },
      { // Bi
         { // TOP
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // FRONT
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // RIGHT
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.TOP, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // BACK
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.LEFT, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         }
      },
      { // Ui
         { // TOP
            CubeConstants.RIGHT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // FRONT
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.LEFT, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.DOWN
         }
      },
      { // Di
         { // TOP
            CubeConstants.RIGHT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // FRONT
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // DOWN
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.FRONT
         }
      },
      { // Li
         { // TOP
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.LEFT
         },
         { // FRONT
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.RIGHT
         },
         { // DOWN
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.DOWN, 
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.FRONT
         }
      },
      { // Fi
         { // TOP
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // LEFT
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // FRONT
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.FRONT,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN
         },
         { // RIGHT
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.RIGHT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.FRONT
         }
      },
      { // Ri
         { // TOP
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.LEFT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.LEFT, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.LEFT
         },
         { // LEFT
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // FRONT
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.BACK
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.BACK
         },
         { // BACK
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.RIGHT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.DOWN
         }
      },
      { // Bi
         { // TOP
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.LEFT, 
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.LEFT
         },
         { // LEFT
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // FRONT
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.BACK
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.LEFT
         },
         { // BACK
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.LEFT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.DOWN
         }
      },
      { // Ui
         { // TOP
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // LEFT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.BACK
         },
         { // RIGHT
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.LEFT
         },
         { // BACK
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.LEFT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.DOWN,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.RIGHT,          CubeConstants.DOWN
         }
      },
      { // Di
         { // TOP
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // LEFT
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.BACK,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.BACK
         },
         { // FRONT
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.LEFT
         },
         { // RIGHT
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.LEFT
         },
         { // BACK
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // DOWN
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.DOWN, 
            CubeConstants.LEFT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.BACK
         }
      },
      { // L 
         { // TOP
            CubeConstants.RIGHT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.TOP,          CubeConstants.BACK
         },
         { // LEFT
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.FRONT,          CubeConstants.RIGHT
         },
         { // FRONT
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.LEFT
         },
         { // RIGHT
            CubeConstants.RIGHT,          CubeConstants.RIGHT,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.FRONT,          CubeConstants.LEFT
         },
         { // BACK
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.LEFT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // DOWN
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.BACK
         }
      },
      { // F 
         { // TOP
            CubeConstants.RIGHT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.RIGHT,          CubeConstants.TOP,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.FRONT, 
            CubeConstants.LEFT,          CubeConstants.RIGHT,          CubeConstants.TOP
         },
         { // RIGHT
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.TOP, 
            CubeConstants.TOP,          CubeConstants.RIGHT,          CubeConstants.BACK, 
            CubeConstants.BACK,          CubeConstants.FRONT,          CubeConstants.LEFT
         },
         { // BACK
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.LEFT, 
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.RIGHT, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.BACK
         }
      },
      { // R 
         { // TOP
            CubeConstants.RIGHT,          CubeConstants.LEFT,          CubeConstants.LEFT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.FRONT, 
            CubeConstants.RIGHT,          CubeConstants.TOP,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.DOWN,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.DOWN,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.BACK,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.RIGHT,          CubeConstants.BACK
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.FRONT, 
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.TOP
         },
         { // BACK
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.BACK,          CubeConstants.LEFT, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.RIGHT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.RIGHT,          CubeConstants.BACK
         }
      },
      { // B 
         { // TOP
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.TOP, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.FRONT, 
            CubeConstants.RIGHT,          CubeConstants.TOP,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.RIGHT,          CubeConstants.BACK
         },
         { // RIGHT
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.RIGHT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.BACK
         }
      },
      { // U 
         { // TOP
            CubeConstants.RIGHT,          CubeConstants.TOP,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // FRONT
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.RIGHT,          CubeConstants.BACK
         },
         { // RIGHT
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.DOWN
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.RIGHT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // DOWN
            CubeConstants.FRONT,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.BACK
         }
      },
      { // D 
         { // TOP
            CubeConstants.RIGHT,          CubeConstants.TOP,          CubeConstants.FRONT, 
            CubeConstants.TOP,          CubeConstants.TOP,          CubeConstants.RIGHT, 
            CubeConstants.TOP,          CubeConstants.FRONT,          CubeConstants.TOP
         },
         { // LEFT
            CubeConstants.FRONT,          CubeConstants.LEFT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.LEFT,          CubeConstants.FRONT, 
            CubeConstants.RIGHT,          CubeConstants.LEFT,          CubeConstants.FRONT
         },
         { // FRONT
            CubeConstants.BACK,          CubeConstants.TOP,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.FRONT,          CubeConstants.RIGHT, 
            CubeConstants.RIGHT,          CubeConstants.FRONT,          CubeConstants.DOWN
         },
         { // RIGHT
            CubeConstants.LEFT,          CubeConstants.TOP,          CubeConstants.TOP, 
            CubeConstants.FRONT,          CubeConstants.RIGHT,          CubeConstants.RIGHT, 
            CubeConstants.LEFT,          CubeConstants.RIGHT,          CubeConstants.BACK
         },
         { // BACK
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.TOP, 
            CubeConstants.BACK,          CubeConstants.BACK,          CubeConstants.BACK, 
            CubeConstants.LEFT,          CubeConstants.BACK,          CubeConstants.DOWN
         },
         { // DOWN
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.FRONT, 
            CubeConstants.DOWN,          CubeConstants.DOWN,          CubeConstants.DOWN, 
            CubeConstants.BACK,          CubeConstants.DOWN,          CubeConstants.DOWN
         }
      }
   };
}
