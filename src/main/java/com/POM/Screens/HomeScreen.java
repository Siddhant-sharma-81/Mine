package com.POM.Screens;

import org.openqa.selenium.support.PageFactory;

import com.BaseFiles.ScreenWaitGlobal;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomeScreen  extends ScreenWaitGlobal{
	
	public HomeScreen(AppiumDriver<MobileElement> driver) {
		
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
//Locators 

@AndroidFindBy(accessibility = "Animation")
public  MobileElement anime;

@AndroidFindBy(accessibility = "App")
public  MobileElement app;

@AndroidFindBy(accessibility = "OS")
public  MobileElement os;

@AndroidFindBy(accessibility = "Views")
public  MobileElement view;




// Methods 

	public  void TapOnAnimation() {
		
		 anime.click();		 
	}
	
	
	public  void TapOnAPP() {
		
		app.click();		 
	}
	
	
    public  void TapOnOS() {
		
		os.click();		 
	}
    
    
    public  void TapOnViews() {
		
		view.click();		 
	}


}
