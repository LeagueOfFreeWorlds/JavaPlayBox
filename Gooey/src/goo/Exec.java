package goo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exec{
	JFrame frame;
	JLabel label;
	public static void main(String[] args) {
		Exec gui = new Exec();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what happens when you press the X button.
		// Creating new buttons and labels
		JButton colorButton = new JButton("Change colors");
		JButton labelButton = new JButton("Change label");
		colorButton.addActionListener(new buttonListener());
		labelButton.addActionListener(new labelListener());
		
		label = new JLabel("I'm a label!");
		ovalColor panel = new ovalColor();
		
		
		frame.getContentPane().add(colorButton, BorderLayout.SOUTH);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(label, BorderLayout.WEST);
		frame.getContentPane().add(labelButton, BorderLayout.EAST);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	// inner class buttonListener
	class buttonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}
	class labelListener implements ActionListener{
		public void actionPerformed (ActionEvent event) {
			label.setText("Ouch!");
		}
	}
}

	
