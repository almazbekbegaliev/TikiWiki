package com.cybertek.TikiWiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cybertek.TikiWiki.utilities.Browser;

public class WikiPage {
	public WikiPage() {
		WebDriver driver=Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[.='Calendar']")
	WebElement calendarLink;
	
	@FindBy(xpath="//a[.=' Add Event']")
	WebElement createEvent;
	
	public void createEventClick() {
		calendarLink.click();
		createEvent.click();
	}
	
	@FindBy(id="calid")
	WebElement calendarSel;
	
	@FindBy(name="save[name]")
	WebElement title;
	
	@FindBy(id="start_dptxt")
	WebElement start;
	
	@FindBy(id="end_dptxt")
	WebElement end;
	
	@FindBy(id="allday")
	WebElement alldayCheckBox;
	
	@FindBy(id="editwiki")
	WebElement description;
	
	@FindBy(id="save[newloc]")
	WebElement location;
	
	@FindBy (css="input[name='act']")
	WebElement saveButton;
	
	public void calendarData(String name, String title,String start, String end,  String desc, String location) {
		Select sel=new Select(calendarSel);
		sel.selectByVisibleText(name);
		this.title.sendKeys(title);
		this.start.clear();
		this.start.sendKeys(start);
		this.end.clear();
		this.end.sendKeys(end);
		this.description.sendKeys(desc);
		alldayCheckBox.click();
		this.location.sendKeys(location);
		saveButton.click();
		
	}
	

}
