package solver.algorithms;

import java.awt.Color;

public final class CubeConstants {
   private CubeConstants() {}
   
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
   
   public static final byte transforms[][][] = {
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
}
