package calcPack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcPanel implements ActionListener{
	// The following is all of our variables:
	JTextField textfield;
	JFrame frame;
	JPanel panelbottom;
	JPanel paneltop;
	JPanel buttonNums;
	//Buttons and text: 
	JButton[] numberButtons = new JButton[10]; // instead of having a bunch of individual JButtons, we have them in the form of an array.
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton, negButton;
	Font myFont = new Font("Liberation Serif", Font.BOLD, 30);
	Font twoBFont = new Font("Ubuntu", Font.BOLD, 30);
	// doubles and ints: 
	int SCREEN_WIDTH = 450;
	int SCREEN_HEIGHT = 550; 
	double num1 = 0 ;
	double num2 = 0;
	double result;
	char operator; 
	
	CalcPanel(){ // our calc panel. Created with the beauty of the constructor :)
		frame = new JFrame("Calculator");
		panelbottom = new JPanel();
		paneltop = new JPanel();
		buttonNums = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);

		//frame.setLayout(null);
		textfield = new JTextField();
		frame.setVisible(true);
		textfield.setEditable(false);
		textfield.setFont(myFont);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		negButton = new JButton("[-]");
		//button times:
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = clrButton;
		functionButtons[7] = delButton;
		functionButtons[8] = negButton;
		for(int i = 0; i < 9; i++) { // function buttons
			//functionButtons[i] = new JButton(String.valueOf(i));
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(twoBFont);
			functionButtons[i].setFocusable(false);
			functionButtons[i].setBackground(new Color(0, 96, 20));
		}
		for(int i = 0; i < 10; i++) { // number buttons
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setBackground(Color.orange);
			numberButtons[i].setFocusable(false);
		}
		//delButton.setPreferredSize(new Dimension(100, 40));
		//clrButton.setPreferredSize(new Dimension(100, 40));
		//negButton.setPreferredSize(new Dimension(100, 40));
		frame.getContentPane().add(BorderLayout.SOUTH, panelbottom);
		frame.getContentPane().add(BorderLayout.NORTH, textfield);
		frame.getContentPane().add(BorderLayout.CENTER, buttonNums);
		panelbottom.setLayout(new GridLayout(1, 3));
		panelbottom.add(clrButton);
		panelbottom.add(delButton);
		panelbottom.add(negButton);
		panelbottom.setBackground(Color.gray);
		//paneltop.add(textfield);
		buttonNums.setBackground(Color.LIGHT_GRAY);
		buttonNums.setLayout(new GridLayout(4, 4, 10, 10));
		buttonNums.add(numberButtons[1]);
		buttonNums.add(numberButtons[2]);
		buttonNums.add(numberButtons[3]);
		buttonNums.add(addButton);
		buttonNums.add(numberButtons[4]);
		buttonNums.add(numberButtons[5]);
		buttonNums.add(numberButtons[6]);
		buttonNums.add(subButton);
		buttonNums.add(numberButtons[7]);
		buttonNums.add(numberButtons[8]);
		buttonNums.add(numberButtons[9]);
		buttonNums.add(mulButton);
		buttonNums.add(decButton);
		buttonNums.add(numberButtons[0]);
		buttonNums.add(equButton);
		buttonNums.add(divButton);
		
		


	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		if(e.getSource() == clrButton) {
			textfield.setText(null);
		}
		if(e.getSource() == addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");
		}
		if(e.getSource() == subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if(e.getSource() == mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
		if(e.getSource() == divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if(e.getSource() == equButton) {
			num2 = Double.parseDouble(textfield.getText());
			switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			}
			textfield.setText(String.valueOf(result));
			num1 = result;
		}
		if(e.getSource() == delButton) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i =0 ; i < string.length() - 1; i++) {
				textfield.setText(textfield.getText() + string.charAt(i));
			}
		}
		
	}
	
}
