package solver.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import solver.algorithms.Cube;

public class CubeButton extends JButton {
   private static final Dimension BUTTON_SIZE = new Dimension(25, 25);
   
   private byte mColor;
   
   public CubeButton(byte color) {
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
   
   public void setCubeColor(byte color) {
      mColor = color;
   }
   
   public byte getCubeColor() {
      return mColor;
   }
   
   @Override
   public void paintComponent(Graphics g) {
      g.setColor(getColor());
      g.fillRect(0, 0, getWidth(), getHeight());
   }
   
   private Color getColor() {
      switch(mColor) {
      case Cube.TOP: return Color.BLUE;
      case Cube.LEFT: return Color.WHITE;
      case Cube.FRONT: return Color.RED;
      case Cube.RIGHT: return Color.YELLOW;
      case Cube.BACK: return Color.ORANGE;
      case Cube.BOTTOM: return Color.GREEN;
      default: return Color.BLACK;
      }
   }
}
