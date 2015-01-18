package solver;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class CubeButton extends JButton {
   private static final Dimension BUTTON_SIZE = new Dimension(25, 25);
   
   private Cube.CubeColor mColor;
   
   public CubeButton(Cube.CubeColor color) {
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
            colorPicker.show((JButton)ev.getSource(), ev.getX(), ev.getY());
         }
      });
   }
   
   public void setCubeColor(Cube.CubeColor color) {
      mColor = color;
   }
   
   public Cube.CubeColor getCubeColor() {
      return mColor;
   }
   
   @Override
   public void paintComponent(Graphics g) {
      g.setColor(getColor());
      g.fillRect(0, 0, getWidth(), getHeight());
   }
   
   private Color getColor() {
      switch(mColor) {
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
