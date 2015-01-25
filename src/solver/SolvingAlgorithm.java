package solver;

public interface SolvingAlgorithm {
   Algorithm solveCube(Cube startingCube, ProgressReporter progressReporter);
   void stop();
}
