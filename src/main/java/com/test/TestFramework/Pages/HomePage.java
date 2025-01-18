package com.test.TestFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.test.TestFramework.Common.CommonTest;



public class HomePage extends CommonTest {

	@FindBy(how=How.XPATH, using="//button[contains(text(),'Rail Passes')]")
	private WebElement railPassesButton;
	@FindBy(xpath="//span[text()='Amtrak Multi-Ride & Rail Passes']")
	private WebElement pageLoadVerify;

	public HomePage() {
	    PageFactory.initElements(driver,this);
	}
	public void navigateToWebsite() {		
			driver.get("https://www.amtrak.com/home.html");
			driver.manage().window().maximize();
	}
	
	public void clickOnRailPasses() {
		railPassesButton.click();
	}
	
	public void verifyRailpassesPageLoad() {
		Assert.assertEquals(pageLoadVerify.isDisplayed(), true);		
	}

}
