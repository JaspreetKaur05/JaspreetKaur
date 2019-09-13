package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Address {
	private WebDriver driver;
	By checkout=By.cssSelector("button[name=processAddress]");
	public Address(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Shipping checkout()
	{
		driver.findElement(checkout).click();
		return new Shipping(driver);
	}
}
