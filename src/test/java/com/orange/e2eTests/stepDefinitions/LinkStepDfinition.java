package com.orange.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.orange.e2eTests.pageObjects.LinkPage;
import com.orange.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class LinkStepDfinition {
	
public LinkStepDfinition() {
		
		driver=Setup.driver;
	}
	
	public WebDriver driver;

	private LinkPage linkPage = new LinkPage();
	
	@When("^Click on Admin Link$")
	public void click_on_Admin_Link() throws Throwable {
		
	}

	@When("^Click on Dashboard$")
	public void click_on_Dashboard() throws Throwable {
	}



}
