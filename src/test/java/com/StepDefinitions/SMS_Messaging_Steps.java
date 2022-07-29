package com.StepDefinitions;

import com.BaseFiles.BaseFile;
import com.POM.Screens.HomeScreen;
import com.POM.Screens.SMSMessagingScreen;
import com.aventstack.extentreports.GherkinKeyword;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SMS_Messaging_Steps extends BaseFile{
	
	private static Logger log = LogManager.getLogger(SMS_Messaging_Steps.class);

	
	@When("^user tap on the OS section$")
	public void user_tap_on_the_OS_section()  throws Throwable{
		
		scenarioDef.createNode(new GherkinKeyword("When"),"user tap on the OS section");
	   
		HomeScreen HS = new HomeScreen(driver);
	    HS.TapOnOS();
        log.info("user has been entered into the OS section of the app!");
	}

	
	@When("^select the SMS messaging option$")
	public void select_the_SMS_messaging_option() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"select the SMS messaging option");
	   		
		SMSMessagingScreen SMSMS = new SMSMessagingScreen(driver);
		SMSMS.SelectMessageOption();
		log.info("SMS messasging option have been choosen");
	}

	
	@When("^write \"([^\"]*)\" within recipient section$")
	public void write_within_recipient_section(String Mobno) throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"write mobile number within recipient_section");
			   
		SMSMessagingScreen SMSMS = new SMSMessagingScreen(driver);
		SMSMS.EnterRecipient(Mobno);
		log.info("Mobile number has been entered into the recipients field! ");
	}

	
	@When("^write \"([^\"]*)\" within message body$")
	public void write_within_message_body(String msg)  throws Throwable{
		
		scenarioDef.createNode(new GherkinKeyword("When"),"write message content within message_body");
	  
		SMSMessagingScreen SMSMS = new SMSMessagingScreen(driver);
		SMSMS.EnterMessage(msg);
		log.info("Content of the msg has been written into body field!");
	}

	
	@When("^click on Send button$")
	public void click_on_Send_button() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"click on Send button");
	  
		SMSMessagingScreen SMSMS = new SMSMessagingScreen(driver);
		SMSMS.SendtheMsg();
		log.info("******Boom! Has been Successfully tap on Send button to send an SMS *******");
	}

	
	@Then("^this \"([^\"]*)\" of successfull sent appear on screen$")
	public void this_of_successfull_sent_appear_on_screen(String arg1)  throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("Then"),"Message of successfull sent appear on screen");
		
		System.out.println("Sending Message Functionality has been verified!");
	    
	}

}
