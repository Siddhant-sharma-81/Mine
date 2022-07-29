package com.RunnerFile;

import static com.BaseFiles.BaseFile.features;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.BaseFiles.ReportingUtil;
import com.aventstack.extentreports.gherkin.model.Feature;

public class NGTestListener implements ITestListener {

	ReportingUtil extentReportUtil = new ReportingUtil();

	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.print("**On test start");				
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.print("####On test success-Test has been Successfully run#######");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.print("**On test failure");
		
		try {
			
			extentReportUtil.ExtentReportScreenshot();		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.print("**On test skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.print("**On test percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.print("**On start");
		extentReportUtil.ExtentReport();

		features = extentReportUtil.extent.createTest(Feature.class , "Test Suite");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.print("**On finsh");
		extentReportUtil.FlushReport();
		
	}
	
	
}
