package solver;

public class Cube {

   private enum CubeColor {
      BLUE,
      RED,
      YELLOW,
      ORANGE,
      WHITE,
      GREEN
   }

   private static final int LEFT = 0;
   private static final int FRONT = 1;
   private static final int RIGHT = 2;
   private static final int BACK = 3;
   private static final int TOP = 4;
   private static final int BOTTOM = 5;
   
   private CubeColor cube[][];
   
   public Cube() {
      cube = new CubeColor[6][];
      for(int i = 0; i < cube.length; i++) {
         CubeColor color = null;
         switch(i) {
         case LEFT:   color = CubeColor.WHITE;   break;
         case FRONT:  color = CubeColor.RED;     break;
         case RIGHT:  color = CubeColor.YELLOW;  break;
         case BACK:   color = CubeColor.ORANGE;  break;
         case BOTTOM: color = CubeColor.GREEN;   break;
         case TOP:    color = CubeColor.BLUE;    break;
         }
         
         cube[i] = new CubeColor[9];
         for(int j = 0; j < 9; j++) {
            cube[i][j] = color;
         }
      }
   }
}
