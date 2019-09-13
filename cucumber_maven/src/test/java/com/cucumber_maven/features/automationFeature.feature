Feature: Check the basic working of AUT
  
 Background:
  Given: Open the required URL
 
 @FirstTest
  Scenario: Order T-shirt(and verify in order History)
    Given User is on the Home Page of the AUT   
    When User adds the selected T_Shirt to the cart 
    And Completes the order by Signing In using Username and Password
    And Selects the method of payment
    Then Order Reference is displayed in the order History
    
 @SecondTest
  Scenario: Update First Name in My Account 
    Given User is on the Home Page of the AUT
    When User Sign in to the account using Username and Password 
    Then User updates first name in My Account page 

