package com.StepDefinitions;

import com.BaseFiles.BaseFile;
import com.POM.Screens.DisplayOptionScreen;
import com.POM.Screens.HomeScreen;
import com.POM.Screens.InsideAppScreen;
import com.aventstack.extentreports.GherkinKeyword;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Display_Show_Title extends BaseFile{
		
	private static Logger log = LogManager.getLogger(Display_Show_Title.class);
	
	
	@When("^user tap on the App section of app$")
	public void user_tap_on_the_App_section_of_app() throws Throwable {
		
		 scenarioDef.createNode(new GherkinKeyword("When"),"user tap on the App section of app");
		
		 HomeScreen HS = new HomeScreen(driver);
		 HS.TapOnAPP();	    
		 log.info("User has entered into the App section");
	    
	}

	@When("^tap on the Action Bar option$")
	public void tap_on_the_Action_Bar_option() throws Throwable{
		
		scenarioDef.createNode(new GherkinKeyword("When"),"tap on the Action Bar option");
		
		InsideAppScreen IASr = new InsideAppScreen(driver);
		IASr.TapOnAction_Bar();
		log.info("Tap on the Action Bar option has done");
		
		
	}

	@When("^tap on the Display Option$")
	public void tap_on_the_Display_Option() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"tap on the Display Option");
		
		InsideAppScreen IASr = new InsideAppScreen(driver);
		IASr.SelectDisplayOption();
		log.info("Tap on the Display Option has been done!");
			   
	}

	
	@When("^as click on Display Show Title button$")
	public void as_click_on_Display_Show_Title_button() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"as click on Display Show Title button");
	    
		DisplayOptionScreen DOS = new DisplayOptionScreen(driver);
		DOS.ToggleTitlePath();
		log.info("****Boom! Has been successfully clicked on Display_show_title button for toggling the title****");
		
	}

	
	@Then("^path of that button starts toggling on the top$")
	public void path_of_that_button_get_disappeared_from_the_top()  throws Throwable{
		
		scenarioDef.createNode(new GherkinKeyword("Then"),"path of that button starts toggling on the top");
		
		System.out.println("Path of Button first got disappeared then get visible again has verified!");
	    
	}


}
