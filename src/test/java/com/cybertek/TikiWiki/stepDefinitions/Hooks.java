package com.cybertek.TikiWiki.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cybertek.TikiWiki.pages.LoginAndOut;
import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.Config;
import com.cybertek.TikiWiki.utilities.Extent;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebDriver driver = Browser.getDriver();
	LoginAndOut log=new LoginAndOut();
	
	@Before
	public void setup() {
		driver.get(Config.getProperty("url"));
		log.logIn();
	}

	@After
	public void afterMethod(Scenario scenario) {

		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			Extent.failTest(scenario);
			System.out.println("Watch: ==>>" + scenario.getName());
		} else {
			Extent.passTest(scenario);
		}
		log.logoutClick();
		
	}

}
