package com.ice_crm_automation.utility;



import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportManager {
	public static String reportPath;
	public static ExtentReports extentReport;
	
	//singleton pattern
	public static ExtentReports getInstance() {
		if(extentReport == null) {
			setReportDetails();
		}
		return extentReport;
	}
	

	public static void setReportDetails() {
		LocalDateTime dateTime = LocalDateTime.now();
		String currentDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd_mm_yyyy_HH_mm"));
		reportPath = System.getProperty("user.dir") + "/reports/"+ "report_" + currentDateTime;
		System.out.println("ReportPath is " + reportPath);
		File file = new File(reportPath);
		if (!file.exists()) {
			file.mkdir();
		}
		  String htmlReport = reportPath+ "AutomationReport.html";
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(htmlReport);
	        extentReport = new ExtentReports();
	        extentReport.attachReporter(sparkReporter);;
	        extentReport.setSystemInfo("user", "Tanvi");
	        extentReport.setSystemInfo("os", "windows");
	        extentReport.setSystemInfo("environment", "QA");
	}

}