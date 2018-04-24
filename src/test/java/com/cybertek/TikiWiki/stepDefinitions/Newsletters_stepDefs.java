package com.cybertek.TikiWiki.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cybertek.TikiWiki.pages.LoginPage;

import com.cybertek.TikiWiki.utilities.Browser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Newsletters_stepDefs {

	WebDriver driver = Browser.getDriver();
	LoginPage log = new LoginPage();

	@Given("^User navigates to Admin newsletters$")
	public void user_navigates_to_Admin_newsletters() throws Exception {
		log.logIn();
	}

	@When("^User creates newsletter using \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_creates_newsletter_using(String arg1, String arg2, String arg3, String arg4, String arg5) {
	}

	@Then("^\"([^\"]*)\" \"([^\"]*)\" should be created$")
	public void should_be_created(String arg1, String arg2) throws Exception {
	}
}
