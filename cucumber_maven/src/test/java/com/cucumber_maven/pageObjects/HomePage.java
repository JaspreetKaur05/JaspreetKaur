package com.cucumber_maven.pageObjects;

import org.openqa.selenium.WebDriver;

import com.cucumber_maven.managers.FileReaderManager;

public class HomePage
{
	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void HomePage()
	{
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
}
