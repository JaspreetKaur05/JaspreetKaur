package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount
{
	private WebDriver driver;
	By personalInformation=By.cssSelector("a[title='Information']");
	
	public MyAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Personnel_Information MyAccountClick()
	{
		driver.findElement(personalInformation).click();
		return new Personnel_Information(driver);
	}
}


