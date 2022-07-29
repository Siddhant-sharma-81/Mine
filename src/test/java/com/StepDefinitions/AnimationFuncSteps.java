package com.StepDefinitions;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseFiles.BaseFile;
import com.POM.Screens.AnimationOptionsScreen;
import com.POM.Screens.Hide_ShowButtonScreen;
import com.POM.Screens.HomeScreen;
import com.aventstack.extentreports.GherkinKeyword;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AnimationFuncSteps extends BaseFile {
	
	private static Logger log = LogManager.getLogger(AnimationFuncSteps.class);
	
	
	@Given("^application has already opened$")
	public void application_has_already_opened() throws Throwable  {
		
		scenarioDef.createNode(new GherkinKeyword("Given"),"application has already opened");
		
		System.out.println("****Now user is inside the application *****");	 
		log.info("#~#~#~ Application has open to run a new test ~#~#~#");
	}

	
	
	@When("^user tap on the Animation section$")
	public void user_tap_on_the_Animation_section() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"user tap on the Animation section");
		      		
	    HomeScreen HS = new HomeScreen(driver);
	    HS.TapOnAnimation();
	    log.info("Tap on the Animation Section has done!");
	    
	}

	
	@When("^tap on the Hide-Show Animation section$")
	public void tap_on_the_Hide_Show_Animation_section() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"tap on the Hide-Show Animation section");
		
		AnimationOptionsScreen AOS = new AnimationOptionsScreen(driver);
		AOS.TapOnHide_ShowAnimation();
		log.info("Tap on the Hide-Show Animation Option has done!");
	}

	
	@Given("^user is inside hideshow animation section of the app$")
	public void user_is_inside_hideshow_animation_section_of_the_app() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("Given"),"user is inside hideshow animation section of the app");
		
		System.out.println("****User is inside the hide-show section  *****");	    
	}
	
	
	@Given("^user markcheck to provide some custom animation$")
	public void markcheck_to_provide_some_custom_animation() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("Given"),"user markcheck to provide some custom animation");
		
		Hide_ShowButtonScreen HSBS = new Hide_ShowButtonScreen(driver);
		HSBS.MarkCustomAnimation();	
		log.info("Custom Animation has been provided!");
	}

	
	@When("^start tapping the buttons to hide them$")
	public void start_tapping_the_buttons_to_hide_them()  throws Throwable{
		
		scenarioDef.createNode(new GherkinKeyword("When"),"start tapping the buttons to hide them");
		
		log.info("Tapping on the button for the purpose of hiding them has started!");
		Hide_ShowButtonScreen HSBS = new Hide_ShowButtonScreen(driver);
		HSBS.HideButtons();
		
	}

	
	@Then("^all buttons have gone invisible$")
	public void all_buttons_have_gone_invisible() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("Then"),"all buttons have gone invisible");
		
		System.out.println("****All buttons have gone successfully hide*****");	
		log.info("*******All buttons have been successfully hide*****!");
	}

	
	@When("^as user tap on the Show button$")
	public void as_user_tap_on_the_Show_button() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("When"),"as user tap on the Show button");
		
		Hide_ShowButtonScreen HSBS = new Hide_ShowButtonScreen(driver);
		HSBS.ShowButtons();
		log.info("Clicked Successfully on the Show button!");
	    
	}

	@Then("^all hidden buttons starts being visible$")
	public void all_hidden_buttons_starts_being_visible() throws Throwable {
		
		scenarioDef.createNode(new GherkinKeyword("Then"),"all hidden buttons starts being visible");
		
		System.out.println("****All hidden buttons have gone visible again*****");
		log.info("******Boom! All hidden button are visible again******* ");
	 
	}


}
