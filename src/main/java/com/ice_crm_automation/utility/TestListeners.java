package com.ice_crm_automation.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners extends BaseClass implements ITestListener, ISuiteListener {
    String reportPath;
    ExtentReports extentReports;
    @Override
    public void onStart(ISuite suite) {
        System.out.println("This is onStart of ISuite form TestListeners");
        LocalDateTime dateTime = LocalDateTime.now();
        String currentDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm"));
        reportPath = System.getProperty("user.dir") + "/reports/" + "report_" + currentDateTime;
        File file = new File(reportPath);
        if (!file.exists()) 
        {
            file.mkdir();  // create folder based on provided folder path
        }
        String htmlReport = reportPath+ "/AutomationReport.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(htmlReport);
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("This is onFinish of ISuite from TestListeners");
        extentReports.flush();
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("This is onStart of ITestContext from TestListeners");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("This is onFinish of ITestContext from TestListeners");
    }

    
    @Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is onTestStart of ITestResult from TestListners");
		String methodName = result.getMethod().getMethodName();
		ExtentTestManager.createTest(methodName);
		
	}

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("This is onTestSuccess of ITestResult from TestListeners");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("This is onTestFailure of ITestResult from TestListeners");

		ExtentTestManager.getTest().fail(result.getThrowable());
//        String screenshot= reportPath+"/"+ result.getMethod().getMethodName()+".jpg";
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//        File dstFile =  new File(screenshot);
//        try {
//            FileUtils.copyFile(srcFile, dstFile);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        log.fail(result.getThrowable().getMessage());


    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("This is onTestSkipped of ITestResult from TestListeners");
    }

}