package solver;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class CubeButton extends JButton {
   private static final Dimension BUTTON_SIZE = new Dimension(25, 25);
   
   private int mColor;
   
   public CubeButton(int color) {
      setMinimumSize(BUTTON_SIZE);
      setPreferredSize(BUTTON_SIZE);
      setMaximumSize(BUTTON_SIZE);
      setSize(BUTTON_SIZE);
      
      mColor = color;
      setContextMenu();
   }
   
   private void setContextMenu() {
      final ColorPicker colorPicker = new ColorPicker(this);
      addMouseListener(new MouseAdapter() {
         @Override
         public void mousePressed(MouseEvent ev) {
            colorPicker.show((JButton)ev.getSource(), 
                  ev.getX() - colorPicker.calculateWidth()/2, 
                  ev.getY() - colorPicker.calculateHeight()/2);
         }
      });
   }
   
   public void setCubeColor(int color) {
      mColor = color;
   }
   
   public int getCubeColor() {
      return mColor;
   }
   
   @Override
   public void paintComponent(Graphics g) {
      g.setColor(getColor());
      g.fillRect(0, 0, getWidth(), getHeight());
   }
   
   private Color getColor() {
      return Cube.sFace_Colors[mColor];
   }
}
