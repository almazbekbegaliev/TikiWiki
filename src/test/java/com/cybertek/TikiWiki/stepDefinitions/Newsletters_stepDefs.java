package com.cybertek.TikiWiki.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cybertek.TikiWiki.pages.LoginAndOut;
import com.cybertek.TikiWiki.pages.NewsletterPage;
import com.cybertek.TikiWiki.utilities.Browser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Newsletters_stepDefs {

	WebDriver driver = Browser.getDriver();
	LoginAndOut log = new LoginAndOut();
	NewsletterPage newsletter = new NewsletterPage();

	@Given("^User loges in as Admin$")
	public void user_loges_in_as_Admin() throws Exception {
		log.logIn();
	}

	@Given("^User navigates to Admin newsletters$")
	public void user_navigates_to_Admin_newsletters() throws Exception {
		newsletter.adminNewsletterClick();
		newsletter.createNewslettersClick();
	}

	@When("^User creates newsletter using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_creates_newsletter_using(String name, String descript, String arg3, String days, String types) throws InterruptedException {

		newsletter.sendData(name, descript, days, types);
	}

	@Then("^\"([^\"]*)\" \"([^\"]*)\" should be created$")
	public void should_be_created(String arg1, String arg2) throws Exception {
	}

	/**
	 * Newsletter
	 * @throws InterruptedException 
	 * 
	 * @newnew Scenario 2
	 */

	@Given("^User navigates to send newsletters page$")
	public void user_navigates_to_send_newsletters_page() throws InterruptedException {
		newsletter.sendLinkClick();
	}

	@When("^User sends newsletter using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_sends_newsletter_using(String subject, String newslet, String dataHtml, String dataTxt,
			String clip, String replyTo, String sendFrom) {
		newsletter.sendData2(subject, "", dataHtml, dataTxt, clip, replyTo, sendFrom);
	}

	@Then("^Newsletter is bein sent$")
	public void newsletter_is_bein_sent() {
	}
}
