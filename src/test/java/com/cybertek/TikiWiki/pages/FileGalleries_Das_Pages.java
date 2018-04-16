package com.cybertek.TikiWiki.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class FileGalleries_Das_Pages {

	private WebDriver driver;

	public FileGalleries_Das_Pages(){
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(.,'File Galleries')]")
	public WebElement fileGalleries;
	
	@FindBy(xpath="//a[contains(.,'List Galleries')]")
	public WebElement listGalleries;
	
	@FindBy(xpath="//div[@class='col-xs-12']//input[@class='form-control']")
	public WebElement searchBox;
	
	@FindBy(xpath="//div[@class='col-xs-12']//span[@class='icon icon-search glyphicon glyphicon-search ']")
	public WebElement searchBtn;
	
	@FindBy(linkText="GoToWebinar 000")
	public WebElement actualLink;
	
	@FindBy(xpath="//a[@title='Created / Uploaded']")
	public WebElement createdUploaded;
	
	@FindBy(xpath="//ul[@class='pagination']//li//a")
	public List<WebElement> numsOfPages;
	
	@FindBy(xpath="//tr[2]//td[8]")
	public WebElement firstElem;
	
	@FindBy(xpath="//tr[11]//td[8]")
	public WebElement lastElem;
	
	public int returnInt(String str) {
		String latestDateNums = str.replace("-", "");
		return Integer.parseInt(latestDateNums);
	}
	
	
}