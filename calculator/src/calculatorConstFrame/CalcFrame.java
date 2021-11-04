package calculatorConstFrame;
import javax.swing.*;
import java.awt.*;
public class CalcFrame extends JFrame{
	CalcFrame(){
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(450, 550);
		this.setLayout(null);
		this.add(new CalcPanel().textfield);
		this.add(new CalcPanel().delButton, BorderLayout.SOUTH);
		this.add(new CalcPanel().clrButton, BorderLayout.SOUTH);
	}
}
