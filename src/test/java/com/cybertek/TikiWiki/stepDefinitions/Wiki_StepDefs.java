package com.cybertek.TikiWiki.stepDefinitions;

import com.cybertek.TikiWiki.pages.WikiPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Wiki_StepDefs {
	WikiPage wiki = new WikiPage();

	@Given("^User navigates to Admin Calendars page$")
	public void user_navigates_to_Admin_Calendars_page() throws Exception {
		wiki.createEventClick();
	}

	@When("^User creates \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_creates(String name, String title, String start, String end, String desc, String location) {
		wiki.calendarData(name, title, start, end, desc, location);
	}

	@Then("^My Company Calendar should in the calendar list$")
	public void my_Company_Calendar_should_in_the_calendar_list() throws Exception {
		
	}

	@Given("^User navigates to Calendar page$")
	public void user_navigates_to_Calendar_page() throws Exception {
	}

	@When("^User edits calendar$")
	public void user_edits_calendar() throws Exception {
	}

	@Then("^Edited Calendar should be in the list$")
	public void edited_Calendar_should_be_in_the_list() throws Exception {
	}

	@When("^User imports CSV file$")
	public void user_imports_CSV_file() throws Exception {
	}

	@Then("^Calendar should be imported$")
	public void calendar_should_be_imported() throws Exception {
	}

	@When("^User searches for \"([^\"]*)\"$")
	public void user_searches_for(String arg1) throws Exception {

	}

	@Then("^\"([^\"]*)\" should be in the result list$")
	public void should_be_in_the_result_list(String arg1) throws Exception {

	}
}
