import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotion implements MouseMotionListener{
    JFrame frame;
    JLabel label;

   public MouseMotion(){ 
    frame = new JFrame("Mouse Demonstration!");

        label = new JLabel();
        label.setBounds(200, 150, 250, 30);
        label.setForeground(new Color(192,192,192));

        frame.setSize(700, 500);
        frame.getContentPane().setBackground(new Color(0, 0,0));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);
        frame.addMouseMotionListener(this);
        frame.setVisible(true);
    }
    @Override
    public void mouseMoved(MouseEvent e){
         label.setText("Mouse moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseDragged(MouseEvent e){
         label.setText("Mouse dragged at (" + e.getX() + ", " + e.getY() + ")");
    }
    public static void main(String[] args) {
        new MouseMotion();
    }
}
