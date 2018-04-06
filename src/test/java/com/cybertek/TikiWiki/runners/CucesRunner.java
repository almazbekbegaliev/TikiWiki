package com.cybertek.TikiWiki.runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cybertek.TikiWiki.utilities.Extent;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		plugin = { "pretty", "html:target/cucumber" },
		features = "./src/test/resources/features",
		glue = "stepDefinitions",
		tags = "@Excel"
    dryRun = true
)

public class CucesRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public void setup() {
		System.out.println("Hello from BeforeClass");
		Extent.setupExtent();
	}

	@AfterClass
	public void tearDown() {
		Extent.flushExtent();
	}

}
