package com.StepDefinitions;

import com.BaseFiles.BaseFile;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseFile {

	private BaseFile base;

	public Hooks(BaseFile base) {
		this.base = base;
	}
	
	
	@Before
	public void Invoke1(Scenario scenario) throws InterruptedException {
		
		scenarioDef = base.features.createNode(scenario.getName());

		startAppium();
		setAndroidCapabilities();
	}


	@After
	public void teardown() {

		stopappium();
		closeAppium();
	}


}
