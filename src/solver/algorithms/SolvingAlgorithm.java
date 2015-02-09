package solver.algorithms;

import solver.ui.ProgressReporter;

public interface SolvingAlgorithm {
   Algorithm solveCube(Cube startingCube, ProgressReporter progressReporter);
   void stop();
}
