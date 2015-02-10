package solver.algorithms;

import java.util.HashMap;

import solver.ui.ProgressReporter;

public class IDAHeuristic {
   private HashMap<String, Byte> mCorners;
   private HashMap<String, Byte> mE1;
   private HashMap<String, Byte> mE2;
   
   private boolean mComputed;
   
   private boolean mRunning;
   private boolean mStop;
   
   public IDAHeuristic() {
      mCorners = new HashMap<String, Byte>();
      mE1 = new HashMap<String, Byte>();
      mE2 = new HashMap<String, Byte>();
      
      mComputed = false;
      mRunning = false;
      mStop = false;
   }
   
   public boolean isComputed() {
      return mComputed;
   }
   
   public boolean isRunning() {
      return mRunning;
   }
   
   public void stop() {
      mStop = true;
   }
   
   public void computeHeuristics(ProgressReporter reporter) {
      mRunning = true;
      mStop = false;
      
      // We have no idea where the previous algorithm has stopped.
      mCorners.clear();
      mE1.clear();
      mE2.clear();
      
      if(!mStop)
         computeCornerHeuristic(reporter);
      
      
      
      if(!mStop) 
         mComputed = true;
      
      mStop = true;
      mRunning = false;
   }
   
   private void computeCornerHeuristic(ProgressReporter reporter) {      
      Cube levelCube[] = new Cube[10];
      byte levelIndices[] = new byte[11];
      for(byte i = 0; i < 10; i++) {
         levelIndices[i] = 0;
      }

      Cube goal = new Cube();
      levelCube[0] = goal;
      
      mCorners.put(getCornerArrangement(goal), (byte)0);
      
      byte depth = -1;
      
      MainLoop:
      while(depth <= 9) {
         reportProgress(reporter, depth+2);
         
         int level = 0;
         levelIndices[0] = 0;
         while(true) {
            if(mStop) {
               break MainLoop;
            }
            
            while(level < depth) {
               if(level < 0) {
                  depth++;
                  continue MainLoop;
               }
               
               if(levelIndices[level] < 12) {
                  if(moveIsStupid(level, levelIndices)) {
                     Cube newCube = new Cube(levelCube[level]);
                     newCube.performTransform(levelIndices[level]);
                     levelCube[level+1] = newCube;
                     levelIndices[level]++;
                     level++;
                     levelIndices[level] = 0;
                  } else {
                     levelIndices[level]++;
                  }
               } else {
                  level--;
               }
            }
            
            for(levelIndices[level+1] = 0; levelIndices[level+1] < 12; levelIndices[level+1]++) {
               if(moveIsStupid(level+1, levelIndices))
                  continue;
               
               Cube cube = new Cube(levelCube[level]);
               cube.performTransform(levelIndices[level+1]);
               
               String cornerArr = getCornerArrangement(cube);
               if(mCorners.containsKey(cornerArr)) {
                  continue;
               }
               mCorners.put(cornerArr, depth);
            }
            level--;
         }
      }
   }
   
   private boolean moveIsStupid(int level, byte indices[]) {
      if(level == 0)
         return false;
      
      if(level == 1)
         return Algorithm.moveIsStupid((byte)-1, 
               indices[level-1], 
               indices[level]);
      
      if(level > 1)
         return Algorithm.moveIsStupid(indices[level-2], 
               indices[level-1], 
               indices[level]);
      
      return false;
   }
   
   private void reportProgress(ProgressReporter reporter, int level) {
      reporter.updateProgress("Corner Heuristic: Depth " + level);
   }
   
   private String getCornerArrangement(Cube cube) {
      StringBuilder builder = new StringBuilder();
      for(byte i = 0; i < 8; i++) {
         builder.append(cube.findCorner(i));
      }
      return builder.toString();
   }
   
   public byte heuristic(Cube cube) {
      String cornerArrangement = getCornerArrangement(cube);
      
      byte cornerMoves = mCorners.get(cornerArrangement);
      
      return cornerMoves;
   }
}
