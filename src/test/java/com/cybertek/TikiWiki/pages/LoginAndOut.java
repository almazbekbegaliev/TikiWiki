package com.cybertek.TikiWiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.Config;

public class LoginAndOut {
	WebDriver driver;

	public LoginAndOut() {
		driver = Browser.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".btn.btn-link.dropdown-toggle")
	WebElement login;

	@FindBy(css = "input[name='user']")
	WebElement userName;

	@FindBy(css = "input[name='pass']")
	WebElement password;

	@FindBy(xpath = "//button[.='Log in ']")
	WebElement loginButton;

	public void logIn() {
		driver.get(Config.getProperty("url"));
		login.click();
		userName.sendKeys(Config.getProperty("username"));
		password.sendKeys(Config.getProperty("password"));
		loginButton.click();
	}
	
	@FindBy(xpath="//button[contains(text(),'Log out')]")
	WebElement logout;
	
	@FindBy(xpath="//a[.='Log out']")
	WebElement signOut;
	
	public void logoutClick() {
		logout.click();
		signOut.click();
	}

}
