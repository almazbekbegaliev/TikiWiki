package com.cybertek.TikiWiki.stepDefinitions;



import org.openqa.selenium.WebDriver;

import com.cybertek.TikiWiki.utilities.Browser;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePage_stepDefs {
	
	WebDriver driver = Browser.getDriver();
	
	
	@Given("^Admin logged into Tiki Wiki$")
	public void admin_logged_into_Tiki_Wiki() throws Exception {
	   driver.get(com.cybertek.TikiWiki.utilities.Config.getProperty("url"));
	   
	}



	@When("^Admin renames HomePage$")
	public void admin_renames_HomePage() throws Exception {
	  
	   
	}

	@Then("^Admin should be able to see renamed Home Page$")
	public void admin_should_be_able_to_see_renamed_Home_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
}
