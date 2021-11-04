package snek;
import javax.swing.JFrame;
public class snekFrame extends JFrame{
	// we can literally create the snekFrame constructor with components in a seperate class:
	snekFrame(){
		this.add(new snekPanel()); // add ze snekPanel
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); // null will default to setting the panel in the center of the frame (0, 0 coordinates)
	}
}
