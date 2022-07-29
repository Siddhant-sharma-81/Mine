package com.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseFiles.BaseFile;
import com.POM.Screens.AnimationOptionsScreen;
import com.aventstack.extentreports.GherkinKeyword;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Animation_ViewFlip extends BaseFile {
	
	private static Logger log = LogManager.getLogger(Animation_ViewFlip.class);
	
	
	@When("^tap on the view Flip option$")
	public void tap_on_the_view_Flip_option() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"tap on the view Flip option");
		
		AnimationOptionsScreen AOS = new AnimationOptionsScreen(driver);
		AOS.TapOnViewFlipOption();
		log.info("Tapping to select Flip Option has done!");
	    
	}

	@When("^as user click on the Flip button$")
	public void as_user_click_on_the_Flip_button() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"as user click on the Flip button");
		    
		AnimationOptionsScreen AOS = new AnimationOptionsScreen(driver);
		AOS.ClickTobeFlip();
		log.info("*****Boom! Successfully clicked on flip-button to flip the whole optionlist******");
		
	    
	}

	
	@Then("^whole list of options get flip to another language$")
	public void whole_list_of_options_get_flip_to_another_language() throws Throwable  {
		
		scenarioDef.createNode(new GherkinKeyword("Then"),"whole list of options get flip to another language");
		
		System.out.println("Flip of the whole list have been successfully verified!");
	    
	}

}
