
package com.cybertek.TikiWiki.stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.cybertek.TikiWiki.pages.FileGalleries_Das_Pages;
import com.cybertek.TikiWiki.utilities.Browser;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FileGalleries_Das_StepDef {
	
	WebDriver driver = Browser.getDriver();
	FileGalleries_Das_Pages fp = new FileGalleries_Das_Pages();


	@When("^I go to List Galleries$")
	public void i_go_to_List_Galleries() throws Exception {
		fp.fileGalleries.click();
		fp.listGalleries.click();
	}
	
	@And("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Exception {
		fp.searchBox.sendKeys(arg1, Keys.ENTER);
		fp.searchBtn.click();
	}
	
	@Then("^verify link is found$")
	public void verify_link_is_found() throws Exception {
	   Assert.assertTrue(fp.actualLink.getText().equals("GoToWebinar 000"), "link is not found");
	}

	
	@Then("^I verify it sorts from latest date to oldest$")
	public void i_verify_it_sorts_from_latest_date_to_oldest() throws Exception {
		System.out.println("First element from a table:"+fp.firstElem.getText());
		int i = fp.returnInt(fp.firstElem.getText());
		
		fp.numsOfPages.get(fp.numsOfPages.size()-3).click();
		
		System.out.println(fp.returnInt(fp.lastElem.getText()));

		int j = fp.returnInt(fp.lastElem.getText());
		Assert.assertTrue(i > j);
	    
//	    for(WebElement wb : fp.lastPage) {
//	    System.out.println(wb.getText());
//	    }
	}
	

	@Then("^I sort by Created/Uploaded$")
	public void i_sort_by_Created_Uploaded() throws Exception {
		fp.createdUploaded.click();
	}

	@Then("^I verify it sorts from oldest to latest date$")
	public void i_verify_it_sorts_from_oldest_to_latest_date() throws Exception {
		System.out.println("First element from a table:"+fp.firstElem.getText());
		int i = fp.returnInt(fp.firstElem.getText());
		System.out.println("first date: "+i);
		
		fp.numsOfPages.get(fp.numsOfPages.size()-3).click();
		
		System.out.println(fp.returnInt(fp.lastElem.getText()));

		int j = fp.returnInt(fp.lastElem.getText());
		System.out.println("last date: "+j);
		Assert.assertTrue(i < j);
	}
	
}