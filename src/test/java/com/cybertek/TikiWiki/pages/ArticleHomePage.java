package com.cybertek.TikiWiki.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class ArticleHomePage {

WebDriver driver = Browser.getDriver();
	
	public ArticleHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='col-md-9 col-md-push-3 col1']/article")
	public List<WebElement> article;
	
	@FindBy(xpath ="//div[@class='col-md-9 col-md-push-3 col1']/article")
	public WebElement article1;
	
	@FindBy(xpath="(//div[@class='articletrailer']/div)[1]")
	public WebElement settings;
	
	@FindBy(xpath="(//div[@class='articletrailer']/div)[1]//ul//li[5]")
	public WebElement remove;
	
	
	
	
}
