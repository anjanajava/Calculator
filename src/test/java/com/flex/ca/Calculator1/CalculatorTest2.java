package com.flex.ca.Calculator1;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest2 {

	@Test
		public void testSum() {
			System.out.println("sum");
			Integer x = 15;
			Integer y = 15;
			Integer expResult = 30;
			Integer result = Calculator.sum(x, y);
			assertEquals(expResult, result);
			assertEquals(null, Calculator.sum(15, null));
			assertEquals(null, Calculator.sum(null, 15));
			assertEquals(null, Calculator.sum(null, null));
			}

	@Test 
			public void testSub() {
			System.out.println("sub");
			Integer x = 15;
			Integer y = 15;
			Integer expResult = 30;
			Integer result = Calculator.sub(x, y);
			assertEquals(expResult, result);
			assertEquals(null, Calculator.sub(15, null));
			assertEquals(null, Calculator.sub(null, 15));
			assertEquals(null, Calculator.sub(null, null));
			}

}
