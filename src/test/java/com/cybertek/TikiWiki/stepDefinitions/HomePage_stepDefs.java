package com.cybertek.TikiWiki.stepDefinitions;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
	   Assert.assertTrue(true);
	}



	@When("^Admin renames HomePage$")
	public void admin_renames_HomePage() throws Exception {
		 Assert.assertTrue(true);
	}

	@Then("^Admin should be able to see renamed Home Page$")
	public void admin_should_be_able_to_see_renamed_Home_Page() throws Exception {
		 Assert.assertTrue(true);
	}
	
	@When("^Admin goes to Home Page$")
	public void admin_goes_to_Home_Page() throws Exception {
		 Assert.assertTrue(true);
	}

	@Then("^Admin should be able to edit/rename Home Page$")
	public void admin_should_be_able_to_edit_rename_Home_Page() throws Exception {
		 Assert.assertTrue(true);
	}

	@Then("^Admin should be able to see source/history of Home Page$")
	public void admin_should_be_able_to_see_source_history_of_Home_Page() throws Exception {
		 Assert.assertTrue(true);
	}

	
}
