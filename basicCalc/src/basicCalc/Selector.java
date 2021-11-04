package basicCalc;
import java.util.Scanner;
public class Selector {
	public static void selection() {
		double inOne; //first and second double inputs from user.
		double inTwo;
		int sel = 0; // User selector.
		Calculate calculator = new Calculate();
		Scanner scan = new Scanner(System.in);
		Menu menu = new Menu();
		while(sel != 6) {
		if(sel == 1) {
			System.out.println("Please enter your first value");
			 inOne = scan.nextDouble();
			System.out.println("Please enter your second value");
			 inTwo = scan.nextDouble();
			 calculator.calculationAdd(inOne, inTwo);
			 sel = 0;
		} else if(sel == 2) {
			System.out.println("Please enter your first value");
			inOne = scan.nextDouble();
			System.out.println("Please enter your second value");
			inTwo = scan.nextDouble();
			calculator.calculationSubtract(inOne, inTwo);
			sel = 0;
		} else if(sel == 3) {
			System.out.println("Please enter your first value");
			inOne = scan.nextDouble();
			System.out.println("Please enter your second value");
			inTwo = scan.nextDouble();
			calculator.calculationMult(inOne, inTwo);
			sel = 0;
		} else if(sel == 4) {
			System.out.println("Please enter your first value");
			inOne = scan.nextDouble();
			System.out.println("Please enter your second value");
			inTwo = scan.nextDouble();
			calculator.calculationDiv(inOne, inTwo);
			sel = 0;
		} else if(sel == 0){ // This is the menu printer. Default place for program.
			menu.returnMenu();
			sel = scan.nextInt();
		}
		
		else
		System.out.println("I have no clue what you just selected.");
		} 
	}
}
