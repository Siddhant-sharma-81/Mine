package com.POM.Screens;

import org.openqa.selenium.support.PageFactory;

import com.BaseFiles.ScreenWaitGlobal;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DisplayOptionScreen extends ScreenWaitGlobal{
	
	
	public DisplayOptionScreen(AppiumDriver<MobileElement> driver) {
		
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
//Locators 

@AndroidFindBy(id = "io.appium.android.apis:id/toggle_show_title")

public  MobileElement toggle_title;




//  Methods

	public  void ToggleTitlePath() {
		
		toggle_title.click();
		
	}
	


}
