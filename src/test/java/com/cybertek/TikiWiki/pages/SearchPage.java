package com.cybertek.TikiWiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class SearchPage {
WebDriver driver = Browser.getDriver();
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[.='WIKI TIKI']")
	public WebElement WikiTikiLink;
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement searchInbox;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//a[@href='tiki-ajax_services.php?controller=search&action=help&modal=1']")
	public WebElement helpSearch;
	
	@FindBy(xpath="//ul[@class='searchresults']//a")
	public WebElement result;
}
