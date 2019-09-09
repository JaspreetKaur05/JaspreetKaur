package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TshrtLink 
{
	private WebDriver driver;
	By TShirt_Link=By.linkText("T-SHIRTS");
	By hovering=By.xpath("//*[@id=\"center_column\"]/ul/li/div");
	By addToCart=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
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
	
	public ProccedToCheckout01 addToCart()
	{
		driver.findElement(addToCart).click();
		return new ProccedToCheckout01(driver);
	}
	
}
