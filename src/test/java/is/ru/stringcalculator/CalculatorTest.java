package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.fail;
import static java.lang.String.format;



public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() throws Exception  {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() throws Exception  {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers()  throws Exception {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
    public void testMultipleNumbers() throws Exception {
    	assertEquals(6, Calculator.add("1,2,3"));
    }

	@Test
		public void testNewLine() throws Exception {
			assertEquals(3, Calculator.add("1\n2"));
		}

	@Test
		public void testNewLineMultipleNumbers() throws Exception {
			assertEquals(6, Calculator.add("1\n2\n3"));
		}

	@Test
		public void testNewLineOrComma() throws Exception {
			assertEquals(6, Calculator.add("1,2\n3"));
		}

	@Test
		public void testNewDelimiter() throws Exception {
			assertEquals(3, Calculator.add("//;\n1;2"));
		}

	@Test
		public void testNotGreaterthan1000() throws Exception {
			assertEquals(20, Calculator.add("10,10,1001"));
		}


}
