package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_SignIn 
{
	private WebDriver driver;
	By Signin=By.cssSelector("a[class='login']");
	public HomePage_SignIn(WebDriver driver)
	{
		this.driver=driver;
	}
	public SignIn SignInClick()
	{
		driver.findElement(Signin).click();
		return new SignIn(driver);
	}
}
