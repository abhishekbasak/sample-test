package com.basak.sample.firstejb;

import junit.framework.TestCase;

public class CalculatorAssertionDelegate {

	void assertAdditionSucceeds(final ICalculatorBean calc) {

		// Initialize
		final int[] arguments = new int[] { 2, 3, 5 };
		final int expectedSum = 10;

		// Add
		System.out.println("@@ 1");
		final int actualSum = calc.add(arguments);
		System.out.println("@@ 2");
		
		// Test
		TestCase.assertEquals("Addition did not return the expected result", expectedSum, actualSum);
		
	}
}
