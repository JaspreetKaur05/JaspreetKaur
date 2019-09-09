package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateClick 
{
	private WebDriver driver;
	By update =By.xpath("//*[@id=\"address_invoice\"]/li[8]/a/span");
	public UpdateClick(WebDriver driver)
	{
		this.driver=driver;
	}
	public UpdateName update()
	{
		driver.findElement(update).click();
		return new UpdateName(driver);
	}
		
	
	


}
