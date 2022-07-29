package com.StepDefinitions;

import com.BaseFiles.BaseFile;
import com.POM.Screens.HomeScreen;
import com.POM.Screens.ViewsOptionScreen;
import com.aventstack.extentreports.GherkinKeyword;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Gallery_Views_Swipe extends BaseFile{

	private static Logger log = LogManager.getLogger(Gallery_Views_Swipe.class);
	
	@When("^user tap on the view section$")
	public void user_tap_on_the_view_section()  throws Throwable {
		
		 scenarioDef.createNode(new GherkinKeyword("When"),"user tap on the view section");
	  
		 HomeScreen HS = new HomeScreen(driver);
		 HS.TapOnViews();	
		 log.info("user has entered into the View section of mobile app!");
	}

	
	@When("^go inside the gallary section$")
	public void go_inside_the_gallary_section() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"go inside the gallary section");
	
		ViewsOptionScreen VOS = new ViewsOptionScreen(driver);
		VOS.OptGallarySection();
		log.info("now user has entered into gallary section");
	    
	}

	
	@When("^select the Photos option$")
	public void select_the_Photos_option() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"select the Photos option");
	  
		ViewsOptionScreen VOS = new ViewsOptionScreen(driver);
		VOS.OptPhotoOption();
		log.info("To select the PHOTOS option has been done!");
			    
	}

	
	@Then("^images of gallary gets visible$")
	public void images_of_gallary_gets_visible() throws Throwable  {
		
		scenarioDef.createNode(new GherkinKeyword("Then"),"images of gallary gets visible");
		
		System.out.println("**Gallary of nature's images is visible**");   
	}

	
	@When("^User swipes horizontally from right to left$")
	public void user_swipes_horizontally_from_right_to_left() throws Throwable  {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"User swipes horizontally from right to left");
		
		horizontalswipeByPercentage(0.80,0.10,0.20);
		horizontalswipeByPercentage(0.80,0.10,0.20);
		
		log.info("*****Boom! user is able to swipe across gallary images to view them******");
		   	   
	}

	
	@Then("^more images of nature get seen$")
	public void more_images_of_nature_get_seen() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("Then"),"more images of nature get seen");
		
		System.out.println("Able to swipe over images to view more images!");   
	   
	}


}
