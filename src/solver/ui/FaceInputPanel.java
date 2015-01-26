package solver.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FaceInputPanel extends JPanel {
   private CubeButton mButtons[];
   
   public FaceInputPanel(String face, byte startingColor) {
      createWidgets(face, startingColor);
   }
   
   private void createWidgets(String face, byte startingColor) {
      setLayout(new BorderLayout());
      addFaceTitle(face);
      addInputButtons(startingColor);
   }
   
   private void addFaceTitle(String face) {
      add(new JLabel(face), BorderLayout.NORTH);
   }
   
   private void addInputButtons(byte startingColor) {
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new GridLayout(3, 3));
      
      mButtons = new CubeButton[9];
      for(int i = 0; i < 9; i++) {
         mButtons[i] = new CubeButton(startingColor);
         buttonPanel.add(mButtons[i]);
      }
      
      add(buttonPanel, BorderLayout.CENTER);
   }
   
   public byte[] getColors() {
      byte colors[] = new byte[9];
      for(int i = 0; i < 9; i++) {
         colors[i] = mButtons[i].getCubeColor();
      }
      return colors;
   }
   
   public void setColors(byte colors[]) {
      for(int i = 0; i < 9; i++) {
         mButtons[i].setCubeColor(colors[i]);
      }
   }
}
