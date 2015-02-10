package solver.algorithms;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Random;


public class Cube {
   public static Color sFace_Colors[] = {
      Color.BLUE, Color.WHITE, Color.RED,
      Color.YELLOW, Color.ORANGE, Color.GREEN
   };
   
   // FACES
   public static final byte 
   TOP = 0,
   LEFT = 1,
   FRONT = 2,
   RIGHT = 3,
   BACK = 4,
   DOWN = 5;
   
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
      { DOWN, 1, FRONT, 7}, {DOWN, 5, RIGHT, 7}, {DOWN, 7, BACK, 7}, {DOWN, 3, LEFT, 7},
      { FRONT, 3, LEFT, 5}, {FRONT, 5, RIGHT, 3}, {BACK, 3, RIGHT, 5}, {BACK, 5, LEFT, 3}
   };
   
   // CORNERS
   public static final byte
   UFR = 0, URB = 1, UBL = 2, ULF =  3, DRF =  4, DFL =  5, DLB =  6, DBR =  7,
   
   FRU =  8, RBU =  9, BLU = 10, LFU = 11, RFD = 12, FLD = 13, LBD = 14, BRD = 15,

   RUF = 16, BUR = 17, LUB = 18, FUL = 19, FDR = 20, LDF = 21, BDL = 22, RDB = 23;
   
   public static String CORNER_STRINGS[] = {
      "UFR", "URB", "UBL", "ULF", "DRF", "DFL", "DLB", "DBR",
      "FRU", "RBU", "BLU", "LFU", "RFD", "FLD", "LBD", "BRD",
      "RUF", "BUR", "LUB", "FUL", "FDR", "LDF", "BDL", "RDB"
   };
   
   public final static byte CORNER_LOCATIONS[][] = {
      {TOP, 8, FRONT, 2, RIGHT, 0}, {TOP, 2, RIGHT, 2, BACK, 0},
      {TOP, 0, BACK, 2, LEFT, 0}, {TOP, 6, LEFT, 2, FRONT, 0},
      {DOWN, 2, RIGHT, 6, FRONT, 8}, {DOWN, 0, FRONT, 6, LEFT, 8},
      {DOWN, 6, LEFT, 6, BACK, 8}, {DOWN, 8, BACK, 6, RIGHT, 8}
   };
   
   private byte cube[];
   
   public Cube() {
      cube = new byte[20];
      for(byte i = 0; i < 12; i++) {
         cube[i] = i;
      }
      for(byte i = 0; i < 8; i++) {
         cube[12 + i] = i;
      }
   }
   
   public Cube(Cube source) {
      cube = new byte[20];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = source.cube[i];
      }
   }
   
   public Cube(byte source[]) {
      cube = new byte[20];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = source[i];
      }
   }
   
   public Cube(byte descriptor[][]) {
      cube = new byte[20];
      loadEdges(descriptor);
      loadCorners(descriptor);
   }
   
   private void loadEdges(byte descriptor[][]) {
      for(int i = 0; i < 12; i++) {
         int c1 = descriptor[EDGE_LOCATIONS[i][0]][EDGE_LOCATIONS[i][1]];
         int c2 = descriptor[EDGE_LOCATIONS[i][2]][EDGE_LOCATIONS[i][3]];
         
         cubieSearch:
         for(int j = 0; j < 12; j++) {
            if(c1 == EDGE_LOCATIONS[j][0] && EDGE_LOCATIONS[j][2] == c2) {
               cube[i] = (byte)j;
               break cubieSearch;
            } else if(c1 == EDGE_LOCATIONS[j][2] && EDGE_LOCATIONS[j][0] == c2) {
               cube[i] = (byte)(j + 12);
               break cubieSearch;
            } 
         }
      }
   }
   
   private void loadCorners(byte descriptor[][]) {
      for(int i = 0; i < 8; i++) {
         int c1 = descriptor[CORNER_LOCATIONS[i][0]][CORNER_LOCATIONS[i][1]];
         int c2 = descriptor[CORNER_LOCATIONS[i][2]][CORNER_LOCATIONS[i][3]];
         int c3 = descriptor[CORNER_LOCATIONS[i][4]][CORNER_LOCATIONS[i][5]];
         
         for(int j = 0; j < 3; j++) {
            for(int k = 0; k < 8; k++) {
               if(c1 == CORNER_LOCATIONS[k][j*2] &&
                  c2 == CORNER_LOCATIONS[k][(j*2 + 2) % 6] &&
                  c3 == CORNER_LOCATIONS[k][(j*2 + 4) % 6]) {
                  cube[12 + i] = (byte)(j*8 + k);
               }
            }
         }
      }
   }
   
   public boolean cubeSolved() {
      for(byte i = 0; i < 12; i++) {
         if(cube[i] != i) {
            return false;
         }
         
      }
      for(byte i = 0; i < 8; i++) {
         if(cube[i+12] != i) {
            return false;
         }
      }
      return true;
   }
   
   private static final byte transforms[][][] = {
      // L
      {  {BL, DL, FL, UL, 0, 0, 0, 0},
          {UBL, DLB, DFL, ULF, 2, 1, 2, 1} },
      // Li
      {  {FL, DL, BL, UL, 0, 0, 0, 0},
          {DFL, DLB, UBL, ULF, 2, 1, 2, 1} },
      // F
      {  {FL, DF, FR, UF, 1, 1, 1, 1},
          {ULF, DFL, DRF, UFR, 2, 1, 2, 1} },
      // Fi
       {  {FR, DF, FL, UF, 1, 1, 1, 1},
          {DRF, DFL, ULF, UFR, 2, 1, 2, 1} },
      // R
      {  {FR, DR, BR, UR, 0, 0, 0, 0},
          {UFR, DRF, DBR, URB, 2, 1, 2, 1} },
      // Ri
       {  {BR, DR, FR, UR, 0, 0, 0, 0},
          {DBR, DRF, UFR, URB, 2, 1, 2, 1} },
      // B
      {  {BR, DB, BL, UB, 1, 1, 1, 1},
          {URB, DBR, DLB, UBL, 2, 1, 2, 1} },
      // Bi
       {  {BL, DB, BR, UB, 1, 1, 1, 1},
          {DLB, DBR, URB, UBL, 2, 1, 2, 1} },
      // U
      { {UB, UL, UF, UR, 0, 0, 0, 0},
         {URB, UBL, ULF, UFR, 0, 0, 0, 0} },
      // Ui
      { {UF, UL, UB, UR, 0, 0, 0, 0},
         {ULF, UBL, URB, UFR, 0, 0, 0, 0} },
      // D
      { {DF, DL, DB, DR, 0, 0, 0, 0},
         {DFL, DLB, DBR, DRF, 0, 0, 0, 0} },
      // Di
      { {DB, DL, DF, DR, 0, 0, 0, 0},
         {DBR, DLB, DFL, DRF, 0, 0, 0, 0} }
   };
   
   public void rotateEdges(byte transform[]) {
      byte temp = cube[transform[0]];
      
      byte cubie;
      for(byte i = 1; i < 4; i++) {
         cubie = (byte)(cube[transform[i]] + 12*transform[i-1+4]);
         if(cubie >= 24) {
            cubie -= 24;
         }
         
         cube[transform[i-1]] = cubie;
      }
      
      cubie = (byte)(temp + 12*transform[7]);
      if(cubie >= 24) {
         cubie -= 24;
      }
      cube[transform[3]] = cubie;
   }
   
   public void rotateCorners(byte transform[]) {
      byte temp = cube[12 + transform[0]];
      
      byte cubie;
      for(byte i = 1; i < 4; i++) {
         cubie = (byte)(cube[12 + transform[i]] + 8*transform[i-1+4]);
         cubie = (byte)(cubie % 24);
         
         cube[12 + transform[i-1]] = cubie;
      }
      
      cubie = (byte)(temp + 8*transform[7]);
      cubie = (byte)(cubie % 24);
      cube[12 + transform[3]] = cubie;
   }
   
   public void performTransform(byte transform) {
      if(transforms[transform][0].length <= 0)
         return;
      
      rotateEdges(transforms[transform][0]);
      rotateCorners(transforms[transform][1]);
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
      for(int i = 0; i < descriptor.length; i++) {
         descriptor[i] = new byte[9];
         for(int j = 0; j < descriptor[i].length; j++) {
            descriptor[i][j] = (byte)i;
         }
      }
      
      fillEdges(descriptor);
      fillCorners(descriptor);
      
      return descriptor;
   }
   
   private void fillEdges(byte descriptor[][]) {
      for(int i = 0; i < 12; i++) {
         byte edge = cube[i];
         
         int offset = edge / 12;
         byte c1, c2;
         c1 = EDGE_LOCATIONS[edge % 12][offset*2];
         c2 = EDGE_LOCATIONS[edge % 12][(offset*2 + 2) % 4];
         
         descriptor[EDGE_LOCATIONS[i][0]][EDGE_LOCATIONS[i][1]] = c1;
         descriptor[EDGE_LOCATIONS[i][2]][EDGE_LOCATIONS[i][3]] = c2;
      }
   }
   
   private void fillCorners(byte descriptor[][]) {
      for(int i = 0; i < 8; i++) {
         byte corner = cube[i+12];
         
         int offset = corner / 8;
         byte c1 = CORNER_LOCATIONS[corner % 8][offset*2];
         byte c2 = CORNER_LOCATIONS[corner % 8][(offset*2 + 2) % 6];
         byte c3 = CORNER_LOCATIONS[corner % 8][(offset*2 + 4) % 6];
         
         descriptor[CORNER_LOCATIONS[i][0]][CORNER_LOCATIONS[i][1]] = c1;
         descriptor[CORNER_LOCATIONS[i][2]][CORNER_LOCATIONS[i][3]] = c2;
         descriptor[CORNER_LOCATIONS[i][4]][CORNER_LOCATIONS[i][5]] = c3;
      }
   }
   
   public byte findEdge(byte edge) {
      for(int i = 0; i < 12; i++) {
         if(cube[i] == edge) {
            return (byte)i;
         } else if ((cube[i] + 12)%24 == edge) {
            return (byte)((i + 12)%24);
         }
      }
      System.out.println(EDGE_STRINGS[edge]);
      printCube();
      throw new RuntimeException("Invalid cube configuration.");
   }
   
   public byte findCorner(byte corner) {
      for(int i = 0; i < 8; i++) {
         if(cube[i+12] == corner) {
            return (byte)i;
         } else if((cube[i+12] + 8)%24 == corner) {
            return (byte)((i + 8)%24);
         } else if((cube[i+12] + 16)%24 == corner) {
            return (byte)((i + 16)%24);
         }
      }
      printCube();
      throw new RuntimeException("Invalid cube configuration.");
   }
   
   public void printCube() {
      byte descriptor[][] = getDescriptor();
      
      for(int i = 0; i < 3; i++) {
         System.out.print("    ");
         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(descriptor[TOP][i*3 + j]));
         }
         System.out.println("        ");
      }
      
      for(int i = 0; i < 3; i++) {
         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(descriptor[LEFT][i*3 + j]));
         }
         System.out.print(" ");

         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(descriptor[FRONT][i*3 + j]));
         }
         System.out.print(" ");

         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(descriptor[RIGHT][i*3 + j]));
         }
         System.out.print(" ");

         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(descriptor[BACK][i*3 + j]));
         }
         System.out.println();
      }
      
      for(int i = 0; i < 3; i++) {
         System.out.print("    ");
         for(int j = 0; j < 3; j++) {
            System.out.print(getColorCharacter(descriptor[DOWN][i*3 + j]));
         }
         System.out.println("        ");
      }
      
      System.out.println();
      
      for(int i = 0 ; i < 12; i++) {
         System.out.print(EDGE_STRINGS[cube[i]] + " ");
      }
      for(int i = 0; i < 8; i++) {
         System.out.print(CORNER_STRINGS[cube[i+12]] + " ");
      }
   }
   
   private String getColorCharacter(byte color) {
      switch(color) {
      case TOP: return "U";
      case LEFT: return "L";
      case FRONT: return "F";
      case RIGHT: return "R";
      case BACK: return "B";
      case DOWN: return "D";
      default: return "I";
      }
   }
}
