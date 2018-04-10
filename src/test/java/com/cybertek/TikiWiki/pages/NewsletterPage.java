package com.cybertek.TikiWiki.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.BrowserUtils;

public class NewsletterPage {
	WebDriver driver;
	Actions act;

	public NewsletterPage() {
		driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
		

	}

	@FindBy(xpath = "//a[@href='#menu_option305']")
	WebElement newsletter;

	@FindBy(xpath = "//a[.=' Admin Newsletters']")
	WebElement adminNewsletters;

	@FindBy(xpath = "//a[.=' Create']")
	WebElement createNewsletters;

	/**
	 * Click on Newsletter link
	 * 
	 * @throws InterruptedException
	 */
	JavascriptExecutor js;
		
	public void adminNewsletterClick() throws InterruptedException {
//		js.executeScript("window.scrollBy(0,1000);");
		js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);");
		BrowserUtils.sleep(2);
		act = new Actions(driver);
		BrowserUtils.sleep(2);
		act.moveToElement(newsletter).click().build().perform();
		adminNewsletters.click();
	}

	public void createNewslettersClick() {
		createNewsletters.click();
	}

	@FindBy(xpath = "//a[.=' Send Newsletters']")
	WebElement sendNewsletters;

	/**
	 * Creating new Newsletter
	 * 
	 * @throws InterruptedException
	 * 
	 */

	@FindBy(name = "name")
	WebElement name;

	@FindBy(id = "description")
	WebElement description;

	@FindBy(id = "articleClipRangeDays")
	WebElement numOfDays;

	@FindBy(id = "articleClipTypes")
	WebElement clipTypes;

	@FindBy(id = "save")
	WebElement saveButton;

	/**
	 * Sending data from Examples table
	 * 
	 * @param name
	 * @param descript
	 * @param days
	 * @param types
	 * @throws InterruptedException 
	 */

	public void sendData(String name, String descript, String days, String types) throws InterruptedException {
		js=(JavascriptExecutor)driver;
		this.name.sendKeys(name);
		BrowserUtils.sleep(1);
		description.sendKeys(descript);
		BrowserUtils.sleep(1);
		js.executeScript("window.scrollBy(0,1500);");
		numOfDays.clear();
		numOfDays.sendKeys(days);
		BrowserUtils.sleep(1);
		Select sel=new Select(clipTypes);
		sel.selectByVisibleText(types);
		BrowserUtils.sleep(2);
//		clipTypes.sendKeys(types);
	}

	@FindBy(xpath = "//a[.=' Send']")
	WebElement sendLink;

	@FindBy(id = "subject")
	WebElement subject;

	@FindBy(id = "nlId")
	WebElement newsLetterDropdown;

	@FindBy(css = ".edit-zone #editwiki")
	WebElement dataHtml;

	@FindBy(id = "editwikitxt")
	WebElement dataTxt;

	@FindBy(id = "replyto")
	WebElement replyToEmail;

	@FindBy(id = "sendfrom")
	WebElement sendFrom;

	@FindBy(css = "input[name='save']")
	WebElement sendButton;

	@FindBy(name = "send")
	WebElement confirmSend;

	/**
	 * Send data to email newsletters
	 * 
	 * @param subj
	 * @param newletter
	 * @param html
	 * @param dataTxt
	 * @param clip
	 * @param reply
	 * @param sentFrom
	 * @throws InterruptedException 
	 */

	public void sendLinkClick() throws InterruptedException {
		act = new Actions(driver);
		BrowserUtils.sleep(2);
		act.moveToElement(newsletter).click().build().perform();
		sendNewsletters.click();
	}

	public void sendData2(String subj, String newletter, String html, String dataTxt, String clip, String reply,
			String sentFrom) {

		subject.sendKeys(subj);
		Select sel = new Select(newsLetterDropdown);
		// sel.selectByVisibleText(newletter);
		dataHtml.sendKeys(html);
		this.dataTxt.sendKeys(dataTxt);
		replyToEmail.sendKeys(reply);
		sendFrom.sendKeys(sentFrom);
		sendButton.click();
		confirmSend.click();

	}
}
