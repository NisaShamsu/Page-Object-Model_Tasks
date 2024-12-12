package POM_PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RishiTestEnquiryPage
{
	WebDriver driver;
	public RishiTestEnquiryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement enquiry;	
	
	@FindBy(xpath="//*[@id=\"Enquiry\"]")
	WebElement sendEnquiry;
	
	@FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement enquirySendBtn;
	
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
	
}
