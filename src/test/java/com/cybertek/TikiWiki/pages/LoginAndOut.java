package com.cybertek.TikiWiki.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.BrowserUtils;
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

	@FindBy(css = "button.dropdown-toggle.login_link.btn.btn-link")
	WebElement logout;
	
	@FindBy(css ="a[href='tiki-logout.php']")
	WebElement signOut;
	
	@FindBy(css ="button[class='btn btn-link dropdown-toggle']")
	WebElement logInLink;
	
	public void logIn() {
		try {
			login.click();
			BrowserUtils.sleep(1);
			logoutClick();
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}catch (Exception e) {
			
		}
		driver.get(Config.getProperty("url"));
		login.click();
		BrowserUtils.sleep(1);

		userName.sendKeys(Config.getProperty("username"));
		BrowserUtils.sleep(1);
		password.sendKeys(Config.getProperty("password"));
		BrowserUtils.sleep(1);
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
