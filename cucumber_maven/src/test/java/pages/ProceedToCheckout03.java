package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckout03 {
	private WebDriver driver;
	By checkout=By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
	public ProceedToCheckout03(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Shipping checkout()
	{
		driver.findElement(checkout).click();
		return new Shipping(driver);
	}
}
