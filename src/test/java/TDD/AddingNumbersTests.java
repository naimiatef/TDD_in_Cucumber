package TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingNumbersTests {
	private Calculator myCalculator = new Calculator();

	@Test
	public void addTwoPositiveNumbers() {
		int expectedResult = 30;
		int ActuaResult = myCalculator.Add(10, 20);
		Assert.assertEquals(expectedResult, ActuaResult);
	}

	@Test
	public void addTwoNegativeNumbers() {
		int expectedResult = -30;
		int ActuaResult = myCalculator.Add(-10, -20);
		Assert.assertEquals(expectedResult, ActuaResult);
	}
}
