package Pagefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Customers {
	
	WebDriver driver;
	public  Search_Customers(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//nav[@class='mt-2']/child::ul[1]/child::li[4]//child::a[1]") WebElement customerMenu;
	@FindBy (xpath="//nav[@class='mt-2']/child::ul[1]/child::li[4]//child::a[1]/following::ul[1]/child::li[1]/child::a[1]") WebElement customerMenuItems;
    @FindBy (id="SearchEmail") WebElement emailid;
    @FindBy (id="SearchFirstName") WebElement fName;
    @FindBy (id="search-customers") WebElement searchbtn;
    @FindBy (xpath="//table[@id='customers-grid']/child::tbody/child::tr[1]/child::td[3]") WebElement searchResultName;
    @FindBy (xpath="//table[@id='customers-grid']/child::tbody/child::tr[1]/child::td[2]") WebElement searchResultEmail;
    
    public void clickonCustomerMenu()
    {
    	customerMenu.click();
    	}
    public void clickonCustomersMenuItem()
    {
    	customerMenuItems.click();
    }
    public String getpageTitle() 
    {
    	String title=driver.getTitle();
    	return title;
    }
    public void enterEmailId(String em)
    {
    	emailid.sendKeys(em);
    }
    public void enterFirstName(String fn)
    {
    	fName.sendKeys(fn);
    }
    public void clickonSearchbtn()
    {
    	searchbtn.click();
    }
    public String verifyResultByName() 
    {
    	String name=searchResultName.getText();
    	return name;
    }
    public String verifyResultByEmail() 
    {
    	String name=searchResultEmail.getText();
    	return name;
    }
 
}

