package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Summary 
{
	private WebDriver driver;
	By checkout=By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
	
	public Summary(WebDriver driver)
	{
		this.driver=driver;
	}
	

	
	public SignIn checkout()
	{
		driver.findElement(checkout).click();
		return new SignIn(driver);
	}
}
