package com.POM.Screens;

import org.openqa.selenium.support.PageFactory;

import com.BaseFiles.ScreenWaitGlobal;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class SMSMessagingScreen extends ScreenWaitGlobal {
	
	
	public SMSMessagingScreen(AppiumDriver<MobileElement> driver) {
		
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

// Locators 

@AndroidFindBy(accessibility="SMS Messaging")
public  MobileElement sms;

@AndroidFindBy(id = "io.appium.android.apis:id/sms_recipient")
public  MobileElement recipient;

@AndroidFindBy( id = "io.appium.android.apis:id/sms_content")
public  MobileElement content;

@AndroidFindBy(id = "io.appium.android.apis:id/sms_send_message")
public  MobileElement sendbtn;



// Methods 

	public  void SelectMessageOption() {
		sms.click();		 
	}
	
	
	
	public  void EnterRecipient(String contactno) {
		
		recipient.sendKeys(contactno);
				 
	}
	
	
    public  void EnterMessage(String msg1) {
		
		content.sendKeys(msg1);
				 
	 }
	
     public  void SendtheMsg() {
    	 sendbtn.click();		 
	 }


}
