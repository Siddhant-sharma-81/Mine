package com.RunnerFile;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="src/test/java/Features",
		
		glue={"com/StepDefinitions"},
		
		plugin = {"pretty","html:test-output/Html_report.html",
				  "junit:junit_xml/junit.xml",
		          "json:target/cucumber.json"},
		
		monochrome=true,
		dryRun=false,
		strict=false,
		
		tags= {"@test1,@test2,@test3,@test4,@test5,@test6"}
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}