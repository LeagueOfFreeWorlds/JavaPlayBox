package thepack;
import java.awt.*;
import javax.swing.*;
public class Execution {
	int x = 20;
	int y = 20;
	
	public static void main(String[] args) {
		Execution simpleAni = new Execution();
		simpleAni.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Widget drawing = new Widget();
		
		frame.getContentPane().add(drawing);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for(int i = 0; i < 150; i++) {
			x++;
			y++;
			drawing.repaint();
			
			try { // what is a try catch method again??
				Thread.sleep(100); // measured in miliseconds
			} catch(Exception x) {
		}
	}
}
	// inner class
	class Widget extends JPanel{
		public void paintComponent(Graphics g) {
			g.setColor(Color.black);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.green);
			g.fillOval(x, y, 100, 100);
			
		}
	}
}
