package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackOrders 
{
	private WebDriver driver;
	By backOrder=By.xpath("//*[@id=\"center_column\"]/p/a");
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
