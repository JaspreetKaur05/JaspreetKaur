package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistory 
{
	By order=By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a");
	private WebDriver driver;
	public OrderHistory(WebDriver driver)
	{
		this.driver=driver;
	}
	 public boolean checkOrderPlaced()
	 {
		if(driver.findElement(order).isDisplayed())
		{
			return true; 
		}
		else
		{
			return false;
		}
	 }
}
