package POM_PagePackage;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginOHRM 
{
	//1..Constructor it will initiate driver   same name as class name       LoginPageOrange                         //Page object class includes mainly 3 parts	 
	WebDriver driver;

	public PageFactoryLoginOHRM(WebDriver driver)   //This webdriver will be get from test later  this driver will assign to the local driver in class.so we use this keyword.
	{
		this.driver=driver;           //here driver is local variable and for the class its instance variable..so in order to differenciate we use this keyword to assign driver to construcot
		PageFactory.initElements(driver, this); 
		/*
		 * extra for page factory .
		 * PageFactory is a predefined class in selenium web driver.
		 * Driver is commonly used to find the elements in part 2 locators. and 3..Action methods.
		 * so now we are trying to access these elements without using driver.so thats y we use page factory.
		 * PageFactory is a predefined class in selenium web driver. 
		 * An initElement method is called. it will make sure this particular driver is applicable for all kinds of elements.internally findByElements
		 * initElement method will initiate all the elements using the driver which we passed.
		 */
	}
	
	//2..Locators will create a repository of all web elements
	/*
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[@type='submit']");*/
	
	@FindBy(xpath = "//input[@placeholder='Username']") 
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")  //FindBy will capture the locator and identifying the element in single findBy
	WebElement txt_password;                             //but without page factory normal approach first we need to locate the element and 
	                                                     //need another method to identify the element by driver.findelement method
	
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement btn_login;                        
	
	@FindBy(tagName="a")                                  //to capture a group of elements for eg all the links in that particular page we use tag name 
	List<WebElement> links;
	
	                                                                    //Another way to write  how is a variable name and How is a class
	//@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	//WebElement txt_username;
	
	//3..Action methods By using locators actions methods will be performed
	
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	public void setPassword(String pwd)
	{
         txt_password.sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		btn_login.click();
	}

}
