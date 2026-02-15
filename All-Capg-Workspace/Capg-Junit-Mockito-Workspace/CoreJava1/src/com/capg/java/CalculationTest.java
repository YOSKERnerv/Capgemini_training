package com.capg.java;
import com.capg.java.Calculation;
import junit.framework.TestCase;
public class CalculationTest extends TestCase{
	public void testAdd() {
		Calculation cal1= new Calculation();
		int result = cal1.addition(2, 3);
		
		assertEquals(5,result);
		assertEquals(10,new Calculation().multiplication(5,2));
		
	}
}
