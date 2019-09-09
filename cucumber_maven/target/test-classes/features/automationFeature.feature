Feature: Check the basic working of AUT
  
 Background:
  Given: Open the required URL
 
 @FirstTest
  Scenario: Order T-shirt(and verify in order History)
    Given User is on the Home Page of the AUT   
    When User Selects the T-shirt
    And Enters the required details
    Then The order is displayed in the order History
    
 @SecondTest
  Scenario: Update Personal Information (First Name) in My Account 
    Given User is on the Home Page of the AUT
    When User selects the T-shirt 
    And confirms the address
    Then User updates the first name

