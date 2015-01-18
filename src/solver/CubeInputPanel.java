package solver;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class CubeInputPanel extends JPanel {
   private FaceInputPanel mFaces[];
   
   public CubeInputPanel() {
      createWidgets();
   }
   
   private void createWidgets() {
      setLayout(new GridLayout(3, 4));
      
      createFaces();
   }
   
   private void createFaces() {
      mFaces = new FaceInputPanel[9];
      
      add(new JPanel());
      
      mFaces[0] = new FaceInputPanel("Top", Cube.CubeColor.BLUE);
      add(mFaces[0]);
      
      add(new JPanel());
      add(new JPanel());
      
      mFaces[1] = new FaceInputPanel("Left", Cube.CubeColor.WHITE);
      mFaces[2] = new FaceInputPanel("Front", Cube.CubeColor.RED);
      mFaces[3] = new FaceInputPanel("Right", Cube.CubeColor.YELLOW);
      mFaces[4] = new FaceInputPanel("Back", Cube.CubeColor.ORANGE);
      
      for(int i = 1; i < 5; i++) {
         add(mFaces[i]);
      }
      
      add(new JPanel());
      
      mFaces[5] = new FaceInputPanel("Bottom", Cube.CubeColor.GREEN);
      add(mFaces[5]);
      
      add(new JPanel());
      add(new JPanel());
   }
}
