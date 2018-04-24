package com.cybertek.TikiWiki.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cybertek.TikiWiki.utilities.Browser;
import com.cybertek.TikiWiki.utilities.BrowserUtils;
import com.cybertek.TikiWiki.utilities.Config;

public class LoginPage {

	WebDriver driver;


	public LoginPage() {
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
		driver.get(Config.getProperty("url"));
		login.click();
		BrowserUtils.sleep(1);

		userName.sendKeys(Config.getProperty("username"));
		BrowserUtils.sleep(1);
		password.sendKeys(Config.getProperty("password"));
		BrowserUtils.sleep(1);
		loginButton.click();
	}
	
	
	public void logout() {
//		try {
//			logout.click();
//			BrowserUtils.sleep(1);
//			logout.click();
//			BrowserUtils.sleep(2);
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//		}catch (Exception e) {
//			
//		}
		// logout.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement element = BrowserUtils.waitForClickablility(logout, 4);
		js.executeScript("arguments[0].click()", element);
		BrowserUtils.sleep(2);
		signOut.click();
	}

}
