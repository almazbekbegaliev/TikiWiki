package com.cybertek.TikiWiki.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cybertek.TikiWiki.pages.ArticleHomePage;
import com.cybertek.TikiWiki.pages.ArticlesPage;
import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.BrowserUtils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ArticlesHome_stepDef {
	WebDriver driver = Browser.getDriver();

	@Given("^User opens Articles Home$")
	public void user_opens_Articles_Home() throws Exception {
		ArticlesPage articlesPage = new ArticlesPage();
		articlesPage.articlesLink.click();
		articlesPage.gotoPage("Articles Home");
	}

	@Then("^User should be able to see articles$")
	public void user_should_be_able_to_see_articles() throws Exception {
		ArticleHomePage artPage = new ArticleHomePage();
		Assert.assertTrue(artPage.article1.isDisplayed(), "The article is displayed");
	}

	@Then("^User removes article \"([^\"]*)\"$")
	public void user_removes_article(String arg1) throws Exception {
		ArticleHomePage artPage = new ArticleHomePage();
		for (int i = 0; i < artPage.article.size(); i++) {
			if (!artPage.article.isEmpty()) {
				Actions actions = new Actions(driver);
				actions.moveToElement(artPage.settings).build().perform();
//				BrowserUtils.waitForVisibility(artPage.remove, 5);
				artPage.remove.click();
				break;
				
			}else {
				System.out.println("The article not removed===================>");
			}

		}

	}

	@Then("^Removed article shouldn't be on the list of Articles$")
	public void removed_article_shouldn_t_be_on_the_list_of_Articles() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^User opens Articles Home Page$")
	public void user_opens_Articles_Home_Page() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^User Should be able to edit any article \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_Should_be_able_to_edit_any_article(String arg1, String arg2, String arg3) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
