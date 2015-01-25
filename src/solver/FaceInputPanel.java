package solver;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class FaceInputPanel extends JPanel {
   private CubeButton mButtons[];
   
   public FaceInputPanel(String face, int startingColor) {
      createWidgets(face, startingColor);
   }
   
   private void createWidgets(String face, int startingColor) {
      setLayout(new BorderLayout());
      addFaceTitle(face);
      addInputButtons(startingColor);
   }
   
   private void addFaceTitle(String face) {
      add(new JLabel(face), BorderLayout.NORTH);
   }
   
   private void addInputButtons(int startingColor) {
      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new GridLayout(3, 3));
      
      mButtons = new CubeButton[9];
      for(int i = 0; i < 9; i++) {
         if(i == 4) { // Center button
            mButtons[i] = new CubeButton(startingColor, true);
         } else { // Other buttons
            mButtons[i] = new CubeButton(startingColor, false);
         }
         buttonPanel.add(mButtons[i]);
      }
      
      add(buttonPanel, BorderLayout.CENTER);
   }
   
   public int[] getColors() {
      int colors[] = new int[9];
      for(int i = 0; i < 9; i++) {
         colors[i] = mButtons[i].getCubeColor();
      }
      return colors;
   }
   
   public void setColors(int colors[]) {
      for(int i = 0; i < 9; i++) {
         mButtons[i].setCubeColor(colors[i]);
      }
   }
}
