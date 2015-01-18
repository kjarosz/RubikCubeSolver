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
   
   private void turnFaceClockwise(int face) {
      CubeColor old = cube[face][0];
      cube[face][0] = cube[face][6];
      cube[face][6] = cube[face][8];
      cube[face][8] = cube[face][2];
      cube[face][2] = old;
      
      old = cube[face][1];
      cube[face][1] = cube[face][3];
      cube[face][3] = cube[face][7];
      cube[face][7] = cube[face][5];
      cube[face][5] = old;
   }
   
   private void turnFaceCounterclockwise(int face) {
      CubeColor old = cube[face][0];
      cube[face][0] = cube[face][2];
      cube[face][2] = cube[face][8];
      cube[face][8] = cube[face][6];
      cube[face][6] = old;
      
      old = cube[face][1];
      cube[face][1] = cube[face][5];
      cube[face][5] = cube[face][7];
      cube[face][7] = cube[face][3];
      cube[face][3] = old;
   }
   
   private static final int ROW_TOP_RIGHT = 0;
   private static final int ROW_TOP_LEFT = 1;
   private static final int ROW_LEFT_DOWN = 2;
   private static final int ROW_LEFT_UP = 3;
   private static final int ROW_BOTTOM_RIGHT = 4;
   private static final int ROW_BOTTOM_LEFT = 5;
   private static final int ROW_RIGHT_DOWN = 6;
   private static final int ROW_RIGHT_UP = 7;
   
   private void getRow(int face, int row, CubeColor output[]) {
      switch(row) {
      case ROW_TOP_RIGHT:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][i];
         }
         break;
      case ROW_TOP_LEFT:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][2 - i];
         }
         break;
      case ROW_LEFT_DOWN:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][i*3];
         }
         break;
      case ROW_LEFT_UP:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][6 - i*3];
         }
         break;
      case ROW_BOTTOM_RIGHT:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][6 + i];
         }
         break;
      case ROW_BOTTOM_LEFT:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][8 - i];
         }
         break;
      case ROW_RIGHT_DOWN:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][2 + i*3];
         }
         break;
      case ROW_RIGHT_UP:
         for(int i = 0; i < 3; i++) {
            output[i] = cube[face][8 - i*3];
         }
         break;
      }
   }
   
   private void setRow(int face, int row, CubeColor input[]) {
      switch(row) {
      case ROW_TOP_RIGHT:
         for(int i = 0; i < 3; i++) {
            cube[face][i] = input[i];
         }
         break;
      case ROW_TOP_LEFT:
         for(int i = 0; i < 3; i++) {
            cube[face][2 - i] = input[i];
         }
         break;
      case ROW_LEFT_DOWN:
         for(int i = 0; i < 3; i++) {
            cube[face][i*3] = input[i];
         }
         break;
      case ROW_LEFT_UP:
         for(int i = 0; i < 3; i++) {
            cube[face][6 - i*3] = input[i];
         }
         break;
      case ROW_BOTTOM_RIGHT:
         for(int i = 0; i < 3; i++) {
            cube[face][6 + i] = input[i];
         }
         break;
      case ROW_BOTTOM_LEFT:
         for(int i = 0; i < 3; i++) {
            cube[face][8 - i] = input[i];
         }
         break;
      case ROW_RIGHT_DOWN:
         for(int i = 0; i < 3; i++) {
            cube[face][2 + i*3] = input[i];
         }
         break;
      case ROW_RIGHT_UP:
         for(int i = 0; i < 3; i++) {
            cube[face][8 - i*3] = input[i];
         }
         break;
      }
   }
   
   private void xferRow(int face1, int row1, int face2, int row2, CubeColor buffer[]) {
      getRow(face1, row1, buffer);
      setRow(face2, row2, buffer);
   }
   
   public void L() {
      turnFaceClockwise(LEFT);
      
      CubeColor oldRow[] = new CubeColor[3];
      CubeColor buffer[] = new CubeColor[3];
      
      getRow(TOP, ROW_LEFT_DOWN, oldRow);
      
      xferRow(BACK, ROW_RIGHT_UP, TOP, ROW_LEFT_DOWN, buffer);
      xferRow(BOTTOM, ROW_LEFT_DOWN, BACK, ROW_RIGHT_UP, buffer);
      xferRow(FRONT, ROW_LEFT_DOWN, BOTTOM, ROW_LEFT_DOWN, buffer);
      
      setRow(FRONT, ROW_LEFT_DOWN, oldRow);
   }
   
   public void Li() {
      turnFaceCounterclockwise(LEFT);
      
      CubeColor oldRow[] = new CubeColor[3];
      CubeColor buffer[] = new CubeColor[3];
      
      getRow(TOP, ROW_LEFT_DOWN, oldRow);
      
      xferRow(FRONT, ROW_LEFT_DOWN, TOP, ROW_LEFT_DOWN, buffer);
      xferRow(BOTTOM, ROW_LEFT_DOWN, FRONT, ROW_LEFT_DOWN, buffer);
      xferRow(BACK, ROW_RIGHT_UP, BOTTOM, ROW_LEFT_DOWN, buffer);
      
      setRow(BACK, ROW_RIGHT_UP, oldRow);
   }
   
   public void F() {
      turnFaceClockwise(FRONT);
      
      CubeColor oldRow[] = new CubeColor[3];
      CubeColor buffer[] = new CubeColor[3];
      
      getRow(TOP, ROW_BOTTOM_RIGHT, oldRow);
      
      xferRow(LEFT, ROW_RIGHT_UP, TOP, ROW_BOTTOM_RIGHT, buffer);
      xferRow(BOTTOM, ROW_TOP_LEFT, LEFT, ROW_RIGHT_UP, buffer);
      xferRow(RIGHT, ROW_LEFT_DOWN, BOTTOM, ROW_TOP_LEFT, buffer);
      
      setRow(RIGHT, ROW_LEFT_DOWN, oldRow);
   }
   
   public void Fi() {
      turnFaceCounterclockwise(FRONT);
      
      CubeColor oldRow[] = new CubeColor[3];
      CubeColor buffer[] = new CubeColor[3];
      
      getRow(TOP, ROW_BOTTOM_RIGHT, oldRow);
      
      xferRow(RIGHT, ROW_LEFT_DOWN, TOP, ROW_BOTTOM_RIGHT, buffer);
      xferRow(BOTTOM, ROW_TOP_LEFT, RIGHT, ROW_LEFT_DOWN, buffer);
      xferRow(LEFT, ROW_RIGHT_UP, BOTTOM, ROW_TOP_LEFT, buffer);
      
      setRow(LEFT, ROW_RIGHT_UP, oldRow);
   }
   
   public void R() {
      
   }
   
   public void Ri() {
      
   }
   
   public void B() {
      
   }
   
   public void Bi() {
      
   }
   
   public void U() {
      
   }
   
   public void Ui() {
      
   }
   
   public void D() {
      
   }
   
   public void Di() {
      
   }
   
   private String getColorCharacter(CubeColor color) {
      switch(color) {
      case BLUE: return "B";
      case WHITE: return "W";
      case RED: return "R";
      case YELLOW: return "Y";
      case ORANGE: return "O";
      case GREEN: return "G";
      default: return "I";
      }
   }
   
   public void printCube() {
      for(int i = 0; i < 3; i++) {
         System.out.print("    ");
         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(cube[TOP][i*3 + j]));
         }
         System.out.println("        ");
      }
      
      for(int i = 0; i < 3; i++) {
         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(cube[LEFT][i*3 + j]));
         }
         System.out.print(" ");

         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(cube[FRONT][i*3 + j]));
         }
         System.out.print(" ");

         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(cube[RIGHT][i*3 + j]));
         }
         System.out.print(" ");

         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(cube[BACK][i*3 + j]));
         }
         System.out.println();
      }
      
      for(int i = 0; i < 3; i++) {
         System.out.print("    ");
         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(cube[BOTTOM][i*3 + j]));
         }
         System.out.println("        ");
      }
   }
}
