package com.cybertek.TikiWiki.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.cybertek.TikiWiki.pages.HomePage;
import com.cybertek.TikiWiki.pages.SearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_stepDef {
	@When("^User searches for (.*)$")
	public void user_searches_for(String str) throws Exception {
		HomePage homePage = new HomePage();
		homePage.search.click();
		SearchPage seachPage = new SearchPage();
		seachPage.searchInbox.click();
		seachPage.searchInbox.sendKeys(str);
		seachPage.searchBtn.click();
	}

	@Then("^pages which contains searched page should come up \"([^\"]*)\"$")
	public void pages_which_contains_searched_page_should_come_up(String str) throws Exception {
		SearchPage seachPage = new SearchPage();
		List<String> resultContains = new ArrayList<>();

		if (seachPage.result.getText().contains(str)) {
			resultContains.add(seachPage.result.getText());
		} else {
			System.out.println("Result is not exist");
		}
		System.out.println(resultContains.get(0) + "======> This is the result that we get after we search");
		Assert.assertTrue(seachPage.result.getText().contains(str), str);

	}
}
