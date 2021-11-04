package goo;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class ovalColor extends JPanel{ // inherits the JPanel.
	

	public void paintComponent(Graphics g) { // creating a 2d object
		Graphics2D g2d = (Graphics2D) g; // casting as Graphics2D
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); // creates black background for frame
		// Color generation 1
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color startColor = new Color(red, blue, green);
		// Color generation 2
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color endColor = new Color(red, blue, green);
		// Location generator
		int xLoc = (int) (Math.random() * this.getWidth());
		int yLoc = (int) (Math.random() * this.getHeight());
		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(xLoc, yLoc, 100, 100);
		
	}
	
}