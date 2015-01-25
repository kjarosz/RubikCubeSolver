package solver.algorithms;

import solver.algorithms.Algorithm.Move;
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
            
      final Move moveset[] = Move.values();
      
      Algorithm levelAlgorithm[] = new Algorithm[20];
      int levelIndices[] = new int[20];
      for(int i = 0; i < 20; i++) {
         levelIndices[i] = 0;
      }
      
      levelAlgorithm[0] = new Algorithm(startingCube);
      
      boolean solutionFound = false;
      Algorithm solution = null;
      int depth = -1;
      
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
               
               if(levelIndices[level] < moveset.length) {
                  if(!moveIsStupid(levelAlgorithm[level], moveset[levelIndices[level]])) {
                     levelAlgorithm[level+1] = new Algorithm(levelAlgorithm[level], moveset[levelIndices[level]]);
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
            
            for(int i = 0; i < moveset.length; i++) {
               if(moveIsStupid(levelAlgorithm[level], moveset[i]))
                  continue;
               
               Algorithm newAlgorithm = new Algorithm(levelAlgorithm[level], moveset[i]);
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
   
   private boolean moveIsStupid(Algorithm algorithm, Move move) {
      if(algorithm.moves.isEmpty()) {
         return false;
      }
      
      Move lastMove = algorithm.moves.getLast();
      
      // Do not repeat move
      if(move == lastMove && algorithm.moves.size() > 1) {
         Move secondToLast = algorithm.moves.get(algorithm.moves.size() - 2);
         if(secondToLast == move)
            return true;
         else
            return false;
      }
      
      // Commutative moves
      switch(move) {
      case D:
      case Di:
         if(lastMove == Move.F || lastMove == Move.Fi) {
            return true;
         }
         break;
      case R:
      case Ri:
         if(lastMove == Move.L || lastMove == Move.Li) {
            return true;
         }
         break;
      case B:
      case Bi:
         if(lastMove == Move.F || lastMove == Move.Fi) {
            return true;
         }
         break;
      default:
         break;
      }
      
      // If move undoes the last one.
      int moveIdx = move.ordinal();
      if(moveIdx % 2 == 0) {
         return lastMove.ordinal() == moveIdx + 1;
      } else {
         return lastMove.ordinal() == moveIdx - 1;
      }
   }
    
    
}
