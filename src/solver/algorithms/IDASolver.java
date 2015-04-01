package solver.algorithms;

import java.beans.PropertyChangeListener;


public class IDASolver extends SolvingAlgorithm {
   
   private IDAHeuristic mHeuristic;
   
   public IDASolver(PropertyChangeListener progressTracker) {
      super(progressTracker);
      mHeuristic = new IDAHeuristic(this);
   }

   @Override
   protected Algorithm doInBackground() throws Exception {
      if(startingCube.cubeSolved()) {
         return new Algorithm(startingCube);
      }
      
      if(!mHeuristic.isComputed()) {
         mHeuristic.computeHeuristics();
         if(isCancelled())
            return null;
      }
      
      byte depth = 0;
      byte moves[] = new byte[20];
      while(depth < 20) {
         updateLevel(depth);
         
         Algorithm solution = findSolution(0, depth, startingCube, moves);
         if(solution != null) {
            return solution;
         }
         
         if(isCancelled())
            break;
         
         depth++;
      }
      
      return null;
   }
   
   private Algorithm findSolution(int level, int depth, Cube cube, byte moves[]) {
      if(isCancelled()) {
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
   
   private void updateLevel(final int level) {
      publish("Working level: " + (level+1));
   }
   
   // Since publish is protected (for use within this class only),
   // and this algorithm may also execute the heuristic process, we
   // have to provide this utility method to report progress from
   // the heuristic subprocess.
   public void report(String report) {
      publish(report);
   }
    
}
