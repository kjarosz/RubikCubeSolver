package solver;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Solver extends JFrame {
   
   private CubeInputPanel mCubeInputPanel;

   public Solver() {
      createWidgets();
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      pack();
   }
   
   private void createWidgets() {
      setLayout(new BorderLayout());
      mCubeInputPanel = new CubeInputPanel();
      add(mCubeInputPanel, BorderLayout.CENTER);
      
      
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
