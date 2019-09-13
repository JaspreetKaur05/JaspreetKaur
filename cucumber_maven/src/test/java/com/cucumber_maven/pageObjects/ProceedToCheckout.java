package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckout 
{
	private WebDriver driver;
	By checkOut=By.cssSelector("a[title='Proceed to checkout']");
	public ProceedToCheckout(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Summary checkout()
	{
		driver.findElement(checkOut).click();
		return new Summary(driver);
	}
}
