package solver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import solver.algorithms.Algorithm;
import solver.algorithms.Cube;
import solver.algorithms.SolverFactory;
import solver.algorithms.SolvingAlgorithm;
import solver.ui.CubeInputPanel;
import solver.ui.ProgressReporter;

public class Solver extends JFrame implements Runnable, ProgressReporter {
   
   private CubeInputPanel mCubeInputPanel;
   private JComboBox<String> mAlgorithmSelector;
   private JTextField mOutput;
   private JButton mSolveButton;
   
   private SolverFactory mSolverFactory;
   
   // Thread control
   private boolean mSolve;
   private SolvingAlgorithm mSolvingAlgorithm;
   
   public Solver() {  
      new Thread(this).start();
      
      mSolverFactory = SolverFactory.getInstance();
      
      createWidgets();
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      pack();
   }
   
   private void createWidgets() {
      setLayout(new BorderLayout());
      
      JPanel scramblerPanel = new JPanel();
      JTextArea scramblerOutput = new JTextArea(2, 30);
      scramblerOutput.setEditable(false);
      scramblerPanel.add(scramblerOutput);
      JButton scrambleButton = new JButton("Scramble");
      scrambleButton.addActionListener(scrambleButtonListener(scramblerOutput));
      scramblerPanel.add(scrambleButton);
      add(scramblerPanel, BorderLayout.NORTH);
      
      mCubeInputPanel = new CubeInputPanel();
      add(mCubeInputPanel, BorderLayout.CENTER);
      
      JPanel solutionPanel = createSolutionPanel();
      add(solutionPanel, BorderLayout.SOUTH);
   }
   
   private JPanel createSolutionPanel() {
      JPanel solutionPanel = new JPanel();
      solutionPanel.setLayout(new BorderLayout());
      
      mOutput = new JTextField();
      mOutput.setEditable(false);
      solutionPanel.add(mOutput, BorderLayout.CENTER);
      
      JPanel controlPanel = new JPanel();
      mAlgorithmSelector = new JComboBox<>(mSolverFactory.getAvailableAlgorithms());
      mAlgorithmSelector.setSelectedIndex(0);
      controlPanel.add(mAlgorithmSelector);
      
      mSolveButton = new JButton("Solve");
      mSolveButton.addActionListener(solveButtonListener());
      controlPanel.add(mSolveButton);
      
      solutionPanel.add(controlPanel, BorderLayout.SOUTH);
      
      return solutionPanel;
   }
   
   private ActionListener scrambleButtonListener(final JTextArea output) {
      return new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            byte descriptor[][] = mCubeInputPanel.getCubeDescriptor();
            Cube cube = new Cube(descriptor);
            LinkedList<Byte> moves = cube.scramble(25);
            
            StringBuilder movelistString = new StringBuilder();
            int newlineCounter = 0;
            for(Byte move: moves) {
               String moveStr = Algorithm.MOVE_STRINGS[move];
               movelistString.append(moveStr + " ");
               newlineCounter++;
               if(newlineCounter == 13) {
                  newlineCounter = 0;
                  movelistString.append("\n");
               }
            }
            
            byte scrambledDescriptor[][] = cube.getDescriptor();
            mCubeInputPanel.setCubeDescriptor(scrambledDescriptor);
            
            output.setText(movelistString.toString());
            
            repaint();
         }
      };
   }
   
   private ActionListener solveButtonListener() {
      return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(!mSolve) {
              mSolve = true;
              mSolveButton.setText("Stop");
           } else {
              mSolvingAlgorithm.stop();
           }
        }
      };
   }
   
   @Override
   public void run() {
      while(true) {
         if(mSolve) {
            solveCube();
            
            SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                  mSolveButton.setText("Solve");
                  String outputText = mOutput.getText() + " (stopped)";
                  mOutput.setText(outputText);
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
      byte descriptor[][] = mCubeInputPanel.getCubeDescriptor();
      Cube startingCube = new Cube(descriptor);
      
      String algorithmName = (String)mAlgorithmSelector.getSelectedItem();
      mSolvingAlgorithm = mSolverFactory.getAlgorithm(algorithmName);
      Algorithm solution = mSolvingAlgorithm.solveCube(startingCube, this);
      if(solution != null)
         outputSolution(solution);
      
   }

   @Override
   public void updateProgress(final String progress) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            mOutput.setText(progress);
         }
      });
   }
   
   private void outputSolution(Algorithm solution) {
      final StringBuilder solutionString = new StringBuilder();
      for(Byte move: solution.moves) {
         solutionString.append(Algorithm.MOVE_STRINGS[move] + " ");
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
