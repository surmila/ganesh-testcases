@Jpet_Application_feature
Feature: JPET STORE

@tc01_validlogin
Scenario: login with valid details
Given : enter the username and password
When : click on login button
Then : open's the homepage
And : confirming the profile

@tc02_addingdifferentproducts
Scenario: add different products to the cart
Given : search for different products
When : Add them to the cart
Then : update the cart
And : proceed to checkout

@tc03_printtable
Scenario: Prints the details in a table
 
 Given the details of an animal in the homepage
 When the details are matched
 Then the selected animals details are printed
 And details are printed in a table



