package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment 
{
	private WebDriver driver;
	By payByWire=By.className("bankwire");
	public Payment(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public OrderSummary payByWire()
	{
		driver.findElement(payByWire).click();
		return new OrderSummary(driver);
	}
}
