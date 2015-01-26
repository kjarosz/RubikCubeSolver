package solver.algorithms;

import java.util.LinkedList;
import java.util.Random;


public class Cube {
   // FACES
   public static final byte 
   TOP = 0,
   LEFT = 1,
   FRONT = 2,
   RIGHT = 3,
   BACK = 4,
   BOTTOM = 5;
   
   // EDGES
   public static final byte 
   UF = 0, UR = 1, UB = 2, UL = 3,
   DF = 4, DR = 5, DB = 6, DL = 7,
   FL = 8, FR = 9, BR = 10, BL = 11,
   FU = 12, RU = 13, BU = 14, LU = 15,
   FD = 16, RD = 17, BD = 18, LD = 19,
   LF = 20, RF = 21, RB = 22, LB = 23;
   
   public static String EDGE_STRINGS[] = {
      "UF", "UR", "UB", "UL", 
      "DF", "DR", "DB", "DL",
      "FL", "FR", "BR", "BL",
      "FU", "RU", "BU", "LU",
      "FD", "RD", "BD", "LD",
      "LF", "RF", "RB", "LB"
   };
   
   public final static byte EDGE_LOCATIONS[][] = {
      { TOP, 7, FRONT, 1 },  {TOP, 5, RIGHT, 1}, {TOP, 1, BACK, 1}, {TOP, 3, LEFT, 1},
      { BOTTOM, 1, FRONT, 7}, {BOTTOM, 5, RIGHT, 7}, {BOTTOM, 7, BACK, 7}, {BOTTOM, 3, LEFT, 7},
      { FRONT, 3, LEFT, 5}, {FRONT, 5, RIGHT, 3}, {BACK, 3, RIGHT, 5}, {BACK, 5, LEFT, 3}
   };
   
   private byte cube[][];
   
   public Cube() {
      cube = new byte[6][];
      for(byte i = 0; i < cube.length; i++) {         
         cube[i] = new byte[9];
         for(int j = 0; j < 9; j++) {
            cube[i][j] = i;
         }
      }
   }
   
