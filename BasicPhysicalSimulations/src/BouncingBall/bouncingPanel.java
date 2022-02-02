package BouncingBall;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import Primitives.ForceEquations.*;

public class bouncingPanel extends JPanel implements ActionListener{
    NewtSecLaw secLaw;
    static final double gravity = 9.8;
    double x = 0, y = 0, velX = 2, velY = 2;
    bouncingPanel(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x, y, 40, 40);
        g2.fill(circle);
    }
    public void actionPerformed(ActionEvent e){
        x += velX;
        y += velY;
        repaint();
    }

}
