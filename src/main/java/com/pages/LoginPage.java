package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ConfigReader;
import com.qa.util.DataProvider;

public class LoginPage extends DataProvider {

	ConfigReader config = new ConfigReader();
	private WebDriver driver;
	public String user = config.getUsername();
	public String pass = config.getPassword();

	// 1. By Locators: OR
	private By emailId = By.id("j_username");
	private By password = By.id("j_password");
	private By signInButton = By.id("loginSubmit");

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	public void enterUserName() {
		driver.findElement(emailId).sendKeys(user);
	}

	public void enterPassword() {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}
}
