package step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BackOrders;
import pages.OrderHistory;
import pages.OrderSummary;
import pages.Payment;
import pages.ProccedToCheckout01;
import pages.ProccedToCheckout02;
import pages.ProceedToCheckout03;
import pages.Shipping;
import pages.SignIn;
import pages.TshrtLink;
import pages.UpdateClick;
import pages.UpdateName;

public class Tshirt 
{
    WebDriver driver;
    TshrtLink tshirt;
    ProccedToCheckout01 checkout01;
    ProccedToCheckout02 checkout02;
    SignIn signin;
    
    UpdateName name;
    
    @Before("@FirstTest,@SecondTest")
    public void initBrowser()
    {
    	String basePath = "src//test//java//drivers//";			
		System.setProperty("webdriver.chrome.driver", basePath + "chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
    }
    
    @After("@FirstTest, @SecondTest")
	public void tearDown()
    {
		driver.quit();
	}
    
	@Given("^User is on the Home Page of the AUT$")
	public void user_is_on_the_Home_Page_of_the_AUT() throws Exception 
	{
		driver.get("http://automationpractice.com/index.php");	    
	}

	@When("^User Selects the T-shirt$")
	public void user_Selects_the_T_shirt() throws Exception
	{
		
		tshirt=new TshrtLink(driver);
		tshirt.TShirtClick();	
	}

	@When("^Enters the required details$")
	public void enters_the_required_details() throws Exception 
	{
		tshirt=new TshrtLink(driver);
		tshirt.hover();
		tshirt.addToCart();	    
		new ProccedToCheckout01(driver).checkout();	
		new ProccedToCheckout02(driver).checkout();
		signin=new SignIn(driver);
		signin.email();
		signin.password();
		signin.SignIn();
		new ProceedToCheckout03(driver).checkout();
		new Shipping(driver).checkbox();
		new Shipping(driver).checkout();
		new Payment(driver).payByWire();
		new OrderSummary(driver).confirmOrder();
		new BackOrders(driver).backOrder();    
	}

	@Then("^The order is displayed in the order History$")
	public void the_order_is_displayed_in_the_order_History() throws Exception 
	{
	   Assert.assertTrue(new OrderHistory(driver).checkOrderPlaced()); 
	}
	
	@When("^User selects the T-shirt$")
	public void user_selects_the_T_shirt() throws Exception 
	{
		new TshrtLink(driver).TShirtClick();;	    
	}

	@When("^confirms the address$")
	public void confirms_the_address() throws Exception 
	{	
		tshirt=new TshrtLink(driver);
		tshirt.hover();
		tshirt.addToCart();	    
		new ProccedToCheckout01(driver).checkout();	
		new ProccedToCheckout02(driver).checkout();
		signin=new SignIn(driver);
		signin.email();
		signin.password();
		signin.SignIn1();
	}

	@Then("^User updates the first name$")
	public void user_updates_the_first_name() throws Exception 
	{
	    new UpdateClick(driver).update();
	    name=new UpdateName(driver);
	    name.changeName();
	    name.clickSave();
	   // Assert.assertTrue(name.checkName());
	}
}
