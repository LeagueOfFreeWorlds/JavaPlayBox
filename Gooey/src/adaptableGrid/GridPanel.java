package adaptableGrid;
import java.awt.*;
import javax.swing.*;
public class GridPanel extends JPanel{
	int SCREEN_WIDTH = 600;
	int SCREEN_HEIGHT = 700; 
	int UNIT_SIZE = 30;
	boolean running = false; 
	GridPanel(){
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		running = true;
	}
	public void draw(Graphics g) { // here we will be painting the grid
		for(int i = 0; i > SCREEN_HEIGHT/UNIT_SIZE; i++) {
			if(running) {
				g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
				}
			}
			
		}
	public void calculate() { // we need to calculate the change in size of the menu. 
		/*
		 * As our frame changes in size, we need to ensure that the grid maintains a nice square grid pattern. 
		 * 
		 */
		
	}
	
}
