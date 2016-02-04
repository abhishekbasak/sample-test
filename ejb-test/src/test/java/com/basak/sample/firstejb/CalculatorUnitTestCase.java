package com.basak.sample.firstejb;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorUnitTestCase {
	
	public static ICalculatorBean calculatorBean;
	
	@BeforeClass
	public static void init() {
		calculatorBean = new CalculatorBean();
	}
	
	@Test
	public void test() {
		// Initialize
		final int[] arguments = new int[] { 3, 7, 2 };
		final int expectedSum = 12;
		
		// Add
		final int actualSum = calculatorBean.add(arguments);
		
		// Test
		TestCase.assertEquals("Addition did not return the expected result", expectedSum, actualSum);
	}

}
