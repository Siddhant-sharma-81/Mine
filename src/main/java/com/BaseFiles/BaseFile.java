package com.BaseFiles;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseFile{
	
	    static AppiumDriverLocalService service;
	    
	    public static  AppiumDriver<MobileElement> driver ;
	    
	    public ExtentReports extent;
	    
	    public static ExtentTest scenarioDef;
	    
	    public static ExtentTest features;
	    
	    public static String reportLocation = "./ExtentReports/" ;
	    
	    static DesiredCapabilities capabilities =new DesiredCapabilities();


		static File file = new File("./src/main/resources/Properties/config.properties");
		
		static FileInputStream fis = null;

		static Properties prop = new Properties();

		static {

			try {
				fis = new FileInputStream(file);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		

		
		public static void startAppium() {
			
			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
		}
		
		
		
		
		//Setting Capabilities 
		
	   public static void setAndroidCapabilities() {
			
			capabilities.setCapability("platformVersion", prop.getProperty("platformVersion"));
			
			capabilities.setCapability("platformName", prop.getProperty("platformName"));
			
			capabilities.setCapability("appPackage", prop.getProperty("packageName"));
			
			capabilities.setCapability("appActivity", prop.getProperty("activityName"));
			
			capabilities.setCapability("app", prop.getProperty("appPath"));
			
			capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
			
			try {
				driver = new AndroidDriver(new URL(prop.getProperty("ServerURL")),capabilities);
				driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	    
		
		//for swipe vertically
	   
		public static void verticalswipeByPercentage(double startpercentage, double endpercentage, double anchorpercentage) throws Throwable {

	        Dimension size = driver.manage().window().getSize();

	        int anchor = (int)(size.width * anchorpercentage);
	        
	        int startpoint = (int)(size.height * startpercentage);
	        
	        int endpoint = (int)(size.height * endpercentage);

	        new TouchAction(driver).press(point(anchor,startpoint))
	                               .waitAction(waitOptions(ofMillis(1000)))
	                               .moveTo(point(anchor,endpoint))
	                               .release().perform();
		}
		
	     
		//for swipe horizontally
		
		 public void horizontalswipeByPercentage(double startpercentage, double endpercentage, double anchorpercentage) throws Throwable {

		       Dimension size = driver.manage().window().getSize();

		       int anchor = (int)(size.height * anchorpercentage);
		       
		       int startpoint = (int)(size.width * startpercentage);
		       
		       int endpoint = (int)(size.width * endpercentage);

		       new TouchAction(driver).press(point(startpoint,anchor))
		                              .waitAction(waitOptions(ofMillis(1000)))
		                              .moveTo(point(endpoint,anchor)).release().perform();
		       
		   }
		
		 
		 
		public static void stopappium(){
			driver.quit();
			}
		
		
		
		public static void closeAppium() {
			service.stop();
		}


}
