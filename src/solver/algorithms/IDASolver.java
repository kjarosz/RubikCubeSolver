package solver.algorithms;

import solver.ui.ProgressReporter;

public class IDASolver implements SolvingAlgorithm {
   
   private IDAHeuristic mHeuristic;
   
   private boolean mStop;
   
   public IDASolver() {
      mHeuristic = new IDAHeuristic();
   }
   
   @Override
   public Algorithm solveCube(Cube startingCube, ProgressReporter progressReporter) {
      mStop = false;
      
      if(startingCube.cubeSolved()) {
         mStop = true;
         return new Algorithm(startingCube);
      }
      
      if(!mHeuristic.isComputed()) {
         mHeuristic.computeHeuristics(progressReporter);
         if(mStop)
            return null;
      }
      
      byte depth = 0;
      byte moves[] = new byte[20];
      while(depth < 20) {
         updateLevel(progressReporter, depth);
         
         Algorithm solution = findSolution(0, depth, startingCube, moves);
         if(solution != null) {
            return solution;
         }
         
         if(mStop)
            break;
         
         depth++;
      }
      
      return null;
   }
   
   private Algorithm findSolution(int level, int depth, Cube cube, byte moves[]) {
      if(mStop) {
         return null;
      }
      
      for(byte i = 0; i < 12; i++) {
         moves[level] = i;
         
         if(moveIsStupid(level, moves)) {
            continue;
         }
         
         Cube nextLevelCube = new Cube(cube);
         nextLevelCube.performTransform(i);
         
         if(level < depth) {
            Algorithm solution = findSolution(level+1, depth, nextLevelCube, moves);
            if(solution != null) {
               solution.moves[level] = i;
               return solution;
            }
         } else {
            if(nextLevelCube.cubeSolved()) {
               Algorithm solution = new Algorithm(nextLevelCube);
               solution.moves = new byte[level+1];
               solution.moves[level] = i;
               return solution;
            }
         }
      }
      
      return null;
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
   
   @Override
   public void stop() {
      mStop = true;
      
      if(mHeuristic.isRunning())
         mHeuristic.stop();
   }
   
   private void updateLevel(ProgressReporter reporter, final int level) {
      reporter.updateProgress("Working level: " + (level+1));
   }
    
    
}
