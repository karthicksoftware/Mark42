package com.qa.mark42.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class CoreClass {
	public static WebDriver driver = null;
	
	public void initializeBrowsers(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Karthick\\Automation\\Workspace\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			System.setProperty("webdriver.ie.driver","C:\\Karthick\\Automation\\Workspace\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	}
	
	protected void launchApp(String url) throws Exception{
		driver.get(url);
	}
	
	protected String getTitle() throws Exception{
		return driver.getTitle();
	}
	
	protected void quitBrowser() throws Exception{
		driver.quit();
	}
	
	
}
