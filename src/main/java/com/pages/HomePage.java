package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.ReusableMethods;

public class HomePage extends ReusableMethods {

	private WebDriver driver;

	// 1. By Locators: OR
	private By Menu_icon = By.id("//a[contains(@href,'#navigation')]/i");
	private By Tools_Section = By.xpath("(//a[contains(@href,'#')])[10]");
	private By proposal_Builder = By.linkText("Build a Proposal");
	private By selectLead = By.xpath("//a[contains(text(),'SELECT LEAD')]");

	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void navigateToMenu() {
		driver.findElement(Menu_icon).click();
	}

	public void clickToolsSection() {
		driver.findElement(Tools_Section).click();
	}

	public void clickProposalBuilder() {
		mouseMoveAction(driver.findElement(proposal_Builder));
	}

	public void clickSelectLead() {
		windowHandle(driver.findElement(selectLead));
	}
}
