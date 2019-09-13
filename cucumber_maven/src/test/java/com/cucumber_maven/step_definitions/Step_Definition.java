package com.cucumber_maven.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber_maven.managers.PageObjectManager;
import com.cucumber_maven.managers.WebDriverManager;
import com.cucumber_maven.pageObjects.Address;
import com.cucumber_maven.pageObjects.BackOrders;
import com.cucumber_maven.pageObjects.HomePage_SignIn;
import com.cucumber_maven.pageObjects.MyAccount;
import com.cucumber_maven.pageObjects.OrderHistory;
import com.cucumber_maven.pageObjects.OrderSummary;
import com.cucumber_maven.pageObjects.Payment;
import com.cucumber_maven.pageObjects.Personnel_Information;
import com.cucumber_maven.pageObjects.ProceedToCheckout;
import com.cucumber_maven.pageObjects.Shipping;
import com.cucumber_maven.pageObjects.SignIn;
import com.cucumber_maven.pageObjects.Summary;
import com.cucumber_maven.pageObjects.TshrtLink;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition 
{
    WebDriver driver;
	BackOrders backorders;
	OrderHistory orderhistory;
	OrderSummary ordersummary;
	Payment payment;
	Shipping shipping;
	SignIn signin;
	TshrtLink tshirtlink;
	Personnel_Information information;
	ProceedToCheckout checkout;
	Summary summary;
	Address address;
	MyAccount account;
	HomePage_SignIn homepage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
        
    @Before("@FirstTest,@SecondTest")
    public void initBrowser()
    {   			
		webDriverManager = new WebDriverManager();
		driver=webDriverManager.getDriver();
		pageObjectManager=new PageObjectManager(driver);
    }
    
    @After("@FirstTest, @SecondTest")
	public void tearDown()
    {
		driver.quit();
	}
    
	@Given("^User is on the Home Page of the AUT$")
	public void user_is_on_the_Home_Page_of_the_AUT() throws Exception 
	{
		pageObjectManager.getHomePage().HomePage();	    
	}

	@When("^User adds the selected T_Shirt to the cart$")
	public void user_adds_the_selected_T_Shirt_to_the_cart() throws Exception 
	{
		tshirtlink=pageObjectManager.getTshrtLink();
		tshirtlink.TShirtClick();
		tshirtlink.hover();
		tshirtlink.addToCart();
	}

	@When("^Completes the order by Signing In using Username and Password$")
	public void completes_the_order_by_Signing_In_using_Username_and_Password() throws Exception
	{
		checkout=pageObjectManager.getProceedToCheckout();
		summary=pageObjectManager.getSummary();
		signin=pageObjectManager.getSignIn();
		address=pageObjectManager.getAddress();
		shipping=pageObjectManager.getShipping();
		checkout.checkout();		
		summary.checkout();		
		signin.email();
		signin.password();
		signin.SignInClick();		
		address.checkout();		
		shipping.checkbox();
		shipping.checkout();
	}
	
	@When("^Selects the method of payment$")
	public void selects_the_method_of_payment() throws Exception 
	{
		payment=pageObjectManager.getPayment();
		ordersummary=pageObjectManager.getOrderSummary();
		backorders=pageObjectManager.getBackOrders();
		payment.payByWire();
		ordersummary.confirmOrder();
		backorders.backOrder();
	}
	
	@Then("^Order Reference is displayed in the order History$")
	public void order_Reference_is_displayed_in_the_order_History() throws Exception
	{
		orderhistory=pageObjectManager.getOrderHistory();
		 boolean orderRef=orderhistory.verifyOrderReference();
         Assert.assertTrue(orderRef);
         boolean verifyDatePricePayment=orderhistory.verifyDatePriceAndPaymentMethod();
         Assert.assertTrue(verifyDatePricePayment); 
	}
	
	@When("^User Sign in to the account using Username and Password$")
	public void user_Sign_in_to_the_account_using_Username_and_Password() throws Exception 
	{
		homepage=pageObjectManager.getHomePage_SignIn();
		signin=pageObjectManager.getSignIn();
		homepage.SignInClick();
		signin.email();
		signin.password();
		signin.SignIn1();
	}
	
	@Then("^User updates first name in My Account page$")
	public void user_updates_first_name_in_My_Account_page() throws Exception
	{
		account=pageObjectManager.getMyAccount();
		information=pageObjectManager.getPersonnel_Information();
		account.MyAccountClick();
		information.change_name();
		information.password();
		information.save_click();
	}
}
	
