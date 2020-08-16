package com.orange.e2eTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {

	/* Locators */

	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN_ID = "btnLogin";
	final static String WELCOME_ID = "welcome";

	/* @FindBy */

	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement userPassword;
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement buttonLogin;
	@FindBy(how = How.ID, using = WELCOME_ID)
	public static WebElement welcome;

	/* Methods */

	public void setUserName() {

		userName.sendKeys("Admin");
	}

	public void setPassowrd() {

		userPassword.sendKeys("admin123");
	}

	public void clickButtonLogin() {

		buttonLogin.click();
	}

}
