package com.qa.mark42.base;

public class ActionListener extends CoreClass{

	public String getPageTitle() throws Exception{
		return getTitle().trim();
	}
	public void launchApplication(String url) throws Exception{
		launchApp(url);
	}
}
