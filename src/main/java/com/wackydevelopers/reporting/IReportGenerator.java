package com.wackydevelopers.reporting;

/**
 * This interfaces is used to provide methods for report generation
 */
public interface IReportGenerator {

	/**
	 * This method generates a report
	 * @param input
	 * @return
	 */
	public boolean generateReport(String input);
	
	/**
	 * A new method for generating reports
	 * @param input
	 * @return
	 */
	public String generateReportV2(String input);
	
}
