package com.Core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Constants {
	
	public void config() {
		
			String path = System.getProperty("user.dir")+"\\reports\\index.html";// "user.dir" means path till current project
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("Web Automation Results");
			reporter.config().setDocumentTitle("Test results");
			
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(reporter);//this "attachReporter" Method helps to attached all the reports to reporter object means to location
			extent.setSystemInfo("Tester", "Md.Nishar");// This method helps to set some information regarding anything like Tester
		}
		
		
	
	
	

}
