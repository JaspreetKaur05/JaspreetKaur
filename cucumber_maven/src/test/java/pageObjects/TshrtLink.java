package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber_maven.pageObjects.ProceedToCheckout;

public class TshrtLink 
{
	private WebDriver driver;
	By TShirt_Link=By.linkText("T-SHIRTS");
	By hovering=By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
	By addToCart=By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span");
	public TshrtLink(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void TShirtClick()
	{
		driver.findElement(TShirt_Link).click();
	}
	
	public void hover()
	{
		Actions action=new Actions(driver);
		WebElement hover = driver.findElement(hovering);
		action.moveToElement(hover).perform();
	}
	
	public ProceedToCheckout addToCart() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(addToCart).click();
		return new ProceedToCheckout(driver);
	}
	
}
