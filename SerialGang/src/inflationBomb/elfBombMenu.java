package inflationBomb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class elfBombMenu implements ActionListener{
	JFrame framed;
	//panels
	JPanel paneloo;
	JPanel paneltoo;
	//labs and buts
	JLabel labelOne;
	JLabel labelTwo;
	JButton buttonOne;
	JButton buttonTwo;
	JButton buttonThree;
	JButton buttonFour;
	public void getMenuOne() { // this is the menu, with buttons and stuff. idk.
		// instantiating buttons
		framed = new JFrame();
		framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paneloo = new JPanel();
		labelOne = new JLabel("Welcome to Elf Bomb! I don't know why I made this!");
		labelTwo = new JLabel("Please select your character");
		buttonOne = new JButton("Elf");
		buttonTwo = new JButton("Albino Orc");
		buttonThree = new JButton("Nitrocellulose Bomb");
		//getting framed now
		paneloo.add(buttonOne);
		paneloo.add(buttonTwo);
		paneloo.add(buttonThree);
		paneloo.add(buttonFour);
		paneltoo.add(labelOne);
		paneltoo.add(labelTwo);
		framed.getContentPane().add(BorderLayout.CENTER, paneloo);
		framed.getContentPane().add(BorderLayout.NORTH, paneltoo);
		framed.setSize(350, 300);
		//framed.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ev) {
		
	}
}
