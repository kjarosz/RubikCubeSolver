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
      Cube goal = new Cube();
      mCorners.put(getCornerArrangement(goal), (byte)0);
      
      byte moves[] = new byte[11];
      
      byte depth = 0;
      while(depth < 11 && !mStop) {
         reportProgress(reporter, depth);
         
         findCornerHeuristics(0, depth, goal, moves);
         
         depth++;
      }
   }

   private void findCornerHeuristics(int level, int depth, Cube cube, byte moves[]) {
      if(mStop) {
         return;
      }
      
      for(byte i = 0; i < 12; i++) {
         moves[level] = i;
         
         if(moveIsStupid(level, moves)) {
            continue;
         }
         
         Cube newCube = new Cube(cube);
         newCube.performTransform(i);
         
         if(level < depth) {
            findCornerHeuristics(level+1, depth, newCube, moves);
         } else {
            String cornerArr = getCornerArrangement(newCube);
            if(mCorners.containsKey(cornerArr)) {
               continue;
            }
            mCorners.put(cornerArr, (byte)(depth+1));
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
