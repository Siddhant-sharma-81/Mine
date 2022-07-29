package com.POM.Screens;

import org.openqa.selenium.support.PageFactory;

import com.BaseFiles.ScreenWaitGlobal;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Hide_ShowButtonScreen extends ScreenWaitGlobal{
	
	public Hide_ShowButtonScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	
// Locators 

@AndroidFindBy(xpath = "//android.widget.CheckBox[@content-desc=\"Custom Animations\"]")
public  MobileElement squeezeturn;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")
public  MobileElement btn1;

@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")
public  MobileElement btn3;

@AndroidFindBy(accessibility = "Show Buttons")
public  MobileElement Showbtn;



// Methods 

	public  void MarkCustomAnimation() {
		
		squeezeturn.click();		 
	}
	
	
	public void HideButtons() {
		
		btn1.click();
		btn3.click();				
	}

	
    public void ShowButtons() {
		
	      Showbtn.click();				
	}

}
