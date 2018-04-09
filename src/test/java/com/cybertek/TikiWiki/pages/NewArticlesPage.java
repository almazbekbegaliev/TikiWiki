package com.cybertek.TikiWiki.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class NewArticlesPage {

	WebDriver driver = Browser.getDriver();
	
	public NewArticlesPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "input[name='title']")
	public WebElement titleInput;
	
	@FindBy(css = "textarea[name='heading']")
	public WebElement headingInput;
	
	@FindBy(css = "textarea#body")
	public WebElement bodyInput;
	
	@FindBy(name = "save")
	public WebElement saveBtn;
	
	@FindBy(css = ".articletitle a")
	public WebElement newArticle;
	
	@FindBy(xpath = "//a[.='Classification']")
	public WebElement classification;
	
	@FindBy(xpath = "//a[.='Content']")
	public WebElement content;
	
	@FindBy(name = "topicId")
	public WebElement topicDrD;
	
	@FindBy(id = "articletype")
	public WebElement articleDrD;
	
	@FindBy(css = "div[class='col-sm-8'] a[data-role='button']")
	public WebElement selectCategBtn;
	
	@FindBy(xpath ="")
	public WebElement categories;
	
	@FindBy(id = "tagBox")
	public WebElement tagInput;
	
	
	public void selectCategory(String category) {
		selectCategBtn.click();
		driver.findElement(By.xpath("//label[starts-with(@for,'categ')][contains(.,'"+category+"')]")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
