package unittests;

import static solver.algorithms.CubeConstants.TOP;
import static solver.algorithms.CubeConstants.LEFT;
import static solver.algorithms.CubeConstants.FRONT;
import static solver.algorithms.CubeConstants.RIGHT;
import static solver.algorithms.CubeConstants.BACK;
import static solver.algorithms.CubeConstants.DOWN;

public class ValidCubeTransforms {
   public static byte TEST_RESULTS[][][] = {
      { // L 
         { // TOP
            BACK,          TOP,          TOP, 
            BACK,          TOP,          TOP, 
            BACK,          TOP,          TOP
         },
         { // LEFT
            LEFT,          LEFT,          LEFT, 
            LEFT,          LEFT,          LEFT, 
            LEFT,          LEFT,          LEFT
         },
         { // FRONT
            TOP,          FRONT,          FRONT, 
            TOP,          FRONT,          FRONT, 
            TOP,          FRONT,          FRONT
         },
         { // RIGHT
            RIGHT,          RIGHT,          RIGHT, 
            RIGHT,          RIGHT,          RIGHT, 
            RIGHT,          RIGHT,          RIGHT
         },
         { // BACK
            BACK,          BACK,          DOWN, 
            BACK,          BACK,          DOWN, 
            BACK,          BACK,          DOWN
         },
         { // DOWN
            FRONT,          DOWN,          DOWN, 
            FRONT,          DOWN,          DOWN, 
            FRONT,          DOWN,          DOWN
         }
      },
      { // F 
         { // TOP
            BACK,          TOP,          TOP, 
            BACK,          TOP,          TOP, 
            LEFT,          LEFT,          LEFT
         },
         { // LEFT
            LEFT,          LEFT,          FRONT, 
            LEFT,          LEFT,          DOWN, 
            LEFT,          LEFT,          DOWN
         },
         { // FRONT
            TOP,          TOP,          TOP, 
            FRONT,          FRONT,          FRONT, 
            FRONT,          FRONT,          FRONT
         },
         { // RIGHT
            BACK,          RIGHT,          RIGHT, 
            TOP,          RIGHT,          RIGHT, 
            TOP,          RIGHT,          RIGHT
         },
         { // BACK
            BACK,          BACK,          DOWN, 
            BACK,          BACK,          DOWN, 
            BACK,          BACK,          DOWN
         },
         { // DOWN
            RIGHT,          RIGHT,          RIGHT, 
            FRONT,          DOWN,          DOWN, 
            FRONT,          DOWN,          DOWN
         }
      },
      { // R 
         { // TOP
            BACK,          TOP,          TOP, 
            BACK,          TOP,          FRONT, 
            LEFT,          LEFT,          FRONT
         },
         { // LEFT
            LEFT,          LEFT,          FRONT, 
            LEFT,          LEFT,          DOWN, 
            LEFT,          LEFT,          DOWN
         },
         { // FRONT
            TOP,          TOP,          RIGHT, 
            FRONT,          FRONT,          DOWN, 
            FRONT,          FRONT,          DOWN
         },
         { // RIGHT
            TOP,          TOP,          BACK, 
            RIGHT,          RIGHT,          RIGHT, 
            RIGHT,          RIGHT,          RIGHT
         },
         { // BACK
            LEFT,          BACK,          DOWN, 
            TOP,          BACK,          DOWN, 
            TOP,          BACK,          DOWN
         },
         { // DOWN
            RIGHT,          RIGHT,          BACK, 
            FRONT,          DOWN,          BACK, 
            FRONT,          DOWN,          BACK
         }
      },
      { // B 
         { // TOP
            BACK,          RIGHT,          RIGHT, 
            BACK,          TOP,          FRONT, 
            LEFT,          LEFT,          FRONT
         },
         { // LEFT
            TOP,          LEFT,          FRONT, 
            TOP,          LEFT,          DOWN, 
            BACK,          LEFT,          DOWN
         },
         { // FRONT
            TOP,          TOP,          RIGHT, 
            FRONT,          FRONT,          DOWN, 
            FRONT,          FRONT,          DOWN
         },
         { // RIGHT
            TOP,          TOP,          BACK, 
            RIGHT,          RIGHT,          DOWN, 
            RIGHT,          RIGHT,          FRONT
         },
         { // BACK
            TOP,          TOP,          LEFT, 
            BACK,          BACK,          BACK, 
            DOWN,          DOWN,          DOWN
         },
         { // DOWN
            RIGHT,          RIGHT,          BACK, 
            FRONT,          DOWN,          BACK, 
            LEFT,          LEFT,          LEFT
         }
      },
      { // U 
         { // TOP
            LEFT,          BACK,          BACK, 
            LEFT,          TOP,          RIGHT, 
            FRONT,          FRONT,          RIGHT
         },
         { // LEFT
            TOP,          TOP,          RIGHT, 
            TOP,          LEFT,          DOWN, 
            BACK,          LEFT,          DOWN
         },
         { // FRONT
            TOP,          TOP,          BACK, 
            FRONT,          FRONT,          DOWN, 
            FRONT,          FRONT,          DOWN
         },
         { // RIGHT
            TOP,          TOP,          LEFT, 
            RIGHT,          RIGHT,          DOWN, 
            RIGHT,          RIGHT,          FRONT
         },
         { // BACK
            TOP,          LEFT,          FRONT, 
            BACK,          BACK,          BACK, 
            DOWN,          DOWN,          DOWN
         },
         { // DOWN
            RIGHT,          RIGHT,          BACK, 
            FRONT,          DOWN,          BACK, 
            LEFT,          LEFT,          LEFT
         }
      },
      { // D 
         { // TOP
            LEFT,          BACK,          BACK, 
            LEFT,          TOP,          RIGHT, 
            FRONT,          FRONT,          RIGHT
         },
         { // LEFT
            TOP,          TOP,          RIGHT, 
            TOP,          LEFT,          DOWN, 
            DOWN,          DOWN,          DOWN
         },
         { // FRONT
            TOP,          TOP,          BACK, 
            FRONT,          FRONT,          DOWN, 
            BACK,          LEFT,          DOWN
         },
         { // RIGHT
            TOP,          TOP,          LEFT, 
            RIGHT,          RIGHT,          DOWN, 
            FRONT,          FRONT,          DOWN
         },
         { // BACK
            TOP,          LEFT,          FRONT, 
            BACK,          BACK,          BACK, 
            RIGHT,          RIGHT,          FRONT
         },
         { // DOWN
            LEFT,          FRONT,          RIGHT, 
            LEFT,          DOWN,          RIGHT, 
            LEFT,          BACK,          BACK
         }
      },
      { // Li
         { // TOP
            TOP,          BACK,          BACK, 
            FRONT,          TOP,          RIGHT, 
            BACK,          FRONT,          RIGHT
         },
         { // LEFT
            RIGHT,          DOWN,          DOWN, 
            TOP,          LEFT,          DOWN, 
            TOP,          TOP,          DOWN
         },
         { // FRONT
            LEFT,          TOP,          BACK, 
            LEFT,          FRONT,          DOWN, 
            LEFT,          LEFT,          DOWN
         },
         { // RIGHT
            TOP,          TOP,          LEFT, 
            RIGHT,          RIGHT,          DOWN, 
            FRONT,          FRONT,          DOWN
         },
         { // BACK
            TOP,          LEFT,          FRONT, 
            BACK,          BACK,          LEFT, 
            RIGHT,          RIGHT,          LEFT
         },
         { // DOWN
            FRONT,          FRONT,          RIGHT, 
            BACK,          DOWN,          RIGHT, 
            FRONT,          BACK,          BACK
         }
      },
      { // Fi
         { // TOP
            TOP,          BACK,          BACK, 
            FRONT,          TOP,          RIGHT, 
            TOP,          RIGHT,          FRONT
         },
         { // LEFT
            RIGHT,          DOWN,          RIGHT, 
            TOP,          LEFT,          FRONT, 
            TOP,          TOP,          BACK
         },
         { // FRONT
            BACK,          DOWN,          DOWN, 
            TOP,          FRONT,          LEFT, 
            LEFT,          LEFT,          LEFT
         },
         { // RIGHT
            RIGHT,          TOP,          LEFT, 
            FRONT,          RIGHT,          DOWN, 
            FRONT,          FRONT,          DOWN
         },
         { // BACK
            TOP,          LEFT,          FRONT, 
            BACK,          BACK,          LEFT, 
            RIGHT,          RIGHT,          LEFT
         },
         { // DOWN
            DOWN,          DOWN,          DOWN, 
            BACK,          DOWN,          RIGHT, 
            FRONT,          BACK,          BACK
         }
      },
      { // Ri
         { // TOP
            TOP,          BACK,          RIGHT, 
            FRONT,          TOP,          BACK, 
            TOP,          RIGHT,          TOP
         },
         { // LEFT
            RIGHT,          DOWN,          RIGHT, 
            TOP,          LEFT,          FRONT, 
            TOP,          TOP,          BACK
         },
         { // FRONT
            BACK,          DOWN,          BACK, 
            TOP,          FRONT,          RIGHT, 
            LEFT,          LEFT,          FRONT
         },
         { // RIGHT
            LEFT,          DOWN,          DOWN, 
            TOP,          RIGHT,          FRONT, 
            RIGHT,          FRONT,          FRONT
         },
         { // BACK
            BACK,          LEFT,          FRONT, 
            RIGHT,          BACK,          LEFT, 
            DOWN,          RIGHT,          LEFT
         },
         { // DOWN
            DOWN,          DOWN,          DOWN, 
            BACK,          DOWN,          LEFT, 
            FRONT,          BACK,          LEFT
         }
      },
      { // Bi
         { // TOP
            TOP,          TOP,          RIGHT, 
            FRONT,          TOP,          BACK, 
            TOP,          RIGHT,          TOP
         },
         { // LEFT
            FRONT,          DOWN,          RIGHT, 
            BACK,          LEFT,          FRONT, 
            LEFT,          TOP,          BACK
         },
         { // FRONT
            BACK,          DOWN,          BACK, 
            TOP,          FRONT,          RIGHT, 
            LEFT,          LEFT,          FRONT
         },
         { // RIGHT
            LEFT,          DOWN,          TOP, 
            TOP,          RIGHT,          BACK, 
            RIGHT,          FRONT,          RIGHT
         },
         { // BACK
            FRONT,          LEFT,          LEFT, 
            LEFT,          BACK,          RIGHT, 
            BACK,          RIGHT,          DOWN
         },
         { // DOWN
            DOWN,          DOWN,          DOWN, 
            BACK,          DOWN,          LEFT, 
            FRONT,          FRONT,          DOWN
         }
      },
      { // Ui
         { // TOP
            RIGHT,          BACK,          TOP, 
            TOP,          TOP,          RIGHT, 
            TOP,          FRONT,          TOP
         },
         { // LEFT
            FRONT,          LEFT,          LEFT, 
            BACK,          LEFT,          FRONT, 
            LEFT,          TOP,          BACK
         },
         { // FRONT
            FRONT,          DOWN,          RIGHT, 
            TOP,          FRONT,          RIGHT, 
            LEFT,          LEFT,          FRONT
         },
         { // RIGHT
            BACK,          DOWN,          BACK, 
            TOP,          RIGHT,          BACK, 
            RIGHT,          FRONT,          RIGHT
         },
         { // BACK
            LEFT,          DOWN,          TOP, 
            LEFT,          BACK,          RIGHT, 
            BACK,          RIGHT,          DOWN
         },
         { // DOWN
            DOWN,          DOWN,          DOWN, 
            BACK,          DOWN,          LEFT, 
            FRONT,          FRONT,          DOWN
         }
      },
      { // Di
         { // TOP
            RIGHT,          BACK,          TOP, 
            TOP,          TOP,          RIGHT, 
            TOP,          FRONT,          TOP
         },
         { // LEFT
            FRONT,          LEFT,          LEFT, 
            BACK,          LEFT,          FRONT, 
            LEFT,          LEFT,          FRONT
         },
         { // FRONT
            FRONT,          DOWN,          RIGHT, 
            TOP,          FRONT,          RIGHT, 
            RIGHT,          FRONT,          RIGHT
         },
         { // RIGHT
            BACK,          DOWN,          BACK, 
            TOP,          RIGHT,          BACK, 
            BACK,          RIGHT,          DOWN
         },
         { // BACK
            LEFT,          DOWN,          TOP, 
            LEFT,          BACK,          RIGHT, 
            LEFT,          TOP,          BACK
         },
         { // DOWN
            DOWN,          LEFT,          DOWN, 
            DOWN,          DOWN,          FRONT, 
            DOWN,          BACK,          FRONT
         }
      },
      { // Li
         { // TOP
            FRONT,          BACK,          TOP, 
            TOP,          TOP,          RIGHT, 
            RIGHT,          FRONT,          TOP
         },
         { // LEFT
            LEFT,          FRONT,          FRONT, 
            LEFT,          LEFT,          LEFT, 
            FRONT,          BACK,          LEFT
         },
         { // FRONT
            DOWN,          DOWN,          RIGHT, 
            DOWN,          FRONT,          RIGHT, 
            DOWN,          FRONT,          RIGHT
         },
         { // RIGHT
            BACK,          DOWN,          BACK, 
            TOP,          RIGHT,          BACK, 
            BACK,          RIGHT,          DOWN
         },
         { // BACK
            LEFT,          DOWN,          TOP, 
            LEFT,          BACK,          TOP, 
            LEFT,          TOP,          RIGHT
         },
         { // DOWN
            BACK,          LEFT,          DOWN, 
            RIGHT,          DOWN,          FRONT, 
            TOP,          BACK,          FRONT
         }
      },
      { // Fi
         { // TOP
            FRONT,          BACK,          TOP, 
            TOP,          TOP,          RIGHT, 
            BACK,          TOP,          BACK
         },
         { // LEFT
            LEFT,          FRONT,          TOP, 
            LEFT,          LEFT,          FRONT, 
            FRONT,          BACK,          RIGHT
         },
         { // FRONT
            RIGHT,          RIGHT,          RIGHT, 
            DOWN,          FRONT,          FRONT, 
            DOWN,          DOWN,          DOWN
         },
         { // RIGHT
            DOWN,          DOWN,          BACK, 
            LEFT,          RIGHT,          BACK, 
            BACK,          RIGHT,          DOWN
         },
         { // BACK
            LEFT,          DOWN,          TOP, 
            LEFT,          BACK,          TOP, 
            LEFT,          TOP,          RIGHT
         },
         { // DOWN
            FRONT,          LEFT,          LEFT, 
            RIGHT,          DOWN,          FRONT, 
            TOP,          BACK,          FRONT
         }
      },
      { // Ri
         { // TOP
            FRONT,          BACK,          LEFT, 
            TOP,          TOP,          LEFT, 
            BACK,          TOP,          LEFT
         },
         { // LEFT
            LEFT,          FRONT,          TOP, 
            LEFT,          LEFT,          FRONT, 
            FRONT,          BACK,          RIGHT
         },
         { // FRONT
            RIGHT,          RIGHT,          TOP, 
            DOWN,          FRONT,          RIGHT, 
            DOWN,          DOWN,          BACK
         },
         { // RIGHT
            BACK,          BACK,          DOWN, 
            DOWN,          RIGHT,          RIGHT, 
            DOWN,          LEFT,          BACK
         },
         { // BACK
            FRONT,          DOWN,          TOP, 
            FRONT,          BACK,          TOP, 
            LEFT,          TOP,          RIGHT
         },
         { // DOWN
            FRONT,          LEFT,          RIGHT, 
            RIGHT,          DOWN,          FRONT, 
            TOP,          BACK,          DOWN
         }
      },
      { // Bi
         { // TOP
            FRONT,          LEFT,          LEFT, 
            TOP,          TOP,          LEFT, 
            BACK,          TOP,          LEFT
         },
         { // LEFT
            TOP,          FRONT,          TOP, 
            BACK,          LEFT,          FRONT, 
            DOWN,          BACK,          RIGHT
         },
         { // FRONT
            RIGHT,          RIGHT,          TOP, 
            DOWN,          FRONT,          RIGHT, 
            DOWN,          DOWN,          BACK
         },
         { // RIGHT
            BACK,          BACK,          FRONT, 
            DOWN,          RIGHT,          BACK, 
            DOWN,          LEFT,          LEFT
         },
         { // BACK
            TOP,          TOP,          RIGHT, 
            DOWN,          BACK,          TOP, 
            FRONT,          FRONT,          LEFT
         },
         { // DOWN
            FRONT,          LEFT,          RIGHT, 
            RIGHT,          DOWN,          FRONT, 
            BACK,          RIGHT,          DOWN
         }
      },
      { // Ui
         { // TOP
            LEFT,          LEFT,          LEFT, 
            LEFT,          TOP,          TOP, 
            FRONT,          TOP,          BACK
         },
         { // LEFT
            TOP,          TOP,          RIGHT, 
            BACK,          LEFT,          FRONT, 
            DOWN,          BACK,          RIGHT
         },
         { // FRONT
            TOP,          FRONT,          TOP, 
            DOWN,          FRONT,          RIGHT, 
            DOWN,          DOWN,          BACK
         },
         { // RIGHT
            RIGHT,          RIGHT,          TOP, 
            DOWN,          RIGHT,          BACK, 
            DOWN,          LEFT,          LEFT
         },
         { // BACK
            BACK,          BACK,          FRONT, 
            DOWN,          BACK,          TOP, 
            FRONT,          FRONT,          LEFT
         },
         { // DOWN
            FRONT,          LEFT,          RIGHT, 
            RIGHT,          DOWN,          FRONT, 
            BACK,          RIGHT,          DOWN
         }
      },
      { // Di
         { // TOP
            LEFT,          LEFT,          LEFT, 
            LEFT,          TOP,          TOP, 
            FRONT,          TOP,          BACK
         },
         { // LEFT
            TOP,          TOP,          RIGHT, 
            BACK,          LEFT,          FRONT, 
            DOWN,          DOWN,          BACK
         },
         { // FRONT
            TOP,          FRONT,          TOP, 
            DOWN,          FRONT,          RIGHT, 
            DOWN,          LEFT,          LEFT
         },
         { // RIGHT
            RIGHT,          RIGHT,          TOP, 
            DOWN,          RIGHT,          BACK, 
            FRONT,          FRONT,          LEFT
         },
         { // BACK
            BACK,          BACK,          FRONT, 
            DOWN,          BACK,          TOP, 
            DOWN,          BACK,          RIGHT
         },
         { // DOWN
            RIGHT,          FRONT,          DOWN, 
            LEFT,          DOWN,          RIGHT, 
            FRONT,          RIGHT,          BACK
         }
      },
      { // L 
         { // TOP
            RIGHT,          LEFT,          LEFT, 
            TOP,          TOP,          TOP, 
            FRONT,          TOP,          BACK
         },
         { // LEFT
            DOWN,          BACK,          TOP, 
            DOWN,          LEFT,          TOP, 
            BACK,          FRONT,          RIGHT
         },
         { // FRONT
            LEFT,          FRONT,          TOP, 
            LEFT,          FRONT,          RIGHT, 
            FRONT,          LEFT,          LEFT
         },
         { // RIGHT
            RIGHT,          RIGHT,          TOP, 
            DOWN,          RIGHT,          BACK, 
            FRONT,          FRONT,          LEFT
         },
         { // BACK
            BACK,          BACK,          FRONT, 
            DOWN,          BACK,          LEFT, 
            DOWN,          BACK,          RIGHT
         },
         { // DOWN
            TOP,          FRONT,          DOWN, 
            DOWN,          DOWN,          RIGHT, 
            DOWN,          RIGHT,          BACK
         }
      },
      { // F 
         { // TOP
            RIGHT,          LEFT,          LEFT, 
            TOP,          TOP,          TOP, 
            RIGHT,          TOP,          TOP
         },
         { // LEFT
            DOWN,          BACK,          TOP, 
            DOWN,          LEFT,          FRONT, 
            BACK,          FRONT,          DOWN
         },
         { // FRONT
            FRONT,          LEFT,          LEFT, 
            LEFT,          FRONT,          FRONT, 
            LEFT,          RIGHT,          TOP
         },
         { // RIGHT
            FRONT,          RIGHT,          TOP, 
            TOP,          RIGHT,          BACK, 
            BACK,          FRONT,          LEFT
         },
         { // BACK
            BACK,          BACK,          FRONT, 
            DOWN,          BACK,          LEFT, 
            DOWN,          BACK,          RIGHT
         },
         { // DOWN
            FRONT,          DOWN,          RIGHT, 
            DOWN,          DOWN,          RIGHT, 
            DOWN,          RIGHT,          BACK
         }
      },
      { // R 
         { // TOP
            RIGHT,          LEFT,          LEFT, 
            TOP,          TOP,          FRONT, 
            RIGHT,          TOP,          TOP
         },
         { // LEFT
            DOWN,          BACK,          TOP, 
            DOWN,          LEFT,          FRONT, 
            BACK,          FRONT,          DOWN
         },
         { // FRONT
            FRONT,          LEFT,          RIGHT, 
            LEFT,          FRONT,          RIGHT, 
            LEFT,          RIGHT,          BACK
         },
         { // RIGHT
            BACK,          TOP,          FRONT, 
            FRONT,          RIGHT,          RIGHT, 
            LEFT,          BACK,          TOP
         },
         { // BACK
            TOP,          BACK,          FRONT, 
            TOP,          BACK,          LEFT, 
            LEFT,          BACK,          RIGHT
         },
         { // DOWN
            FRONT,          DOWN,          DOWN, 
            DOWN,          DOWN,          DOWN, 
            DOWN,          RIGHT,          BACK
         }
      },
      { // B 
         { // TOP
            FRONT,          RIGHT,          TOP, 
            TOP,          TOP,          FRONT, 
            RIGHT,          TOP,          TOP
         },
         { // LEFT
            LEFT,          BACK,          TOP, 
            LEFT,          LEFT,          FRONT, 
            RIGHT,          FRONT,          DOWN
         },
         { // FRONT
            FRONT,          LEFT,          RIGHT, 
            LEFT,          FRONT,          RIGHT, 
            LEFT,          RIGHT,          BACK
         },
         { // RIGHT
            BACK,          TOP,          BACK, 
            FRONT,          RIGHT,          RIGHT, 
            LEFT,          BACK,          DOWN
         },
         { // BACK
            LEFT,          TOP,          TOP, 
            BACK,          BACK,          BACK, 
            RIGHT,          LEFT,          FRONT
         },
         { // DOWN
            FRONT,          DOWN,          DOWN, 
            DOWN,          DOWN,          DOWN, 
            DOWN,          DOWN,          BACK
         }
      },
      { // U 
         { // TOP
            RIGHT,          TOP,          FRONT, 
            TOP,          TOP,          RIGHT, 
            TOP,          FRONT,          TOP
         },
         { // LEFT
            FRONT,          LEFT,          RIGHT, 
            LEFT,          LEFT,          FRONT, 
            RIGHT,          FRONT,          DOWN
         },
         { // FRONT
            BACK,          TOP,          BACK, 
            LEFT,          FRONT,          RIGHT, 
            LEFT,          RIGHT,          BACK
         },
         { // RIGHT
            LEFT,          TOP,          TOP, 
            FRONT,          RIGHT,          RIGHT, 
            LEFT,          BACK,          DOWN
         },
         { // BACK
            LEFT,          BACK,          TOP, 
            BACK,          BACK,          BACK, 
            RIGHT,          LEFT,          FRONT
         },
         { // DOWN
            FRONT,          DOWN,          DOWN, 
            DOWN,          DOWN,          DOWN, 
            DOWN,          DOWN,          BACK
         }
      },
      { // D 
         { // TOP
            RIGHT,          TOP,          FRONT, 
            TOP,          TOP,          RIGHT, 
            TOP,          FRONT,          TOP
         },
         { // LEFT
            FRONT,          LEFT,          RIGHT, 
            LEFT,          LEFT,          FRONT, 
            RIGHT,          LEFT,          FRONT
         },
         { // FRONT
            BACK,          TOP,          BACK, 
            LEFT,          FRONT,          RIGHT, 
            RIGHT,          FRONT,          DOWN
         },
         { // RIGHT
            LEFT,          TOP,          TOP, 
            FRONT,          RIGHT,          RIGHT, 
            LEFT,          RIGHT,          BACK
         },
         { // BACK
            LEFT,          BACK,          TOP, 
            BACK,          BACK,          BACK, 
            LEFT,          BACK,          DOWN
         },
         { // DOWN
            DOWN,          DOWN,          FRONT, 
            DOWN,          DOWN,          DOWN, 
            BACK,          DOWN,          DOWN
         }
      }
   };
}
