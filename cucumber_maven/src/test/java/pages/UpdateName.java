package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateName 
{
	private WebDriver driver;
	String ori_name;
	By name=By.id("firstname");
	By save=By.id("submitAddress");
	public UpdateName(WebDriver driver)
	{
		this.driver=driver;
	}
	public void changeName()
	{
		ori_name=driver.findElement(name).getText();
		driver.findElement(name).sendKeys("Jas");
	}
	
	public void clickSave()
	{
		driver.findElement(save).click();
	}
//	 public boolean checkName()
//	 {
//		 String new_name=driver.findElement(name).getText();
//		 if(!new_name.equals(ori_name))
//		 {
//			 return true;
//		 }
//		 else
//			 
//		 {
//			 return false;
//		 }
//	 }
	
}
