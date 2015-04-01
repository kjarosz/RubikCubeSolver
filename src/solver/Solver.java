package solver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import solver.algorithms.Algorithm;
import solver.algorithms.Cube;
import solver.algorithms.SolverFactory;
import solver.algorithms.SolvingAlgorithm;
import solver.ui.CubeInputPanel;

public class Solver extends JFrame {
   
   private CubeInputPanel mCubeInputPanel;
   private JComboBox<String> mAlgorithmSelector;
   private JTextArea mOutput;
   private JButton mSolveButton;
   
   private SolverFactory mSolverFactory;
   
   // Thread control
   private boolean mSolve;
   private SolvingAlgorithm mSolvingAlgorithm;
   
   public Solver() {
      mSolverFactory = SolverFactory.getInstance(getAlgorithmStateListener());
      
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
      
      JScrollPane scrollPane = new JScrollPane();
      mOutput = new JTextArea();
      mOutput.setEditable(false);
      scrollPane.setViewportView(mOutput);
      solutionPanel.add(scrollPane, BorderLayout.CENTER);
      
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
              solveCube();
           } else {
              mSolvingAlgorithm.cancel(true);
           }
        }
      };
   }
   
   private PropertyChangeListener getAlgorithmStateListener() {
      return new PropertyChangeListener() {
         @Override
         public void propertyChange(PropertyChangeEvent event) {
            String property = event.getPropertyName();
            System.out.println(property);
            if("state".equals(property)) {
               String value = event.getNewValue().toString();
               System.out.println(value);
               if("STARTED".equals(value)) {
                  mSolve = true;
                  mSolveButton.setText("Stop");
               } else if("DONE".equals(value)) {
                  mSolve = false;
                  mSolveButton.setText("Solve");
               }
            }
         }
      };
   }
   
   private void solveCube() {
      if(mSolvingAlgorithm != null && !mSolvingAlgorithm.isDone()) {
         return;
      }
      
      byte descriptor[][] = mCubeInputPanel.getCubeDescriptor();
      Cube startingCube = new Cube(descriptor);
      
      String algorithmName = (String)mAlgorithmSelector.getSelectedItem();
      mSolvingAlgorithm = mSolverFactory.getAlgorithm(algorithmName);
      mSolvingAlgorithm.solveCube(startingCube, mOutput);
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
