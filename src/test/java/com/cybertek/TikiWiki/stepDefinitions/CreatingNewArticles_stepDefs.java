
package com.cybertek.TikiWiki.stepDefinitions;

import static org.testng.Assert.assertEquals;

 package com.cybertek.TikiWiki.stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import static org.testng.Assert.*;


import com.cybertek.TikiWiki.pages.ArticlesPage;
import com.cybertek.TikiWiki.pages.LoginAndOut;
import com.cybertek.TikiWiki.pages.NewArticlesPage;
import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.BrowserUtils;
import com.cybertek.TikiWiki.utilities.ExcelUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingNewArticles_stepDefs {

	private String expected;

	@Given("^User is logged into Tiki Wiki$")
	public void user_is_logged_into_Tiki_Wiki() {
		WebDriver driver = Browser.getDriver();
		LoginAndOut loginPage = new LoginAndOut();
		loginPage.logIn();

	}

	@Given("^User Goes to New Article page$")
	public void user_Goes_to_New_Article_page() {
		ArticlesPage articles = new ArticlesPage();
		articles.gotoPage("New Article");
	}

	@When("^User creates a new article by content \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_creates_a_new_article_by_content(String excelPath, String sheet) {
		NewArticlesPage newArt = new NewArticlesPage();
		ExcelUtils.openExcelFile(excelPath, sheet);

		String title = ExcelUtils.getCellData(1, 0);
		if (title != null) {
			newArt.titleInput.sendKeys(title);
			expected = ExcelUtils.getCellData(1, 0);
		}
		
		String heading = ExcelUtils.getCellData(1, 1);
		if(heading != null) {
			newArt.headingInput.sendKeys(heading);
		}
		
		String body =  ExcelUtils.getCellData(1, 2);
		if(body != null){
			newArt.bodyInput.sendKeys(body);
		}
		
		newArt.saveBtn.click();
	}

	@Then("^Article should be displayed on the list$")
	public void article_should_be_displayed_on_the_list() {
		NewArticlesPage newArt = new NewArticlesPage();
		String actual = newArt.newArticle.getText();
		
		assertEquals(actual, expected);
	}

	@Then("^User is logged out from App$")
	public void user_is_logged_out_from_App() {
		LoginAndOut loginPage = new LoginAndOut();
		loginPage.logoutClick();
	}

	@When("^User creates a new article \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_creates_a_new_article(String title, String topic, String type, String category, String tag) {
		NewArticlesPage newArt = new NewArticlesPage();
		
		expected = title;
		BrowserUtils.sleep(1);
		newArt.content.click();
		newArt.titleInput.sendKeys(title);
		BrowserUtils.sleep(1);
		newArt.classification.click();
		BrowserUtils.sleep(1);
		Select topicD = new Select(newArt.topicDrD);
		topicD.selectByVisibleText(topic);
		BrowserUtils.sleep(1);
		newArt.tagInput.sendKeys(tag);
		BrowserUtils.sleep(1);
		newArt.saveBtn.click();
		
	}
	
}
