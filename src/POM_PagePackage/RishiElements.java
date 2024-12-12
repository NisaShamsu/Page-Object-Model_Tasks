package POM_PagePackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RishiElements 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='ls-nav-link'][normalize-space()='HEALTH']")
	WebElement health;
	
	@FindBy(xpath="//*[@id=\"input-sort\"]")
	WebElement sort;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement enquiry;	
	
	@FindBy(xpath="//*[@id=\"Enquiry\"]")
	WebElement sendEnquiry;
	
	@FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement enquirySendBtn;
	
	@FindBy(xpath="//div[@class='form-group is-floating-label act_anim']//input[@name='email']")
	WebElement txt_email;
	
	//@FindBy(xpath="//div[@class='form-group is-floating-label act_anim']//input[@name='password']")
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement btn_login;
	
	public RishiElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void healthClick()
	{
		health.click();
	}
	
	public void sortDropClick()
	{
		sort.click();	
	}
	public void sortDropdownSelect()
	{
		Select sortobj=new Select(sort);
		sortobj.selectByValue("alphabet-asc");
	}
	public void productClick()
	{
		product.click();
	}
	public void enquiryClick() 
	{
		enquiry.click();
	}
	public void sendEnquiry()
	{
		sendEnquiry.sendKeys("Good Product");
	}
	public void enquiryBtnClick()
	{
		enquirySendBtn.click();
	}
	
	public void setEmail(String user)
	{
		txt_email.sendKeys(user);
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
