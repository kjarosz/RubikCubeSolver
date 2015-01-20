package solver;

import java.util.LinkedList;
import java.util.Random;

import solver.Solver.Move;


public class Cube {

   public static enum CubeColor {
      BLUE,
      WHITE,
      RED,
      YELLOW,
      ORANGE,
      GREEN
   }

   private static final int TOP = 0;
   private static final int LEFT = 1;
   private static final int FRONT = 2;
   private static final int RIGHT = 3;
   private static final int BACK = 4;
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
   
   public Cube(Cube source) {
      cube = new CubeColor[6][];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = new CubeColor[9];
         for(int j = 0; j < 9; j++) {
            cube[i][j] = source.cube[i][j];
         }
      }
   }
   
   public Cube(Cube.CubeColor source[][]) {
      cube = new CubeColor[6][];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = new CubeColor[9];
         for(int j = 0; j < 9; j++) {
            cube[i][j] = source[i][j];
         }
      }
   }
   
   public boolean cubeSolved() {
      for(int i = 0; i < 6; i++) {
         for(int j = 0; j < 9; j++) {
            if(cube[i][j] != cube[i][4]) {
               return false;
            }
         }
      }
      return true;
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
      
   private static final int 
   ROW_TOP_RIGHT = 0,
   ROW_TOP_LEFT = 1,
   ROW_LEFT_DOWN = 2,
   ROW_LEFT_UP = 3,
   ROW_BOTTOM_RIGHT = 4,
   ROW_BOTTOM_LEFT = 5,
   ROW_RIGHT_DOWN = 6,
   ROW_RIGHT_UP = 7;
   
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
   
   private static final int transforms[][] = {
      // L
      {LEFT, TOP, ROW_LEFT_DOWN,
            BACK, ROW_RIGHT_UP, TOP, ROW_LEFT_DOWN,
            BOTTOM, ROW_LEFT_DOWN, BACK, ROW_RIGHT_UP,
            FRONT, ROW_LEFT_DOWN, BOTTOM, ROW_LEFT_DOWN,
            FRONT, ROW_LEFT_DOWN},
      // Li
      {LEFT, TOP, ROW_LEFT_DOWN,
            FRONT, ROW_LEFT_DOWN, TOP, ROW_LEFT_DOWN,
            BOTTOM, ROW_LEFT_DOWN, FRONT, ROW_LEFT_DOWN,
            BACK, ROW_RIGHT_UP, BOTTOM, ROW_LEFT_DOWN,
            BACK, ROW_RIGHT_UP},
      // F
      {FRONT, TOP, ROW_BOTTOM_RIGHT,
            LEFT, ROW_RIGHT_UP, TOP, ROW_BOTTOM_RIGHT,
            BOTTOM, ROW_TOP_LEFT, LEFT, ROW_RIGHT_UP,
            RIGHT, ROW_LEFT_DOWN, BOTTOM, ROW_TOP_LEFT,
            RIGHT, ROW_LEFT_DOWN},
      // Fi
      {FRONT, TOP, ROW_BOTTOM_RIGHT,
            RIGHT, ROW_LEFT_DOWN, TOP, ROW_BOTTOM_RIGHT,
            BOTTOM, ROW_TOP_LEFT, RIGHT, ROW_LEFT_DOWN,
            LEFT, ROW_RIGHT_UP, BOTTOM, ROW_TOP_LEFT,
            LEFT, ROW_RIGHT_UP},
      // R
      {RIGHT, TOP, ROW_RIGHT_UP,
            FRONT, ROW_RIGHT_UP, TOP, ROW_RIGHT_UP,
            BOTTOM, ROW_RIGHT_UP, FRONT, ROW_RIGHT_UP,
            BACK, ROW_LEFT_DOWN, BOTTOM, ROW_RIGHT_UP,
            BACK, ROW_LEFT_DOWN},
      // Ri
      {RIGHT, TOP, ROW_RIGHT_UP,
            BACK, ROW_LEFT_DOWN, TOP, ROW_RIGHT_UP,
            BOTTOM, ROW_RIGHT_UP, BACK, ROW_LEFT_DOWN,
            FRONT, ROW_RIGHT_UP, BOTTOM, ROW_RIGHT_UP,
            FRONT, ROW_RIGHT_UP},
      // B
      {BACK, TOP, ROW_TOP_LEFT,
            RIGHT, ROW_RIGHT_UP, TOP, ROW_TOP_LEFT,
            BOTTOM, ROW_BOTTOM_RIGHT, RIGHT, ROW_RIGHT_UP,
            LEFT, ROW_LEFT_DOWN, BOTTOM, ROW_BOTTOM_RIGHT,
            LEFT, ROW_LEFT_DOWN},
      // Bi
      {BACK, TOP, ROW_TOP_LEFT,
            LEFT, ROW_LEFT_DOWN, TOP, ROW_TOP_LEFT,
            BOTTOM, ROW_BOTTOM_RIGHT, LEFT, ROW_LEFT_DOWN,
            RIGHT, ROW_RIGHT_UP, BOTTOM, ROW_BOTTOM_RIGHT,
            RIGHT, ROW_RIGHT_UP},
      // U
      {TOP, LEFT, ROW_TOP_RIGHT,
            FRONT, ROW_TOP_RIGHT, LEFT, ROW_TOP_RIGHT,
            RIGHT, ROW_TOP_RIGHT, FRONT, ROW_TOP_RIGHT,
            BACK, ROW_TOP_RIGHT, RIGHT, ROW_TOP_RIGHT,
            BACK, ROW_TOP_RIGHT},
      // Ui
      {TOP, LEFT, ROW_TOP_RIGHT,
            BACK, ROW_TOP_RIGHT, LEFT, ROW_TOP_RIGHT,
            RIGHT, ROW_TOP_RIGHT, BACK, ROW_TOP_RIGHT,
            FRONT, ROW_TOP_RIGHT, RIGHT, ROW_TOP_RIGHT,
            FRONT, ROW_TOP_RIGHT},
      // D
      {BOTTOM, FRONT, ROW_BOTTOM_RIGHT,
            LEFT, ROW_BOTTOM_RIGHT, FRONT, ROW_BOTTOM_RIGHT,
            BACK, ROW_BOTTOM_RIGHT, LEFT, ROW_BOTTOM_RIGHT,
            RIGHT, ROW_BOTTOM_RIGHT, BACK, ROW_BOTTOM_RIGHT,
            RIGHT, ROW_BOTTOM_RIGHT},
      // Di
      {BOTTOM, FRONT, ROW_BOTTOM_RIGHT,
            RIGHT, ROW_BOTTOM_RIGHT, FRONT, ROW_BOTTOM_RIGHT,
            BACK, ROW_BOTTOM_RIGHT, RIGHT, ROW_BOTTOM_RIGHT,
            LEFT, ROW_BOTTOM_RIGHT, BACK, ROW_BOTTOM_RIGHT,
            LEFT, ROW_BOTTOM_RIGHT}
   };
   
   public void performTransform(Move transform) {
      int transformIdx = transform.ordinal();
      int step = 0;
      if(transformIdx % 2 != 0)
         turnFaceCounterclockwise(transforms[transformIdx][step++]);
      else
         turnFaceClockwise(transforms[transformIdx][step++]);
      
      CubeColor oldRow[] = new CubeColor[3];
      CubeColor buffer[] = new CubeColor[3];
      
      getRow(transforms[transformIdx][step++], transforms[transformIdx][step++], oldRow);
      
      for(int i = 0; i < 3; i++) {
         xferRow(transforms[transformIdx][step++], transforms[transformIdx][step++],
               transforms[transformIdx][step++], transforms[transformIdx][step++], buffer);
      }
      
      setRow(transforms[transformIdx][step++], transforms[transformIdx][step++], oldRow);
   }
   
   public LinkedList<Move> scramble(int moves) {
      LinkedList<Move> scrambleMoveset = new LinkedList<>();
      
      Random random = new Random();
      Move moveset[] = Solver.Move.values();
      for(int i = 0; i < moves; i++) {
         Move move = moveset[random.nextInt(moveset.length)];
         performTransform(move);
         scrambleMoveset.add(move);
      }
      
      return scrambleMoveset;
   }
   
   public Cube.CubeColor[][] getDescriptor() {
      Cube.CubeColor descriptor[][] = new Cube.CubeColor[6][];
      for(int i = 0; i < 6; i++) {
         descriptor[i] = new Cube.CubeColor[9];
         for(int j = 0; j < 9; j++) {
            descriptor[i][j] = cube[i][j];
         }
      }
      return descriptor;
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
