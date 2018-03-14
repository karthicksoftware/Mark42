package com.qa.mark42.pageobjects;

import com.qa.mark42.base.ActionListener;

import junit.framework.Assert;

public class HomePage extends ActionListener{

	
	public void verifyPageTitle(String title) throws Exception{
		Assert.assertTrue("Page title doesn't matched", getPageTitle().equalsIgnoreCase(title));
	}
	
	
	
}
