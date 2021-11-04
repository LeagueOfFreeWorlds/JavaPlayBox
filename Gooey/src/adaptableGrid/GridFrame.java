package adaptableGrid;
import java.awt.Color;

import javax.swing.*;
//import java.awt.*;
public class GridFrame extends JFrame{
	GridFrame(){
		this.add(new GridPanel());
		this.setTitle("Adaptable Grid!");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setResizable(false);
		
	}
}
