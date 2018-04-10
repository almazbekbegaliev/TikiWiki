package com.cybertek.TikiWiki.pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;

public class CalendarPage {
	
	private WebDriver driver;
	
	public CalendarPage() {
		this.driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Edit']")
	public WebElement edit;
	
	@FindBy(xpath="//a[@title='Admin']")
	public WebElement admin;
	
	@FindBy(xpath="//a[@title='Add Event']")
	public WebElement addEvent;
	
	
	
	
	@FindBy(xpath="//a[@title='List View']")
	public WebElement listView;
	
	@FindBy(xpath="//a[@title='Visible Calendars']")
	public WebElement visibleCalendars;
	
	@FindBy(id="filtercal")
	public WebElement groupCalendars;
	
	@FindBy(className="ui-datepicker-trigger btn btn-sm btn-link")
	public WebElement calendarIcon;
	
	@FindBy(className="form-control isDatepicker hasDatepicker")
	public WebElement dateInput;
	
	@FindBy(xpath="//a[@href='/tiki/tiki-calendar.php?viewmode=day&focus=1523133942']")
	public WebElement today;
	
	@FindBy(xpath="//a[@href='/tiki/tiki-calendar.php?viewmode=day']")
	public WebElement day;
	
	@FindBy(xpath="//a[@href='/tiki/tiki-calendar.php?viewmode=week']")
	public WebElement week;
	
	@FindBy(xpath="//a[@href='/tiki/tiki-calendar.php?viewmode=month']")
	public WebElement month;
	
	@FindBy(xpath="//a[@href='/tiki/tiki-calendar.php?viewmode=quarter']")
	public WebElement quarter;
	
	@FindBy(xpath="//a[@href='/tiki/tiki-calendar.php?viewmode=semester']")
	public WebElement semester;
	
	@FindBy(xpath="//a[@href='/tiki/tiki-calendar.php?viewmode=year']")
	public WebElement year;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
