package solver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Solver extends JFrame implements Runnable {
   
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
      mStartingCube.printCube();
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
