package com.cybertek.TikiWiki.stepDefinitions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.cybertek.TikiWiki.pages.ArticlesPage;
import com.cybertek.TikiWiki.pages.ListArticlesPage;
import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListArticles_stepDefs {

	private WebDriver driver;

	@Given("^User opens Articles Home$")
	public void user_opens_Articles_Home() throws Exception {
		driver = Browser.getDriver();
		ArticlesPage articles = new ArticlesPage();
		articles.gotoPage(" List Articles");
	}

	@When("^User searchs for article \"([^\"]*)\"$")
	public void user_searchs_for_article(String text) throws Exception {
		driver = Browser.getDriver();
		ListArticlesPage lArticles = new ListArticlesPage();
		lArticles.searchField.sendKeys(text,Keys.ENTER);
		
		}

	@Then("^User validates search result \"([^\"]*)\"$")
	public void user_validates_search_result(String text) throws Exception {
		driver = Browser.getDriver();
		ListArticlesPage lArticles = new ListArticlesPage();
		List<String> articlesText = BrowserUtils.getElementsText(lArticles.listOfArticles);
		for (String str : articlesText) {
			if (str.contains(text)) {
				Assert.assertEquals(str, text);
				return;
			}
		}
		Assert.assertTrue(false, "Validation of list Articles failed.");
	
	}

	@Then("^User validates negative search result \"([^\"]*)\"$")
	public void user_validates_negative_search_result(String result) throws Exception {
		ListArticlesPage lArticles = new ListArticlesPage();
		Assert.assertEquals(lArticles.norecords.getText().trim(), result);
	}

}
