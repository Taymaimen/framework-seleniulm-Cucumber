package com.orange.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.pageObjects.AuthentificationPage;
import com.orange.e2eTests.pageObjects.AuthentificationParamPage;
import com.orange.e2eTests.utils.Setup;
import cucumber.api.java.en.When;

public class AuthentificationParamStepDefintion {
	
public AuthentificationParamStepDefintion() {
		
		driver=Setup.driver;
	}
	
	public WebDriver driver;

	private AuthentificationParamPage authentificationParamPage = new AuthentificationParamPage();
	
	@When("^Set Name \"([^\"]*)\"$")
	public void setName(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		PageFactory.initElements(driver, AuthentificationParamPage.class);
		authentificationParamPage.setUserName(name);
	}
	
	@When("^Set Pw \"([^\"]*)\"$")
	public void setPw(String passowrd) throws Throwable {
		authentificationParamPage.setPassowrd(passowrd);

	}

}
	