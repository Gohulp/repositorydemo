package Pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="Email") WebElement email;
	@FindBy (id="Password") WebElement password;
	@FindBy (xpath="//button[@type='submit']") WebElement login;
	@FindBy (xpath ="//ul[@class='navbar-nav ml-auto pl-2']/child::li[3]/child::a[1]") WebElement logout;
	
	public void enterEmail(String en)
	{
		email.clear();
		email.sendKeys(en);
	}
	public void enterPassword(String pw)
	{
		password.clear();
		password.sendKeys(pw);
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}
	

}
