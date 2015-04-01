package solver.ui;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import solver.algorithms.CubeConstants;

public class CubeInputPanel extends JPanel {
   private FaceInputPanel mFaces[];
   
   public CubeInputPanel() {
      createWidgets();
   }
   
   private void createWidgets() {
      setBorder(new EmptyBorder(10, 10, 10, 10));
      
      GridLayout layout = new GridLayout(3, 4);
      layout.setHgap(5);
      layout.setVgap(5);
      setLayout(layout);
      
      createFaces();
   }
   
   private void createFaces() {
      mFaces = new FaceInputPanel[6];
      
      add(new JPanel());
      
      mFaces[0] = new FaceInputPanel("Top", CubeConstants.TOP);
      add(mFaces[0]);
      
      add(new JPanel());
      add(new JPanel());
      
      mFaces[1] = new FaceInputPanel("Left", CubeConstants.LEFT);
      mFaces[2] = new FaceInputPanel("Front", CubeConstants.FRONT);
      mFaces[3] = new FaceInputPanel("Right", CubeConstants.RIGHT);
      mFaces[4] = new FaceInputPanel("Back", CubeConstants.BACK);
      
      for(int i = 1; i < 5; i++) {
         add(mFaces[i]);
      }
      
      add(new JPanel());
      
      mFaces[5] = new FaceInputPanel("Down", CubeConstants.DOWN);
      add(mFaces[5]);
      
      add(new JPanel());
      add(new JPanel());
   }
   
   public byte[][] getCubeDescriptor() {
      byte descriptor[][] = new byte[6][];
      
      for(byte i = 0; i < 6; i++) {
         descriptor[i] = new byte[9];
         byte face[] = mFaces[i].getColors();
         for(byte j = 0; j < 9; j++) {
            descriptor[i][j] = face[j];
         }
      }
      
      return descriptor;
   }
   
   public void setCubeDescriptor(byte descriptor[][]) {
      for(byte i = 0; i < 6; i++) {
         mFaces[i].setColors(descriptor[i]);
      }
   }
}
