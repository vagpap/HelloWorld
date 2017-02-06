package com.wackydevelopers.reporting;

public class ReportGenerator implements IReportGenerator {

	/**
	 * {@inheritDoc}
	 */
	public boolean generateReport(String input) {
		boolean result = true;
		if ("returnTrue".equalsIgnoreCase(input)) {
			result = true;
		} else if ("returnTrueAgain".equalsIgnoreCase(input)) {
			result = true;
		} else {
			result = false;
		}
		
		Integer a = 1;
		Integer b = 2;
		if (a == b) {
			System.out.println("something");
		}
		
		return result;
	}

	public String generateReportV2(String input) {
		
		
		String result = "";
		
		try {
			if ("returnTrue".equalsIgnoreCase(input)) {
				result = Boolean.TRUE.toString();
			} else if ("returnTrueAgain".equalsIgnoreCase(input)) {
				result = Boolean.TRUE.toString();
			} else {
				result = Boolean.FALSE.toString();
			}
		} catch (Exception ignore) {}
		
		
		
		return result;
	}
}