   public Cube(Cube source) {
      cube = new byte[6][];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = new byte[9];
         for(int j = 0; j < 9; j++) {
            cube[i][j] = source.cube[i][j];
         }
      }
   }
   
   public Cube(byte source[][]) {
      cube = new byte[6][];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = new byte[9];
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
   
   // ROW_OPS
   private static final byte 
   ROW_TOP_LEFT = 0,
   ROW_LEFT_DOWN = 1,
   ROW_BOTTOM_RIGHT = 2,
   ROW_RIGHT_UP = 3;
   
   private static final byte ROW_OP_INDICES[][] = {
      { 2, 1, 0 }, // ROW_TOP_LEFT
      { 0, 3, 6 }, // ROW_LEFT_DOWN
      { 6, 7, 8 }, // ROW_BOTTOM_RIGHT
      { 8, 5, 2 }  // ROW_RIGHT_UP
   };
   
   private static final byte transforms[][] = {
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
      {TOP, LEFT, ROW_TOP_LEFT,
            FRONT, ROW_TOP_LEFT, LEFT, ROW_TOP_LEFT,
            RIGHT, ROW_TOP_LEFT, FRONT, ROW_TOP_LEFT,
            BACK, ROW_TOP_LEFT, RIGHT, ROW_TOP_LEFT,
            BACK, ROW_TOP_LEFT},
      // Ui
      {TOP, LEFT, ROW_TOP_LEFT,
            BACK, ROW_TOP_LEFT, LEFT, ROW_TOP_LEFT,
            RIGHT, ROW_TOP_LEFT, BACK, ROW_TOP_LEFT,
            FRONT, ROW_TOP_LEFT, RIGHT, ROW_TOP_LEFT,
            FRONT, ROW_TOP_LEFT},
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
   
   private void turnFaceClockwise(int face) {
      byte old = cube[face][0];
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
      byte old = cube[face][0];
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
   
   public void performTransform(byte transform) {
      int step = 0;
      if(transform % 2 != 0)
         turnFaceCounterclockwise(transforms[transform][step++]);
      else
         turnFaceClockwise(transforms[transform][step++]);
      
      byte oldColor;
      for(int i = 0; i < 3; i++) {
         oldColor = cube[transforms[transform][1]][ROW_OP_INDICES[transforms[transform][2]][i]];
         
         cube[transforms[transform][5]][ROW_OP_INDICES[transforms[transform][6]][i]] =
               cube[transforms[transform][3]][ROW_OP_INDICES[transforms[transform][4]][i]];
         
         cube[transforms[transform][9]][ROW_OP_INDICES[transforms[transform][10]][i]] =
               cube[transforms[transform][7]][ROW_OP_INDICES[transforms[transform][8]][i]];
         
         cube[transforms[transform][13]][ROW_OP_INDICES[transforms[transform][14]][i]] =
               cube[transforms[transform][11]][ROW_OP_INDICES[transforms[transform][12]][i]];
         
         cube[transforms[transform][15]][ROW_OP_INDICES[transforms[transform][16]][i]] = oldColor;
               
         
      }
   }
   
   public LinkedList<Byte> scramble(int moves) {
      LinkedList<Byte> scrambleMoveset = new LinkedList<>();
      
      Random random = new Random();
      for(byte i = 0, move; i < moves; i++) {
         do {
            move = (byte)random.nextInt(12);
         } while(moveIsStupid(scrambleMoveset, move));
         
         performTransform(move);
         scrambleMoveset.add(move);
      }
      
      return scrambleMoveset;
   }
      
   private boolean moveIsStupid(LinkedList<Byte> scrambleMoveset, byte move) {
      if(scrambleMoveset.isEmpty())
         return false;
      
      byte lastMove = scrambleMoveset.getLast();
      
      // Do not repeat move
      if(move == lastMove)
         return true;
      
      // If move undoes the last one.
      if(move % 2 == 0) {
         return lastMove == move + 1;
      } else {
         return lastMove == move - 1;
      }
      
   }
   
   public byte[][] getDescriptor() {
      byte descriptor[][] = new byte[6][];
      for(int i = 0; i < 6; i++) {
         descriptor[i] = new byte[9];
         for(int j = 0; j < 9; j++) {
            descriptor[i][j] = cube[i][j];
         }
      }
      return descriptor;
   }
   
   private String getColorCharacter(byte color) {
      switch(color) {
      case TOP: return "U";
      case LEFT: return "L";
      case FRONT: return "F";
      case RIGHT: return "R";
      case BACK: return "B";
      case BOTTOM: return "D";
      default: return "I";
      }
   }
   
   public byte findEdge(byte edge) {
      byte indices[] = convertEdgeToIndices(edge);
      byte edgeColors[] = getEdgeColors(indices);
      return findEdgeLocation(edgeColors);
   }
   
   private byte[] getEdgeColors(byte indices[]) {
      byte colors[] = new byte[2];
      colors[0] = cube[indices[0]][4];
      colors[1] = cube[indices[2]][4];
      return colors;
   }
   
   private byte findEdgeLocation(byte edgeColors[]) {
      for(byte i = 0; i < EDGE_LOCATIONS.length; i++) {         
         if (edgeMatches(edgeColors, i, false)) {
            return i;
         }
         if(edgeMatches(edgeColors, i, true)) {
            return (byte) (i + 12);
         }
      }
      throw new RuntimeException("Invalid color combination.");
   }
   
   private boolean edgeMatches(byte colors[], int edge, boolean inverted) {
      if(!inverted) {
         return colors[0] == cube[EDGE_LOCATIONS[edge][0]][EDGE_LOCATIONS[edge][1]] 
                     &&
             colors[1] == cube[EDGE_LOCATIONS[edge][2]][EDGE_LOCATIONS[edge][3]];
      } else {
         return colors[1] == cube[EDGE_LOCATIONS[edge][0]][EDGE_LOCATIONS[edge][1]] 
                     &&
             colors[0] == cube[EDGE_LOCATIONS[edge][2]][EDGE_LOCATIONS[edge][3]];
      }
   }
   
   private byte[] convertEdgeToIndices(byte edge) {
      byte indices[] = new byte[4];
      if(edge < 12) {
         for(byte i = 0; i < 4; i++) {
            indices[i] = EDGE_LOCATIONS[edge][i];
         }
      } else {
         int i = 0;
         indices[i++] = EDGE_LOCATIONS[edge-12][2];
         indices[i++] = EDGE_LOCATIONS[edge-12][3];
         indices[i++] = EDGE_LOCATIONS[edge-12][0];
         indices[i++] = EDGE_LOCATIONS[edge-12][1];
      }
      return indices;
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
