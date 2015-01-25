package solver.ui;

import java.awt.GridLayout;

import javax.swing.JPanel;

import solver.algorithms.Cube;
import solver.algorithms.Cube.CubeColor;

public class CubeInputPanel extends JPanel {
   private FaceInputPanel mFaces[];
   
   public CubeInputPanel() {
      createWidgets();
   }
   
   private void createWidgets() {
      GridLayout layout = new GridLayout(3, 4);
      layout.setHgap(5);
      layout.setVgap(5);
      setLayout(layout);
      
      createFaces();
   }
   
   private void createFaces() {
      mFaces = new FaceInputPanel[6];
      
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
   
   public Cube.CubeColor[][] getCubeDescriptor() {
      Cube.CubeColor descriptor[][] = new Cube.CubeColor[6][];
      
      for(int i = 0; i < 6; i++) {
         descriptor[i] = new Cube.CubeColor[9];
         Cube.CubeColor face[] = mFaces[i].getColors();
         for(int j = 0; j < 9; j++) {
            descriptor[i][j] = face[j];
         }
      }
      
      return descriptor;
   }
   
   public void setCubeDescriptor(Cube.CubeColor descriptor[][]) {
      for(int i = 0; i < 6; i++) {
         mFaces[i].setColors(descriptor[i]);
      }
   }
}