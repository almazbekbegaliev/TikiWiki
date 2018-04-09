package com.cybertek.TikiWiki.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class ArticlesPage {

	WebDriver driver = Browser.getDriver();
	
	public ArticlesPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='#menu_option250']")
	public WebElement articlesLink;
	
	@FindBy(xpath = "//ul[@class='nav collapse in']//a")
	public List<WebElement> subMenus;
	

	
	public void gotoPage(String page) {
		articlesLink.click();
		System.out.println("Clicked Articles");
		for(WebElement elem: subMenus) {
			if(elem.getText().contains(page)) {
				elem.click();
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
