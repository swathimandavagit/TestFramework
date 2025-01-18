package com.test.TestFramework.Common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonTest{
	
	public static WebDriver driver = BaseUtil.getDriver();
	public void click(WebElement element) {
		element.click();
	}
	
	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void waitForElementPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
	}	
}
