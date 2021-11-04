package calcGUI;
import java.awt.*;
import javax.swing.JFrame; 
/*
 * Frame for our calculator program - The constructor sets up the entire frame and adds the panel.
 * Add and update the frame as necessary, since we won't have one but three panels. 
 */
public class calcFrame extends JFrame{
	calcFrame(){
		this.add(new CalcGo()); // add panel to the frame. 
		this.setTitle("Basic Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
