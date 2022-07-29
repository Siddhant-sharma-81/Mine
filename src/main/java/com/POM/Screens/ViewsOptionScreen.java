package com.POM.Screens;

import org.openqa.selenium.support.PageFactory;

import com.BaseFiles.ScreenWaitGlobal;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class ViewsOptionScreen extends ScreenWaitGlobal {
	
	
	public ViewsOptionScreen(AppiumDriver<MobileElement> driver) {
		
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
// Locators


	
@AndroidFindBy(accessibility="Gallery")
public  MobileElement image_gallary;


@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Photos\"]")
public  MobileElement nature_images;





//Methods 

	public  void OptGallarySection() {
		
		image_gallary.click();		 
	}
	
	
	
	public  void OptPhotoOption() {
		
		nature_images.click();
				 
	}
	
	
   


}
