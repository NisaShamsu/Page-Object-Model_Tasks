package POM_PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOrange 
{
	//1..Constructor it will initiate driver   same name as class name       LoginPageOrange                         //Page object class includes mainly 3 parts
	 
	WebDriver driver;
	
	public LoginPageOrange(WebDriver driver)   //This webdriver will be get from test later  this driver will assign to the local driver in class.so we use this keyword.
	{
		this.driver=driver;           //here driver is local variable and for the class its instance varibale..so inorder to differenciate we use this keyword to assign driver to construcot
	}
	
	//2..Locators will create a repository of all web elements
	
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_login_loc=By.xpath("//button[@type='submit']");
	
	//3..Action methods By using locators actions methods will be performed
	
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		driver.findElement(btn_login_loc).click();
	}

}
