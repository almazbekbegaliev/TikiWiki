package com.cybertek.TikiWiki.runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cybertek.TikiWiki.utilities.Extent;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		plugin = { "pretty", "html:target/cucumber",
				"json:target/cucumber.json"},
		features = "./src/test/resources/features",
		glue = "com.cybertek.TikiWiki.stepDefinitions",
		tags = "@JJ",
		dryRun = false
		
)

public class CukesRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public void setup() {
		Extent.setupExtent();
	}

	@AfterClass
	public void tearDown() {
		Extent.flushExtent();
	}

}
