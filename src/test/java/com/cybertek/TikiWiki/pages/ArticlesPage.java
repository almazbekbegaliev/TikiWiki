package com.cybertek.TikiWiki.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class ArticlesPage {

	WebDriver driver = Browser.getDriver();
	public ArticlesPage(String one) {
		
	}
	public ArticlesPage() {
		this("one");
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='#menu_option250']")
	public WebElement articlesLink;
	
	@FindBy(xpath = "//ul[@class='nav collapse in']")
	public WebElement subMenus;
	

	
	public void gotoPage(String page) {
		articlesLink.click();
		subMenus.findElement(By.xpath("//ul[@class='nav collapse in']//a[contains(text(),'"+ page +"')]")).click();
	}
	
	
	
	
	
	
	
	
	
}
