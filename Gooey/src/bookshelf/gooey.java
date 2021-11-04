package bookshelf;
// this class is responsible for creating the menu and other UI components for the frame.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;


import java.io.*;

class gooey implements ActionListener{
	// all GUI comps
	JFrame frame;
	JPanel panelOne;
	JPanel panelTwo;
	JMenuBar topMenu; 
	JButton buttonOne;
	JButton buttonTwo;
	JTextArea bookWriting; // This object will allow the user to input books they've read to the bookshelf.
	JMenu file, misc, subMenu; 
	JMenuItem about, quit;
	JCheckBoxMenuItem checkItem1, checkItem2;
	Font newFont;
	JScrollPane scroll;
	
	
	public void go() {
		// topMenuListener menuListener = new topMenuListener();
		frame = new JFrame("My Bookshelf");
		panelOne = new JPanel();
		// JButtons
		buttonOne = new JButton("See all saved books.");
		buttonTwo = new JButton("Go back"); 
		bookWriting = new JTextArea(100, 15);
		newFont = new Font("sansserif", Font.BOLD, 24);
		bookWriting.setFont(newFont);
		bookWriting.setLineWrap(true);
		scroll = new JScrollPane(bookWriting);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//////////////////////////////////////
		///////////////////// MENU ITEMS //////////////////////////////////////
		topMenu = new JMenuBar(); // a menubar for the user to have extra options.
		quit = new JMenuItem("Quit"); // top Menu
		file = new JMenu("File");
		misc = new JMenu("Misc"); // Menu Items 
		about = new JMenuItem("About", new ImageIcon("/media/nathan-host/DataCache/Misc/Programs (Self-Made)/Eclipse-Workspace/Gooey/90-906803_about-symbol-for-quantum-physics.jpeg")); // subMenu Items
		subMenu = new JMenu("Submenu");
		checkItem1 = new JCheckBoxMenuItem("Item #1");
		checkItem2 = new JCheckBoxMenuItem("Item #2");
		about.addActionListener(this);
		quit.addActionListener(this);
		checkItem1.addActionListener(this);
		checkItem2.addActionListener(this);
		///////////////////////////////////////////////////////////////////////////
		//Menubar est.
		subMenu.add(checkItem1);
		subMenu.add(checkItem2);
		misc.add(about);
		misc.add(subMenu);
		file.add(quit);
		topMenu.add(file);
		topMenu.add(misc);
		
	
		//panel est.
		//panelOne.add(bookWriting);
		panelOne.add(scroll);
		//frame est.
		frame.setJMenuBar(topMenu);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, buttonOne);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonTwo);
		frame.getContentPane().add(BorderLayout.CENTER, panelOne);
		
		frame.setSize(450, 500);
		frame.setVisible(true);
	}
		// actionListener
	// The method below will allow the program to react to the user's selections.
		@Override
		public void actionPerformed(ActionEvent event) {
			
			if (event.getSource() == about) {
				System.out.println("*Beep Boop* You have clicked me!");
			}
			if (event.getSource() == quit) { // This statement is used to kill the program.
				System.exit(0);
			}
			if (event.getSource() == checkItem1) {
				System.out.println("*Beep Boop* self destruct");
			}
			if (event.getSource() == checkItem2) {
				System.out.println("*Beep Boop* self destruct");
			}
		}


}
