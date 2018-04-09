package com.cybertek.TikiWiki.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.Extent;

import cucumber.api.Scenario;
import cucumber.api.java.After;


public class Hooks {

	@After
	public void afterMethod(Scenario scenario) {
		WebDriver driver = Browser.getDriver();
		
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			Extent.failTest(scenario);
			System.out.println("Watch: ==>>" + scenario.getName());
		} else {
			Extent.passTest(scenario);
		}

	}
	
	
	
	
	
}
