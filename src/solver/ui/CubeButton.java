package solver.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;

import solver.algorithms.Cube;

public class CubeButton extends JButton {
   private static final Dimension BUTTON_SIZE = new Dimension(25, 25);
   
   private byte mColor;
   
   public CubeButton(byte color, boolean centerPiece) {
      setMinimumSize(BUTTON_SIZE);
      setPreferredSize(BUTTON_SIZE);
      setMaximumSize(BUTTON_SIZE);
      setSize(BUTTON_SIZE);
      
      mColor = color;
      if(centerPiece) {
         makeColorPicker();
      } else {
         setContextMenu();
      }
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
   
   private void makeColorPicker() {
      final CubeButton thisButton = this;
      addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            final JFrame parentWindow = (JFrame)SwingUtilities.getWindowAncestor(thisButton);
            
            final JDialog dialog = new JDialog();
            
            JPanel rPanel = new JPanel();
            rPanel.add(new JLabel("R:"));
            final JSlider red = new JSlider(JSlider.HORIZONTAL, 0, 255, Cube.sFace_Colors[mColor].getRed());
            rPanel.add(red);
            
            JPanel gPanel = new JPanel();
            gPanel.add(new JLabel("G:"));
            final JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, Cube.sFace_Colors[mColor].getGreen());
            gPanel.add(green);
            
            JPanel bPanel = new JPanel();
            bPanel.add(new JLabel("B:"));
            final JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, Cube.sFace_Colors[mColor].getBlue());
            bPanel.add(blue);
            
            Container container = dialog.getContentPane();
            container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
            container.add(rPanel);
            container.add(gPanel);
            container.add(bPanel);
            
            JPanel controlButtons = new JPanel();
            JButton ok = new JButton("Ok");
            ok.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  int r = red.getValue();
                  int g = green.getValue();
                  int b = blue.getValue();
                  Cube.sFace_Colors[mColor] = new Color(r, g, b);
                  dialog.setVisible(false);
                  parentWindow.repaint();
               }
            });
            controlButtons.add(ok);
            
            JButton cancel = new JButton("Cancel");
            cancel.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                  dialog.setVisible(false);
               }
            });
            controlButtons.add(cancel);
            
            container.add(controlButtons);
            
            dialog.pack();
            dialog.setVisible(true);
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
      return Cube.sFace_Colors[mColor];
   }
}
