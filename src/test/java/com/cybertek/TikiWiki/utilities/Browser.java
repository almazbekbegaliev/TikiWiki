package com.cybertek.TikiWiki.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	private static WebDriver driver;

	/**
	 * Sets up the driver and returns it
	 * 
	 * @return driver;
	 */
	public static WebDriver getDriver() {

		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {

			String browser;
			try {
				browser = Config.getProperty("browser");
			} catch (NullPointerException e) {
				System.out.println("\n===========You didn't specify BROWSER type:===========");
				System.out.println("=============Default browser is a CHROME==============");
				System.out.println("=============Check your properties file===============");
				browser = "chrome";
			}

			switch (Config.getProperty("browser").toLowerCase()) {

			default:
				System.out.println("You did not select the Browser type");
				System.out.println("=============Default browser is Chrome==============");

			case "chrome":
				WebDriverManager.chromedriver().setup();
				// System.setProperty("webdriver.chrome.driver",
				// Config.getProperty("chromePath"));
				driver = new ChromeDriver();
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "ied":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;

			case "safari":
				WebDriverManager.iedriver().setup();
				driver = new SafariDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return driver;
		
	}
	

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
