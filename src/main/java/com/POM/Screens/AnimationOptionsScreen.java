package com.POM.Screens;

import org.openqa.selenium.support.PageFactory;

import com.BaseFiles.ScreenWaitGlobal;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnimationOptionsScreen extends ScreenWaitGlobal{
		
	
	public AnimationOptionsScreen(AppiumDriver<MobileElement> driver) {
		
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

//Locators 

@AndroidFindBy(accessibility = "Hide-Show Animations")
public  MobileElement hs_anime;

@AndroidFindBy(accessibility = "View Flip")
public  MobileElement flip;

@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Flip\"]")
public  MobileElement flipbtn;



// Methods 


public  void TapOnHide_ShowAnimation() {
		hs_anime.click();		 
	}
	
	
	public  void TapOnViewFlipOption() {
		flip.click();		 
	}
	
	public  void ClickTobeFlip() {
		flipbtn.click();		 
	}
	
	


}
