package com.basak.sample.firstejb;

public class CalculatorBean implements ICalculatorBean {
	
//	/**
//	 * Logger
//	 */
//	private static final Logger log = Logger.getLogger(CalculatorBean.class.getName());

	public int add(final int... args) {
		// Initialize
		final StringBuffer sb = new StringBuffer();
		sb.append("Adding arguments: ");
		int result = 0;

		// Add all arguments
		for (final int arg : args) {
			result += arg;
			sb.append(arg);
			sb.append(" ");
		}

		// Return
		// log.info(sb.toString());
		// log.info("Result: " + result);
		return result;
	}

}
