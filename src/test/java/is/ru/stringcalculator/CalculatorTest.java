package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.fail;


public class CalculatorTest {

	private Calculator calculator;

	@Test
	public void init()
	{
		calculator = new Calculator();
	}

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString(){
		assertEquals(0, calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(3, calculator.add("1,2"));
	}

	@Test
		public void testNewLine(){
			assertEquals(3, Calculator.add("1\n2"));
		}

	@Test
		public void testNewLineOrComma(){
			assertEquals(6, Calculator.add("1\n2,3"));
		}

		@Test
			public void testDifferentDilemeter(){
				assertEquals(3, Calculator.add("//;\n1;2"));
			}

		@Test
		public void testNotGreaterthan1000(){
			assertEquals(20, Calculator.add("10,10,1001"));
		}

}
