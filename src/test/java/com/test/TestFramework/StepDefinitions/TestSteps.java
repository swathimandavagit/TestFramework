package com.test.TestFramework.StepDefinitions;

import com.test.TestFramework.Common.BaseUtil;
import com.test.TestFramework.Pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	HomePage homePage = new HomePage();
	
	@Given("I navigate to the website")
	public void navigateToWebsite() {
		homePage.navigateToWebsite();
	}
	
	@When("I click on RailPasses option")
	public void clickOnRailPasses() {
		homePage.clickOnRailPasses();
	}  
	  
    @Then("I should land in Rail passes page")
    public void verifyTest() {
    	homePage.verifyRailpassesPageLoad();
	}   
    
    @After
	public void tearDown() {
    	BaseUtil.getDriver().quit();
	}

}

