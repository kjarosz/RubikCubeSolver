package solver;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

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
      super("Rubik's Cube Solver");
      
      mSolverFactory = SolverFactory.getInstance(getAlgorithmStateListener());
      
      createWidgets();
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      pack();
   }
   
   private void createWidgets() {
      setLayout(new BorderLayout());

      mCubeInputPanel = new CubeInputPanel();
      add(mCubeInputPanel, BorderLayout.CENTER);
      
      JPanel eastPanel = createEastPanel();
      add(eastPanel, BorderLayout.EAST);
   }
   
   private JPanel createEastPanel() {
      JPanel eastPanel = new JPanel();
      eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
      eastPanel.setPreferredSize(new Dimension(250, 0));
      
      eastPanel.setBorder(createOptionsBorder());
      
      JPanel scramblerPanel = createScramblePanel();
      eastPanel.add(scramblerPanel);
      
      eastPanel.add(Box.createVerticalStrut(5));
      
      JPanel solutionPanel = createSolutionPanel();
      eastPanel.add(solutionPanel);
      
      return eastPanel;
   }
   
   private Border createOptionsBorder() {
      Border titledBorder = BorderFactory.createTitledBorder("Options");
      return titledBorder;
   }
   
   private JPanel createScramblePanel() {
      JPanel scramblerPanel = new JPanel();
      scramblerPanel.setLayout(new BoxLayout(scramblerPanel, BoxLayout.Y_AXIS));

      JTextArea scramblerOutput = new JTextArea(2, 30);
      scramblerOutput.setEditable(false);
      scramblerOutput.setMaximumSize(new Dimension(300, 50));
      scramblerOutput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      
      JPanel buttonPanel = new JPanel();
      
      JButton resetButton = new JButton("Reset");
      resetButton.addActionListener(resetButtonListener(scramblerOutput));
      buttonPanel.add(resetButton);
      
      JButton scrambleButton = new JButton("Scramble");
      scrambleButton.addActionListener(scrambleButtonListener(scramblerOutput));
      buttonPanel.add(scrambleButton);
      
      scramblerPanel.add(buttonPanel);
      scramblerPanel.add(scramblerOutput);
      
      return scramblerPanel;
   }
   
   private JPanel createSolutionPanel() {
      JPanel solutionPanel = new JPanel();
      solutionPanel.setLayout(new BorderLayout());
      
      JScrollPane scrollPane = new JScrollPane();
      mOutput = new JTextArea();
      mOutput.setEditable(false);
      mOutput.setRows(6);
      scrollPane.setViewportView(mOutput);
      scrollPane.setBorder(BorderFactory.createTitledBorder("Output"));
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
   
   private ActionListener resetButtonListener(final JTextArea output) {
      return new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Meh, I don't feel like doing this efficiently.
            Cube cube = new Cube();
            byte resetCube[][] = cube.getDescriptor();
            mCubeInputPanel.setCubeDescriptor(resetCube);
            
            output.setText("");
            
            repaint();
         }
      };
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
            if("state".equals(property)) {
               String value = event.getNewValue().toString();
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
      // Set look and feel for the GUI
      try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      }
      catch (UnsupportedLookAndFeelException e) {
        System.out.println("Unsupported look and feel.");
        return;
      }
      catch (ClassNotFoundException e) {
        System.out.println("Look and feel class not found.");
        return;
      }
      catch (InstantiationException e) {
        System.out.println("Instantiation failed while setting look and feel.");
        return;
      }
      catch (IllegalAccessException e) {
        System.out.println("Illegal access while setting look and feel.");
        return;
      }
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Solver();
         }
      });
   }

}
