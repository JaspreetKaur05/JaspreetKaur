package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummary 
{
	private WebDriver driver;
	By confirmOrder=By.xpath("//*[@id=\"cart_navigation\"]/button/span");
	public OrderSummary(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public BackOrders confirmOrder()
	{
		driver.findElement(confirmOrder).click();
		return new BackOrders(driver);
	}
}
