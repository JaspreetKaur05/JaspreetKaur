package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn 
{
	private WebDriver driver;
	
	public SignIn(WebDriver driver)
	{
		this.driver=driver;
	}
	By email=By.id("email");
	By password=By.id("passwd");
	By signIn=By.id("SubmitLogin");
	public void email()
	{
		driver.findElement(email).sendKeys("jaspreet.kaur123@gmail.com");
	}
	public void password()
	{
		driver.findElement(password).sendKeys("Ropar@1995");
	}
	
	public ProceedToCheckout03 SignIn()
	{
		driver.findElement(signIn).click();
    	return new ProceedToCheckout03(driver);
	}
	
	public UpdateClick SignIn1()
	{
		driver.findElement(signIn).click();
		return new UpdateClick(driver);
	}
}
