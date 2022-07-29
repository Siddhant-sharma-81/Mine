package com.BaseFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ReportingUtil extends BaseFile{
	
	String fileName = reportLocation + "extentreport.html";
	
	//create Extent Report
	
	public void ExtentReport() {
		
		extent = new ExtentReports();
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		
		htmlReporter.config().setTheme(Theme.DARK);
		
		htmlReporter.config().setDocumentTitle("Test Report for my AppiumCucumber Project");
		
		htmlReporter.config().setEncoding("utf-8");
		
		htmlReporter.config().setReportName("My TestSuite Report");
		
		extent.attachReporter(htmlReporter);
				
	}
		
    //for screenshot
	
	public void ExtentReportScreenshot() throws IOException{
		
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(scr.toPath(), new File(reportLocation + "screenshot.png").toPath());
		
		scenarioDef.fail("details").addScreenCaptureFromPath(reportLocation, "screenshot.png");
    
	}
	
	
	public void FlushReport() {
		extent.flush();
	}
	
	
}


