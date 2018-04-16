package com.cybertek.TikiWiki.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cybertek.TikiWiki.pages.AddEventPage;
import com.cybertek.TikiWiki.pages.CalendarPage;
import com.cybertek.TikiWiki.pages.HomePage;
import com.cybertek.TikiWiki.pages.LoginAndOut;
import com.cybertek.TikiWiki.utilities.Browser;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalendarPage_stepDefs {
	
	private WebDriver driver;
	
	CalendarPage cp = new CalendarPage();
	
	AddEventPage ap = new AddEventPage();
	
	HomePage hp = new HomePage();
	LoginAndOut lo = new LoginAndOut();
	Actions action ;
	
	
	
	Select sl;
	Select selectHour;
	Select selectMinute;
	List <WebElement> pickStartDay;
	List <WebElement> pickEndDay;
	
	@Given("^User navigates to Admin Calendars page$")
	public void user_navigates_to_Admin_Calendars_page() throws Exception {
	    driver = Browser.getDriver();
	    
	   
	    lo.logIn();
	    Thread.sleep(5000);
	    hp.calendar.click();
	}


	@When("^User creates \"([^\"]*)\"$")
	public void user_creates(String arg1) throws Exception {
		Thread.sleep(3000);
	   cp.addEvent.click();
	   Thread.sleep(3000);
	   sl = new Select(ap.calendar);
	   sl.selectByIndex(2);
	   ap.title.sendKeys("My Company Holidays Calendar");
	   ap.startInput.click();
	   
	   pickStartDay= new ArrayList<>(ap.caleondarDays);
	
	   
	   for(WebElement day : pickStartDay) {
		   if(day.getText().equals("15")) {
			   day.click();
			   break;
		   }
	   }
	   
	 
	  Thread.sleep(3000);
	  selectHour = new Select(ap.startHour);
	  selectHour.selectByValue("13");
	  
	  selectMinute = new Select(ap.startMinute);
	  selectMinute.selectByValue("00");
	
	  
	pickEndDay = new ArrayList<>(ap.caleondarEndDays);
	
	   for(WebElement day : pickEndDay) {
		   if(day.getText().equals("11")) {
			   day.click();
			   break;
		   }
	   }
	  
	   
	 sl = new Select(ap.endHour);
	 sl.selectByValue("15");
	 
	  sl = new Select(ap.endMinute);
	  sl.selectByValue("30");
	  
	  ap.description.click();
	  ap.description.sendKeys("Our company foundation celebration");
	
	ap.save.click();
	
	
	}

	@Then("^\"([^\"]*)\" should in the calendar list$")
	public void should_in_the_calendar_list(String arg1) throws Exception {
		String actualEvent ="";
	   List <WebElement> events =driver.findElements(By.xpath("//table[@class='caltable table']//tr"));
	   for(WebElement event: events) {
		if(event.getText().equals("My Company Holidays Calendar")) {
			actualEvent = event.getText();
			break;
		}
		   
	   }
	   Assert.assertEquals(actualEvent, "My Company Holidays Calendar");
	}

	@Given("^User navigates to Calendar page$")
	public void user_navigates_to_Calendar_page() throws Exception {
	    Assert.assertTrue(true);
	}

	@When("^User edits calendar$")
	public void user_edits_calendar() throws Exception {
		 Assert.assertTrue(true);
	}

	@Then("^Edited Calendar should be in the list$")
	public void edited_Calendar_should_be_in_the_list() throws Exception {
		 Assert.assertTrue(true);
	}

	@When("^User imports CSV file$")
	public void user_imports_CSV_file() throws Exception {
		 Assert.assertTrue(true);
	}

	@Then("^Calendar should be imported$")
	public void calendar_should_be_imported() throws Exception {
		 Assert.assertTrue(true);
	}

	@When("^User searches for \"([^\"]*)\"$")
	public void user_searches_for(String arg1) throws Exception {
		 Assert.assertTrue(true);
	}

	@Then("^\"([^\"]*)\" should be in the result list$")
	public void should_be_in_the_result_list(String arg1) throws Exception {
		 Assert.assertTrue(true);
	}
	
	
}
