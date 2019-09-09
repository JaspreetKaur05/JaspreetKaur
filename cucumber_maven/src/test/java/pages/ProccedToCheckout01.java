package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProccedToCheckout01 
{
	private WebDriver driver;
	By checkOut=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	public ProccedToCheckout01(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public ProccedToCheckout02 checkout()
	{
		driver.findElement(checkOut).click();
		return new ProccedToCheckout02(driver);
	}
}
