package com.POM.Screens;

import org.openqa.selenium.support.PageFactory;

import com.BaseFiles.ScreenWaitGlobal;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class InsideAppScreen extends ScreenWaitGlobal{
	
	public InsideAppScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
// Locators 

@AndroidFindBy(accessibility = "Action Bar")
public  MobileElement action;

@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Display Options\"]")
public  MobileElement display;




// Methods 

	public  void TapOnAction_Bar() {
		
		action.click();		 
	}
	
	
	public  void SelectDisplayOption() {
		
		display.click();		 
	}
	



}
