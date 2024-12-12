package POM_PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RishiTestLoginPage
{
	WebDriver driver;
	public RishiTestLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='form-group is-floating-label act_anim']//input[@name='email']")
	WebElement txt_email;
	
	//@FindBy(xpath="//div[@class='form-group is-floating-label act_anim']//input[@name='password']")
	@FindBy(xpath="//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement btn_login;
	
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
