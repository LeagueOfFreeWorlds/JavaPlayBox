package test;
import java.awt.BorderLayout;

import javax.swing.*;
public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("hullo");
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		JButton button = new JButton("huy there");
		panel.add(button);
		frame.add(BorderLayout.NORTH, panel);
		
	}
}
