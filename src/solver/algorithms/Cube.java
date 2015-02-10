package solver.algorithms;

import java.util.LinkedList;
import java.util.Random;


public class Cube {
   private byte cube[];
   
   /**
    * Create new cube in solved state.
    */
   public Cube() {
      cube = new byte[20];
      for(byte i = 0; i < 12; i++) {
         cube[i] = i;
      }
      for(byte i = 0; i < 8; i++) {
         cube[12 + i] = i;
      }
   }
   
   /**
    * Create a copy of source cube.
    * 
    * @param source original cube to copy.
    */
   public Cube(Cube source) {
      cube = new byte[20];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = source.cube[i];
      }
   }
   
   /**
    * Create a copy of source cube.
    * 
    * @param source original cube to copy.
    */
   public Cube(byte source[]) {
      cube = new byte[20];
      for(int i = 0; i < cube.length; i++) {
         cube[i] = source[i];
      }
   }
   
   /**
    * Create a cube from descriptor.
    * 
    * @param descriptor array that notes the colors of the stickers on each face of the cube.
    */
   public Cube(byte descriptor[][]) {
      cube = new byte[20];
      loadEdges(descriptor);
      loadCorners(descriptor);
   }
   
   /**
    * Utility function to convert a color descriptor into cubie edges.
    * 
    * @param descriptor array that notes the colors of the stickers on each face of the cube.
    */
   private void loadEdges(byte descriptor[][]) {
      for(int i = 0; i < 12; i++) {
         int c1 = descriptor[CubeConstants.EDGE_LOCATIONS[i][0]]
                            [CubeConstants.EDGE_LOCATIONS[i][1]];
         int c2 = descriptor[CubeConstants.EDGE_LOCATIONS[i][2]]
                            [CubeConstants.EDGE_LOCATIONS[i][3]];
         
         for(int j = 0; j < 12; j++) {
            if(c1 == CubeConstants.EDGE_LOCATIONS[j][0] && 
               c2 == CubeConstants.EDGE_LOCATIONS[j][2]) {
               cube[i] = (byte)j;
            } else 
            if(c1 == CubeConstants.EDGE_LOCATIONS[j][2] && 
               c2 == CubeConstants.EDGE_LOCATIONS[j][0]) {
               cube[i] = (byte)(j + 12);
            } 
         }
      }
   }
   
   /**
    * Utility function to convert a color descriptor into cubie corner.
    * 
    * @param descriptor array that notes the colors of the stickers on each face of the cube.
    */
   private void loadCorners(byte descriptor[][]) {
      for(int i = 0; i < 8; i++) {
         int c1 = descriptor[CubeConstants.CORNER_LOCATIONS[i][0]]
                            [CubeConstants.CORNER_LOCATIONS[i][1]];
         int c2 = descriptor[CubeConstants.CORNER_LOCATIONS[i][2]]
                            [CubeConstants.CORNER_LOCATIONS[i][3]];
         int c3 = descriptor[CubeConstants.CORNER_LOCATIONS[i][4]]
                            [CubeConstants.CORNER_LOCATIONS[i][5]];
         
         for(int j = 0; j < 3; j++) {
            for(int k = 0; k < 8; k++) {
               if(c1 == CubeConstants.CORNER_LOCATIONS[k][j*2] &&
                  c2 == CubeConstants.CORNER_LOCATIONS[k][(j*2 + 2) % 6] &&
                  c3 == CubeConstants.CORNER_LOCATIONS[k][(j*2 + 4) % 6]) {
                  cube[12 + i] = (byte)(j*8 + k);
               }
            }
         }
      }
   }
   
   /**
    * Check if cube is in solved state. 
    * 
    * @return true if cube is in solved state. false if cube is not solved.
    */
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
   
   /**
    * Cycles edges on a face and permutes them correctly.
    * 
    * @param transform pre-defined cycle sequence from CubeConstants that
    *                  corresponds to the proper face rotation.
    */
   private void rotateEdges(byte transform[]) {
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

   /**
    * Cycles corners on a face and permutes them correctly.
    * 
    * @param transform pre-defined cycle sequence from CubeConstants that
    *                  corresponds to the proper face rotation.
    */
   private void rotateCorners(byte transform[]) {
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
   
   /**
    * Performs a face twist.
    * 
    * @param transform predefined transforms from CubeConstants.
    */
   public void performTransform(byte transform) {
      if(CubeConstants.transforms[transform][0].length <= 0)
         return;
      
      rotateEdges(CubeConstants.transforms[transform][0]);
      rotateCorners(CubeConstants.transforms[transform][1]);
   }
   
   /**
    * Scrambles the cube randomly and returns the moves used.
    * 
    * @param moves how many moves to use for scrambling
    * @return sequence of moves used to scramble
    */
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
   
   /**
    * Checks a move to see if it reverses progress in the moveset.
    * 
    * @param scrambleMoveset sequence of moves thus far.
    * @param move move to make
    * @return true if move is counterproductive. false otherwise
    */
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
   
   /**
    * Converts the cube into descriptor acceptable by the UI. 
    * 
    * @return color descriptor
    */
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
   
   /**
    * Convert cubie edges into descriptor values.
    * 
    * @param descriptor output descriptor array.
    */
   private void fillEdges(byte descriptor[][]) {
      for(int i = 0; i < 12; i++) {
         byte edge = cube[i];
         
         int offset = edge / 12;
         byte c1, c2;
         c1 = CubeConstants.EDGE_LOCATIONS[edge % 12][offset*2];
         c2 = CubeConstants.EDGE_LOCATIONS[edge % 12][(offset*2 + 2) % 4];
         
         descriptor[CubeConstants.EDGE_LOCATIONS[i][0]]
                   [CubeConstants.EDGE_LOCATIONS[i][1]] = c1;
         
         descriptor[CubeConstants.EDGE_LOCATIONS[i][2]]
                   [CubeConstants.EDGE_LOCATIONS[i][3]] = c2;
      }
   }

   /**
    * Convert cubie corners into descriptor values.
    * 
    * @param descriptor output descriptor array.
    */
   private void fillCorners(byte descriptor[][]) {
      for(int i = 0; i < 8; i++) {
         byte corner = cube[i+12];
         
         int offset = corner / 8;
         byte c1 = CubeConstants.CORNER_LOCATIONS[corner % 8][offset*2];
         byte c2 = CubeConstants.CORNER_LOCATIONS[corner % 8][(offset*2 + 2) % 6];
         byte c3 = CubeConstants.CORNER_LOCATIONS[corner % 8][(offset*2 + 4) % 6];
         
         descriptor[CubeConstants.CORNER_LOCATIONS[i][0]]
                   [CubeConstants.CORNER_LOCATIONS[i][1]] = c1;
         
         descriptor[CubeConstants.CORNER_LOCATIONS[i][2]]
                   [CubeConstants.CORNER_LOCATIONS[i][3]] = c2;
         
         descriptor[CubeConstants.CORNER_LOCATIONS[i][4]]
                   [CubeConstants.CORNER_LOCATIONS[i][5]] = c3;
      }
   }
   
   /**
    * Find location of edge cubie.
    * 
    * @param edge cubie (and its orientation) to be found
    * @return location of the cubie (oriented)
    */
   public byte findEdge(byte edge) {
      for(int i = 0; i < 12; i++) {
         if(cube[i] == edge) {
            return (byte)i;
         } else if ((cube[i] + 12)%24 == edge) {
            return (byte)((i + 12)%24);
         }
      }
      printCube();
      throw new RuntimeException("Invalid cube configuration.");
   }

   /**
    * Find location of corner cubie.
    * 
    * @param edge cubie (and its orientation) to be found
    * @return location of the cubie (oriented)
    */
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
   
   /**
    * Prints out the cube to standard output (typically console)
    */
   public void printCube() {
      byte descriptor[][] = getDescriptor();
      
      for(int i = 0; i < 3; i++) {
         System.out.print("    ");
         for(int j = 0; j < 3; j++) {
            System.out.print(
                  getColorCharacter(
                        descriptor[CubeConstants.TOP][i*3 + j]));
         }
         System.out.println("        ");
      }
      
      // Faces from CubeConstants [1, 4] 
      for(int k = 1; k < 5; k++) {
         for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
               System.out.print(getColorCharacter(descriptor[k][i*3 + j]));
            }
            System.out.print(" ");
         }
      }
      
      for(int i = 0; i < 3; i++) {
         System.out.print("    ");
         for(int j = 0; j < 3; j++) {
            System.out.print(
                  getColorCharacter(
                        descriptor[CubeConstants.DOWN][i*3 + j]));
         }
         System.out.println("        ");
      }
      
      System.out.println();
      
      for(int i = 0 ; i < 12; i++) {
         System.out.print(CubeConstants.EDGE_STRINGS[cube[i]] + " ");
      }
      for(int i = 0; i < 8; i++) {
         System.out.print(CubeConstants.CORNER_STRINGS[cube[i+12]] + " ");
      }
   }
   
   /**
    * Converts face constant to string.
    * 
    * @param face face constant
    */
   private String getColorCharacter(byte face) {
      switch(face) {
      case CubeConstants.TOP: return "U";
      case CubeConstants.LEFT: return "L";
      case CubeConstants.FRONT: return "F";
      case CubeConstants.RIGHT: return "R";
      case CubeConstants.BACK: return "B";
      case CubeConstants.DOWN: return "D";
      default: return "I";
      }
   }
}
