package com.BaseFiles;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenWaitGlobal {
	
	public static AppiumDriver<MobileElement> driver;
	
	public WebDriverWait wait;
	
	public ScreenWaitGlobal(AppiumDriver<MobileElement> driver) {
		
		this.driver =driver;
	}
	
	public MobileElement waitForElement(MobileElement ele) {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver,60);
			
		}catch(Exception e) {
			
			System.out.print(ele + "is not displayed on the web page");
		}
		return ele;
	}
	

}
