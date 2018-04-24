package com.cybertek.TikiWiki.runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.beust.jcommander.Parameter;
import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.Extent;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		plugin = {"pretty", "html:target/cucumber",
				"json:target/cucumber.json"},
		features = "./src/test/resources/features",
		glue = "com.cybertek.TikiWiki.stepDefinitions",
		tags = "@SmokeTest",
		dryRun = false
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {

	@Parameter
	@BeforeClass
	public void setup() {
//		SauceLabs.setUp();
		Extent.setupExtent();
	}

	@AfterClass
	public void tearDown() {
		Extent.flushExtent();
		Browser.closeDriver();
	}

}
