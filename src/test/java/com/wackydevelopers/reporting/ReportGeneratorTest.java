package com.wackydevelopers.reporting;

import junit.framework.TestCase;

public class ReportGeneratorTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
	
	public void testGenerateReport() {
		String input = "returnTrue";
		IReportGenerator iReportGenerator = new ReportGenerator();
		assertTrue(iReportGenerator.generateReport("returnTrue"));
		assertTrue("true".equalsIgnoreCase(iReportGenerator.generateReportV2("returnTrue").toString()));
		assertTrue(iReportGenerator.generateReport("returnTrueAgain"));
		assertTrue("true".equalsIgnoreCase(iReportGenerator.generateReportV2("returnTrueAgain").toString()));
		assertFalse(iReportGenerator.generateReport("somethingElse"));
		assertFalse("true".equalsIgnoreCase(iReportGenerator.generateReportV2("somethingElse").toString()));
	}
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	
}
