package com.cucumber_maven.managers;

import org.openqa.selenium.WebDriver;

import com.cucumber_maven.pageObjects.Address;
import com.cucumber_maven.pageObjects.BackOrders;
import com.cucumber_maven.pageObjects.HomePage;
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


public class PageObjectManager
{
	private WebDriver driver;
	private BackOrders backorders;
	private OrderHistory orderhistory;
	private OrderSummary ordersummary;
	private Payment payment;
	private Shipping shipping;
	private SignIn signin;
	private TshrtLink tshirtlink;
	private Personnel_Information information;
	private ProceedToCheckout checkout;
	private Summary summary;
	private Address address;
	private MyAccount account;
	private HomePage_SignIn homepage;
	private HomePage home;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public BackOrders getBackOrders()
	{
		 return (backorders == null) ? backorders = new BackOrders(driver) : backorders;
	}
	
	public OrderHistory getOrderHistory()
	{
		 return (orderhistory == null) ? orderhistory = new OrderHistory(driver) : orderhistory;
	}
	
	public OrderSummary getOrderSummary()
	{
		 return (ordersummary == null) ? ordersummary = new OrderSummary(driver) : ordersummary;
	}
	
	public Payment getPayment()
	{
		 return (payment == null) ? payment = new Payment(driver) : payment;
	}
	
	public Shipping getShipping()
	{
		return (shipping == null) ? shipping = new Shipping(driver) : shipping;
	}
	
	public SignIn getSignIn()
	{
		return (signin == null) ? signin = new SignIn(driver) : signin;
	}
	
	public TshrtLink getTshrtLink()
	{
		return (tshirtlink == null) ? tshirtlink = new TshrtLink(driver) : tshirtlink;
	}
	
	public Personnel_Information getPersonnel_Information()
	{
		return (information == null) ? information = new Personnel_Information(driver) : information;
	}
	
	public ProceedToCheckout getProceedToCheckout()
	{
		return (checkout == null) ? checkout = new ProceedToCheckout(driver) : checkout;
	}
	
	public Summary getSummary()
	{
		return (summary	== null) ? summary = new Summary(driver) : summary;
	}
	
	public Address getAddress()
	{
		return (address	== null) ? address = new Address(driver) : address;
	}
	
	public MyAccount getMyAccount()
	{
		return (account	== null) ? account = new MyAccount(driver) : account;
	}
	
	public HomePage_SignIn getHomePage_SignIn()
	{
		return (homepage == null) ? homepage = new HomePage_SignIn(driver) : homepage;
	}
	
	public HomePage getHomePage()
	{
		return (home == null) ? home = new HomePage(driver) : home;
	}
}
