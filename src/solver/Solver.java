package solver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Solver extends JFrame implements Runnable {
   public static enum Move {
      L, Li, F, Fi, R, Ri,
      B, Bi, U, Ui, D, Di;
   }
   
   public static final String MOVE_STRINGS[] = {
      "L ", "Li", "F ", "Fi", "R ", "Ri", "B ", "Bi", "U ", "Ui", "D ", "Di"
   };
   
   private class Algorithm {
      Cube cubeState;
      LinkedList<Move> moves;
      
      public Algorithm(Cube cube) {
         cubeState = new Cube(cube);
         moves = new LinkedList<>();
      }
      
      public Algorithm(Algorithm algorithm, Move newMove) {
         cubeState = new Cube(algorithm.cubeState);
         cubeState.performTransform(newMove);
         moves = new LinkedList<>(algorithm.moves);
         moves.addFirst(newMove);
      }
   }
   
   private CubeInputPanel mCubeInputPanel;
   private JTextField mOutput;
   private JButton mSolveButton;

   private Cube mStartingCube;
   
   // Thread control
   private boolean mSolve;
   private boolean mStop;
   
   public Solver() {  
      new Thread(this).start();
      
      createWidgets();
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      pack();
   }
   
   private void createWidgets() {
      setLayout(new BorderLayout());
      mCubeInputPanel = new CubeInputPanel();
      add(mCubeInputPanel, BorderLayout.CENTER);
      
      JPanel solutionPanel = new JPanel();
      solutionPanel.setLayout(new BorderLayout());
      mOutput = new JTextField();
      mOutput.setEditable(false);
      solutionPanel.add(mOutput, BorderLayout.CENTER);
      mSolveButton = new JButton("Solve");
      mSolveButton.addActionListener(solveButtonListener());
      solutionPanel.add(mSolveButton, BorderLayout.EAST);
      add(solutionPanel, BorderLayout.SOUTH);
   }
   
   private ActionListener solveButtonListener() {
      return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(!mSolve) {
              startSolving();
              mSolveButton.setText("Stop");
           } else {
              mStop = true;
           }
        }
      };
   }
   
   private void startSolving() {
      Cube.CubeColor descriptor[][] = mCubeInputPanel.getCubeDescriptor();
      mStartingCube = new Cube(descriptor);
      mSolve = true;
   }
   
   @Override
   public void run() {
      while(true) {
         if(mSolve) {
            mStop = false;
            
            solveCube();
            
            SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                  mSolveButton.setText("Solve");
               }
            });
            mSolve = false;
         } else {
            try {
               Thread.sleep(100);
            } catch(InterruptedException ex) {
               System.out.println(ex.getMessage());
            }
         }
      }
   }
   
   private void solveCube() {
      if(mStartingCube.cubeSolved()) {
         mStop = true;
         return;
      }
      
      LinkedList<Algorithm> currentLevel = new LinkedList<>();
      LinkedList<Algorithm> nextLevel = new LinkedList<>();
      
      Algorithm startAlgorithm = new Algorithm(mStartingCube);
      currentLevel.add(startAlgorithm);
      
      boolean solutionFound = false;
      Algorithm solution = null;
      int level = 0;
      
      final Move moveset[] = Move.values();
      
      MainLoop:
      while(!solutionFound) {
         updateLevel(++level);
         
         while(!currentLevel.isEmpty()) {
            if(mStop) {
               break MainLoop;
            }
            
            Algorithm algorithm = currentLevel.pop();
            Move lastMove = null;
            if(!algorithm.moves.isEmpty())
               lastMove = algorithm.moves.getLast();
            for(Move move: moveset) {
               if(move == lastMove)
                  continue;
               
               Algorithm newAlgorithm = new Algorithm(algorithm, move);
               if(newAlgorithm.cubeState.cubeSolved()) {
                  solutionFound = true;
                  solution = newAlgorithm;
                  break MainLoop; // Don't even bother with the remainder.
               }
               
               nextLevel.add(newAlgorithm);
            }
         }
         
         currentLevel.addAll(nextLevel);
         nextLevel.clear();
      }
      
      if(solutionFound) {
         outputSolution(solution);
      }
   }
   
   private void updateLevel(final int level) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            mOutput.setText("Working level: " + level);
         }
      });
   }
   
   private void outputSolution(Algorithm solution) {
      StringBuilder solutionString = new StringBuilder();
      for(Move move: solution.moves) {
         solutionString.insert(0, MOVE_STRINGS[move.ordinal()] + " ");
      }
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            mOutput.setText(solutionString.toString());
         }
      });
   }
   
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Solver();
         }
      });
   }

}
