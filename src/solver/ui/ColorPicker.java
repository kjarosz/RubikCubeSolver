package solver.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPopupMenu;

import solver.algorithms.Cube;

public class ColorPicker extends JPopupMenu {
   
   private static class PickerButton extends JButton {
      private static final Dimension PICKER_BUTTON_SIZE = new Dimension(25, 25);
      
      private Cube.CubeColor color;
      
      public PickerButton(final ColorPicker picker, final CubeButton cubeButton, final Cube.CubeColor color) {
         setMinimumSize(PICKER_BUTTON_SIZE);
         setPreferredSize(PICKER_BUTTON_SIZE);
         setMaximumSize(PICKER_BUTTON_SIZE);
         setSize(PICKER_BUTTON_SIZE);
         
         this.color = color;
         addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               cubeButton.setCubeColor(color);
               picker.setVisible(false);
            }
         });
      }
      
      @Override
      public void paintComponent(Graphics g) {
         g.setColor(getColor());
         g.fillRect(0, 0, getWidth(), getHeight());
      }

      private Color getColor() {
         switch(color) {
         case BLUE: return Color.BLUE;
         case WHITE: return Color.WHITE;
         case RED: return Color.RED;
         case YELLOW: return Color.YELLOW;
         case ORANGE: return Color.ORANGE;
         case GREEN: return Color.GREEN;
         default: return Color.BLACK;
         }
      }
   }
   
   public ColorPicker(CubeButton button) {
      createWidgets(button);
   }
   
   private void createWidgets(CubeButton button) {
      setLayout(new GridLayout(2, 3));
      
      for(int i = 0; i < 6; i++) {
         add(new PickerButton(this, button, Cube.CubeColor.values()[i]));
      }
   }
   
   public int calculateWidth() {
      return PickerButton.PICKER_BUTTON_SIZE.width * 3;
   }
   
   public int calculateHeight() {
      return PickerButton.PICKER_BUTTON_SIZE.height * 2;
   }
}
