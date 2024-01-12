package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pagefactor.Loginpage;
import Pagefactor.Search_Customers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition{
	WebDriver driver;
	Loginpage lm;
	Search_Customers searchcust;
	
	@Before
	public void veryFirstExe()
	{
		System.out.println("First Excecution");
	}
	
@Given("User Launch Chrome Browser")
public void user_launch_chrome_browser() {
    driver=new ChromeDriver();
    lm=new Loginpage(driver);
    searchcust=new Search_Customers(driver);
    driver.manage().window().maximize();
}

@When("User Open URL {string}")
public void user_open_url(String url) throws InterruptedException {
    driver.get(url);
    Thread.sleep(3000);
}

@When("User enters Email as {string} and Password as {string}")
public void user_enters_email_as_and_password_as(String emailId, String pass) {
  lm.enterEmail(emailId); 
  lm.enterPassword(pass);
}

@When("Click on Login")
public void click_on_login() throws InterruptedException {
	lm.clickOnLogin();
    Thread.sleep(3000);
}

@Then("Page title should be {string}")
public void page_title_should_be(String expectedTitle) {
    String actualTitle=driver.getTitle();
    if(actualTitle.equals(expectedTitle))
    {
    	Assert.assertTrue(true);
    }
    else
    {
    	Assert.assertTrue(false);
    }
}

@When("user click on Customers Menu")
public void user_click_on_customers_menu() throws InterruptedException {
	searchcust.clickonCustomerMenu();
	Thread.sleep(3000);
}

@When("User click on Customer Menu Item")
public void user_click_on_customer_menu_item() throws InterruptedException {
	searchcust.clickonCustomersMenuItem();
	Thread.sleep(3000);
}

@Then("After Customer Menu page title should be {string}")
public void after_customer_menu_page_title_should_be(String expectedTitle) {
   String actualTitle=searchcust.getpageTitle();
   if(actualTitle.equals(expectedTitle))
   {
   	Assert.assertTrue(true);
   }
   else
   {
   	Assert.assertTrue(false);
   }
}

@When("user enter email id as {string}")
public void user_enter_email_id_as(String emailAdd) {
	searchcust.enterEmailId(emailAdd);
}
@When("user enter first name as {string}")
public void user_enter_first_name_as(String name) {
	searchcust.enterFirstName(name);
}

@When("User clicks on Search button")
public void user_clicks_on_search_button() throws InterruptedException {
	searchcust.clickonSearchbtn();
	Thread.sleep(3000);  
}

@Then("User email id should be {string}")
public void user_email_id_should_be(String expResult) {
	 String actualResult=searchcust.verifyResultByEmail();
	    if(actualResult.equals(expResult))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
}

@Then("User Name should be {string}")
public void user_name_should_be(String expResult) {
    String actualResult=searchcust.verifyResultByName();
    if(actualResult.equals(expResult))
    {
    	Assert.assertTrue(true);
    }
    else
    {
    	Assert.assertTrue(false);
    }
}

/*@When("user Click on Logout Link")
public void user_click_on_logout_link() throws InterruptedException {
	lm.clickOnLogout();
	Thread.sleep(3000);
}*/
@When("user click on Logout Link")
public void user_click_on_logout_link() throws InterruptedException {
	lm.clickOnLogout();
	Thread.sleep(3000);
}

@Then("After Logout Page title should be {string}")
public void after_logout_page_title_should_be(String expectedTitle) {
	  String actualTitle=driver.getTitle();
	    if(actualTitle.equals(expectedTitle))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
   
}

@Then("close Browser")
public void close_browser() throws InterruptedException {
	driver.close();
	Thread.sleep(3000);
}

@ After
public void lastExe() {
	driver.quit();
	System.out.println("Last Execution");
}
}


