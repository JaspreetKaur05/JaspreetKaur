package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackOrders 
{
	private WebDriver driver;
	By backOrder=By.cssSelector("a[title='Back to orders']");
	public BackOrders(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public OrderHistory backOrder()
	{
		driver.findElement(backOrder).click();
		return new OrderHistory(driver);
	}
}
