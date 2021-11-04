package framers;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FrameEst implements ActionListener{
	JFrame frame;
	JPanel panel;
	JScrollPane scroller;
	JTextArea texty; 
	JCheckBox checkers;
	public void framed() {
		// Frame creation
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 500);
		frame.setVisible(true);
		// TextArea creation
		texty = new JTextArea(10, 20);
		JScrollPane scroller = new JScrollPane(texty);
		texty.setLineWrap(true);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// Checkbox creation
		checkers = new JCheckBox("Created text editor.");
		checkers.addActionListener(this);
		// Panel creation and setting
		panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(texty);
		// adding components to frame:
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, checkers);
	}
	
		// action Performed
		public void actionPerformed(ActionEvent event) {
			texty.append("Well done! \n ");
	}
}
