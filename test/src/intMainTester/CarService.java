package intMainTester;

public class CarService {
	public static void main(String[] arguments) {
		CarSelector carSelector = new CarSelector();
		for(String argument : arguments) {
			carSelector.process(argument);
		}
		
	}
}
