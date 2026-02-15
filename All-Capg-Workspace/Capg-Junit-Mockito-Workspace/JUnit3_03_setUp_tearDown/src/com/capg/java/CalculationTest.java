package com.capg.java;

public class CalculationTest {

}
package com.capg.java;
import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	
	Calculation calculator;
	
	protected void setUp() {
		calculator = new Calculation();
	}
	
	public void testAdd() {
		Calculation call = new Calculation();
		int result = call.addition(2,3);
		assertEquals(5,result);
	}
	
	public void testSub() {
		Calculation call = new Calculation();
		int result = call.subtraction(4,3);
		assertEquals(5,result);
	}
	
	public void testMult() {
		Calculation call = new Calculation();
		int result = call.multiplication(2,3);
		assertEquals(5,result);
	}
	
	public void testDiv() {
		Calculation call = new Calculation();
		int result = call.division(12,3);
		assertEquals(5,result);
	}
	
	protected void tearDown() {
		calculator = null;
	}
}