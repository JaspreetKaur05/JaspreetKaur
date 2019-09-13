package com.cucumber_maven.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Personnel_Information 
{
	WebDriver driver;
	By firstname=By.id("firstname");
	By password=By.id("old_passwd");
	By save=By.cssSelector("button[name='submitIdentity']");
	public Personnel_Information(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void change_name()
	{
		driver.findElement(firstname).clear();
		driver.findElement(firstname).sendKeys("Preet");	
	}
	public void password()
	{
		driver.findElement(password).sendKeys("Ropar@1995");
	}
	
	public void save_click()
	{
		driver.findElement(save).click();
	}
}
