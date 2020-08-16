package com.orange.e2eTests.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.pageObjects.AuthentificationPage;
import com.orange.e2eTests.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefintion {
	
	public WebDriver driver;
	private AuthentificationPage authentificationPage=new AuthentificationPage();
	
	public AuthentificationStepDefintion() {
		
		driver=Setup.driver;
	}
	
	@Given("^Open application$")
	public void openApplication() throws Throwable {
		
		String url="https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
	}

	@When("^Set UserName$")
	public void setUserName() throws Throwable {
		
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationPage.setUserName();
	}

	@And("^Set Password$")
	public void setPassword() throws Throwable {
		
		authentificationPage.setPassowrd();
		
	}

	@And("^Click button Login$")
	public void clickButtonLogin() throws Throwable {
		
		authentificationPage.clickButtonLogin();
	}

	@Then("^Show Page home$")
	public void showPageHome() throws Throwable {
		
		String wlc=AuthentificationPage.welcome.getText();
		Assert.assertTrue(wlc.contains("Welcome"));
	  
	}


}
