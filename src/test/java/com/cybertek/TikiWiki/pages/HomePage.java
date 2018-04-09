package com.cybertek.TikiWiki.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cybertek.TikiWiki.utilities.Browser;

public class HomePage {
	private WebDriver driver;

	public HomePage(){
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='./']")
	public WebElement home;
	
	@FindBy(xpath="//a[@href='tiki-searchindex.php']")
	public WebElement search;
	
	@FindBy(xpath="//a[@href='tiki-browse_categories.php']")
	public WebElement caterogies;
	
	@FindBy(xpath="//a[@href='tiki-browse_freetags.php']")
	public WebElement tags;
	
	@FindBy(xpath="//a[@href='tiki-calendar.php']")
	public WebElement calendar;
	
	@FindBy(xpath="//a[@href='#menu_option32']")
	public WebElement wiki;
	
	@FindBy(xpath="//a[@href='#menu_option51']")
	public WebElement articles;
	
	@FindBy(xpath="//a[@href='#menu_option67']")
	public WebElement blogs;
	
	@FindBy(xpath="//a[@href='#menu_option73']")
	public WebElement forums;
	
	@FindBy(xpath="//a[@href='#menu_option83']")
	public WebElement fileGalleries;
	
	@FindBy(xpath="//a[@href='#menu_option95']")
	public WebElement spreadSheets;
	
	@FindBy(xpath="//a[@href='#menu_option97']")
	public WebElement trackers;
	
	@FindBy(xpath="//a[@href='#menu_option102']")
	public WebElement surveys;
	
	@FindBy(xpath="//a[@href='#menu_option106']")
	public WebElement newsLetters;
	
	@FindBy(xpath="//a[@href='#menu_option112']")
	public WebElement settings;
	
	
	@FindBy(linkText="Rename")
	public WebElement rename;
	
	@FindBy(xpath="//a[@title='Edit this page']")
	public WebElement edit;
	
	@FindBy(linkText="Source")
	public WebElement source;
	
	@FindBy(linkText="History")
	public WebElement history;
	
	@FindBy(className="btn-group dropup open")
	public WebElement more;
	
	@FindBy(xpath="//div[@id='mod-menuleft1']//ul")
	public List<WebElement> menu;
	
	@FindBy(xpath="//a[@href='tiki-admin.php?page=features']")
	public WebElement specificFeatures;
	
	@FindBy(xpath="//a[@href='tiki-admin.php?page=profiles']")
	public WebElement tikiProfiles;
	
	
	
	public void printMenu() {
		menu = new ArrayList<>();
		for(WebElement m: menu) {
			System.out.println(m.getText());
		}
	}
	
	
}
