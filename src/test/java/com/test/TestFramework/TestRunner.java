package com.test.TestFramework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\java\\com\\test\\TestFramework\\Features"},
		glue = {"com\\test\\TestFramework\\StepDefinitions"},
		plugin = {"pretty", "html:target/cucumberReport.html",
				"json:target/cucumberReport.json"}	
		)


public class TestRunner extends AbstractTestNGCucumberTests{
	
}
