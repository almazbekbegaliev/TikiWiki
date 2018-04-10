package com.cybertek.TikiWiki.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class AddEventPage {
	WebDriver driver;
	
	public AddEventPage() {
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name ="save[calendarId]")
	public WebElement calendar;
	
	@FindBy(name="save[name]")
	public WebElement title;
	
	@FindBy(xpath="//div/input[@id='start_dptxt']")
	public WebElement startInput;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']")
	public WebElement calendarIcon;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//tbody//td")
	public List <WebElement> caleondarDays;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//td")
	public List <WebElement> caleondarEndDays;
	
	@FindBy(className="ui-datepicker-current ui-state-default ui-priority-secondary ui-corner-all")
	public WebElement today;
	
	@FindBy(className="ui-datepicker-close ui-state-default ui-priority-primary ui-corner-all")
	public WebElement done;
	
	@FindBy(xpath="(//div//button[@class='ui-datepicker-trigger btn btn-sm btn-link'])[1]")
	public WebElement startCalendarIcon;
	
	@FindBy(xpath="//input[@id='end_dptxt']")
	public WebElement endInput;
	
	@FindBy(xpath="(////div[@id='ui-datepicker-div']")
	public WebElement endCalendarIcon;
	
	@FindBy(xpath="//select[@name='start_Hour']")
	public WebElement startHour;
	
	@FindBy(xpath="//select[@name='start_Minute']")
	public WebElement startMinute;
	
	@FindBy(xpath="//select[@name='end_Hour']")
	public WebElement endHour;
	
	@FindBy(xpath="//select[@name='end_Minute']")
	public WebElement endMinute;
	
	@FindBy(id="allday")
	public WebElement allday;
	
	@FindBy(name="save[description]")
	public WebElement description;
	
	@FindBy(name="preview")
	public WebElement preview;
	
	@FindBy(xpath ="//div//input[@name='act']")
	public WebElement save;
	
	@FindBy(xpath="//div//input[@value='Cancel']")
	public WebElement cancel;
}