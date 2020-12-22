package com.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.DataProvider;

public class ProposalPage extends DataProvider {

	private WebDriver driver;

	// 1. By Locators: OR
	private By addLead = By.xpath("(//span[contains(text(),'ADD LEAD')])[2]");
	private By firstName = By.xpath("//input[@id='firstName']");
	private By lastName = By.xpath("//input[@id='lastName']");
	private By email = By.xpath("//input[@id='email']");
	private By phoneNo = By.xpath("//input[@id='phNo']");
	private By calanderDate = By.xpath("//input[@id='calender1']");
	private By calanderTime = By.xpath("//input[@id='calender2']");
	private By addDocuments = By.linkText("Add Document");
	private By fileSelection = By.id("multipleFileSelect-1");
	private By uploadImages = By.name("imageFiles");
	private By saveLead = By.linkText("SAVE LEAD");

	// 2. Constructor of the page class:
	public ProposalPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLead() {
		driver.findElement(addLead).click();
	}

	public void entersFirstName() {
		driver.findElement(firstName).sendKeys(INPUT_firstName);
	}

	public void entersLastName() {
		driver.findElement(lastName).sendKeys(INPUT_lastName);
	}

	public void entersEmail() {
		driver.findElement(email).sendKeys(INPUT_phoneNo);
	}

	public void entersPhoneNo() {
		driver.findElement(phoneNo).sendKeys(INPUT_phoneNo);
	}

	public void entersCalanderDate() {
		driver.findElement(calanderDate).sendKeys(INPUT_calDate);
	}

	public void entersCalanderTime() {
		driver.findElement(calanderTime).sendKeys(INPUT_calTime);
	}

	public void uploadsDocument() {
		driver.findElement(addDocuments).click();
	}

	public void uploadsImage() {
		String currentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String wh : windows) {
			driver.switchTo().window(wh);
			Select s = new Select(driver.findElement(uploadImages));
			s.selectByIndex(1);
			driver.findElement(fileSelection).click();
		}
	}

	public void saveLead() {
		driver.findElement(saveLead).click();
	}

}
