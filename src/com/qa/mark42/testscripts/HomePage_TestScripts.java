package com.qa.mark42.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.mark42.base.ActionListener;
import com.qa.mark42.pageobjects.HomePage;

public class HomePage_TestScripts extends ActionListener {

	private HomePage home = new HomePage();

	@BeforeMethod
	@Parameters(value = { "Browser", "URL", })
	public void launchBrowser(String browser, String URL) throws Exception {
		System.out.println("Im launch browser");
		initializeBrowsers(browser);
		launchApplication(URL);
	}

	@Test
	@BeforeGroups
	private void VerifyPageTitle() throws Exception {
		System.out.println("Method 0");
		home.verifyPageTitle("HDFC Bank: Personal Banking Services");
	}
	
	@Test
	private void method1() throws Exception {
		System.out.println("Method 1");
		home.verifyPageTitle("HDFC Bank: Personal Banking Services");
	}
	@Test
	private void method2() throws Exception {
		home.verifyPageTitle("HDFC Bank: Personal Banking Services");
		System.out.println("Method 2");
	}
	@Test
	private void method3() throws Exception {
		home.verifyPageTitle("HDFC Bank: Personal Banking Services");
		System.out.println("Method 3");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		quitBrowser();
	}
}
