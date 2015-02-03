package solver.algorithms;

import solver.ui.ProgressReporter;

public class IDASolver implements SolvingAlgorithm {
   
   private boolean mStop;
   
   @Override
   public Algorithm solveCube(Cube startingCube, ProgressReporter progressReporter) {
      mStop = false;
      
      if(startingCube.cubeSolved()) {
         mStop = true;
         return new Algorithm(startingCube);
      }
                 
      Algorithm levelAlgorithm[] = new Algorithm[20];
      byte levelIndices[] = new byte[20];
      for(byte i = 0; i < 20; i++) {
         levelIndices[i] = 0;
      }
      
      levelAlgorithm[0] = new Algorithm(startingCube);
      
      boolean solutionFound = false;
      Algorithm solution = null;
      byte depth = -1;
      
      MainLoop:
      while(!solutionFound) {
         updateLevel(progressReporter, ++depth);
         
         int level = 0;
         levelIndices[0] = 0;
         while(true) {
            if(mStop) {
               break MainLoop;
            }
            
            while(level < depth) {
               if(level < 0) {
                  continue MainLoop;
               }
               
               if(levelIndices[level] < 12) {
                  if(!moveIsStupid(levelAlgorithm[level], levelIndices[level])) {
                     levelAlgorithm[level+1] = new Algorithm(levelAlgorithm[level], levelIndices[level]);
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
            
            for(byte i = 0; i < 12; i++) {
               if(moveIsStupid(levelAlgorithm[level], i))
                  continue;
               
               Algorithm newAlgorithm = new Algorithm(levelAlgorithm[level], i);
               if(newAlgorithm.cubeState.cubeSolved()) {
                  solutionFound = true;
                  solution = newAlgorithm;
                  break MainLoop;
               }
            }
            level--;
         }
      }
      
      return solution;
   }
   
   @Override
   public void stop() {
      mStop = true;
   }
   
   private void updateLevel(ProgressReporter reporter, final int level) {
      reporter.updateProgress("Working level: " + (level+1));
   }
   
   private boolean moveIsStupid(Algorithm algorithm, byte move) {
      if(algorithm.moves.length == 0) {
         return false;
      }
      
      byte lastMove = algorithm.moves[algorithm.moves.length-1];
      
      // Do not repeat move
      if(move == lastMove && algorithm.moves.length > 1) {
         byte secondToLast = algorithm.moves[algorithm.moves.length - 2];
         if(secondToLast == move)
            return true;
         else
            return false;
      }
      
      // Commutative moves
      switch(move) {
      case Algorithm.D:
      case Algorithm.Di:
         if(lastMove == Algorithm.F || lastMove == Algorithm.Fi) {
            return true;
         }
         break;
      case Algorithm.R:
      case Algorithm.Ri:
         if(lastMove == Algorithm.L || lastMove == Algorithm.Li) {
            return true;
         }
         break;
      case Algorithm.B:
      case Algorithm.Bi:
         if(lastMove == Algorithm.F || lastMove == Algorithm.Fi) {
            return true;
         }
         break;
      default:
         break;
      }
      
      // If move undoes the last one.
      if(move % 2 == 0) {
         return lastMove == move + 1;
      } else {
         return lastMove == move - 1;
      }
   }
    
    
}
