package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shipping 
{
	private WebDriver driver;
	By checkbox=By.id("cgv");
	By checkout=By.xpath("//*[@id=\"form\"]/p/button/span");
	public Shipping(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void checkbox()
	{
		driver.findElement(checkbox).click();
	}
	public Payment checkout()
	{
		driver.findElement(checkout).click();
		return new Payment(driver);
	}
}
