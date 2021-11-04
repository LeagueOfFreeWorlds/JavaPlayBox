package intMainTester;

import org.junit.jupiter.api.Test;

public class CarSelector {
	@Test
	public void shouldCallMain() {
		String[] arguments = {"Ford", "ARM"};
		CarService.main(arguments);
	}
}
