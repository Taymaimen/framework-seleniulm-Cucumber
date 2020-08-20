package com.orange.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.e2eTests.pageObjects.AuthentificationOutelinePage;
import com.orange.e2eTests.pageObjects.AuthentificationPage;
import com.orange.e2eTests.pageObjects.AuthentificationParamPage;
import com.orange.e2eTests.utils.Setup;
import cucumber.api.java.en.When;

public class AuthentificationOutlineStepDefintion {
	
public AuthentificationOutlineStepDefintion() {
		
		driver=Setup.driver;
	}
	
public WebDriver driver;
private AuthentificationOutelinePage authentificationOutlinePage= new AuthentificationOutelinePage();


@When("^Set Login \"([^\"]*)\"$")
public void setLogin(String name) throws Throwable {
	PageFactory.initElements(driver, AuthentificationOutelinePage.class);
	PageFactory.initElements(driver, AuthentificationPage.class);
	authentificationOutlinePage.setUserName(name);	
}

@When("^Set Pass \"([^\"]*)\"$")
public void setPass(String password) throws Throwable {
	authentificationOutlinePage.setPassowrd(password);
}

}
	