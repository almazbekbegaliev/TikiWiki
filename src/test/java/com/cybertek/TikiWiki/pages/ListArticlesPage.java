package com.cybertek.TikiWiki.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class ListArticlesPage {

	private WebDriver driver;
	
	public ListArticlesPage() {
		driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css= ".table td.text>a")
	public List<WebElement> listOfArticles;
	
	@FindBy(css = ".table td.norecords")
	public WebElement norecords;
	
	@FindBy(id = "find")
	public WebElement searchField;
	
	
	
	
	
	
}
