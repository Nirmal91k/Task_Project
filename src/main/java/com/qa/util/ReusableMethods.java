package com.qa.util;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReusableMethods {

	private WebDriver driver;

	public void mouseMoveAction(WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).click();

	}

	public void windowHandle(WebElement element) {
		String current_Window = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		for (String win : window) {
			driver.switchTo().window(win);
			element.click();

		}

	}
}