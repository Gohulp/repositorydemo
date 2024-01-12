Feature: Search_Customers

Background: All common steps
       Given User Launch Chrome Browser
       When User Open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
       And User enters Email as "admin@yourstore.com" and Password as "admin"
       And Click on Login
       Then Page title should be "Dashboard / nopCommerce administration"
       When user click on Customers Menu
       And User click on Customer Menu Item
       Then After Customer Menu page title should be "Customers / nopCommerce administration"
 @Smoke      
Scenario: Search Customer by using Email Id      
       When user enter email id as "james_pan@nopCommerce.com"
       And User clicks on Search button
       Then User Name should be "James Pan"
       When user click on Logout Link
       Then After Logout Page title should be "Your store. Login"
       And close Browser
       
  @Sanity     
Scenario: Search Customer by using Name
       When user enter first name as "Virat"
       And User clicks on Search button
       Then User email id should be "kiyjcycyhjc676008@gmail.com"
       When user click on Logout Link
       Then After Logout Page title should be "Your store. Login"
       And close Browser     
       