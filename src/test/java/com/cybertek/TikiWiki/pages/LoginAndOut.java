package com.cybertek.TikiWiki.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.Config;

public class LoginAndOut {

	WebDriver driver;
 master

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

	@FindBy(css = "button.dropdown-toggle.login_link.btn.btn-link")
	WebElement logout;
	
	@FindBy(css ="a[href='tiki-logout.php']")
	WebElement signOut;
	
	@FindBy(css ="button[class='btn btn-link dropdown-toggle']")
	WebElement logInLink;
	
	public void logIn() {
		try {
			logoutClick();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}catch (Exception e) {
			
		}
		driver.get(Config.getProperty("url"));
		driver.manage().window().fullscreen();
		logInLink.click();
		login.click();
		userName.sendKeys(Config.getProperty("username"));
		password.sendKeys(Config.getProperty("password"));
		loginButton.click();
	}
	
	
	public void logoutClick() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}catch(Exception ee) {
			
		}
		logout.click();
		signOut.click();
	}

}
