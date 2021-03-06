package calculatorConstFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalcPanel extends JPanel implements ActionListener{
	JTextField textfield;
	JButton[] numberButtons = new JButton[10]; // instead of having a bunch of individual JButtons, we have them in the form of an array.
	JButton[] functionButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, delButton, clrButton;
	Font myFont = new Font("Liberation Serif", Font.BOLD, 30);
	// doubles and ints: 
	int SCREEN_WIDTH = 400;
	int SCREEN_HEIGHT = 550; 
	double num1 = 0;
	double num2 = 0;
	char operator; 
	CalcPanel(){
		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
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
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = clrButton;
		functionButtons[7] = delButton;
		for(int i = 0; i < 8; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		for(int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i)); // this will create a bunch of buttons for us without having to copy paste again and again. 
			numberButtons[i].addActionListener(this);
			
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
