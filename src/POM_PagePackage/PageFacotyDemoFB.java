package POM_PagePackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class PageFacotyDemoFB
{
		WebDriver driver;
		 @FindBy(id="email")
		 WebElement fbemail;
		 
		 @FindBy(id="pass")
		 WebElement passwrd;
		 
		 @FindBy(name="login")
		 WebElement fbloginbutton;
		 
		 @FindBy(xpath = "//a[@class='_8esh']")
		 WebElement createAPage;
		 
		 @FindBy(xpath="//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
		 WebElement signUp;
		 	
		public PageFacotyDemoFB(WebDriver driver)   //Constructor same name as class name and pass driver details
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void setValues(String email,String password) throws InterruptedException
		{
			fbemail.sendKeys(email);
			passwrd.sendKeys(password);		
		}
		public void login()
		{
			fbloginbutton.click();
		}
		public void createPage()
		{
		   createAPage.click();
		}
		public void titleVerify()
		{
			String actualTitle = driver.getTitle();
			String exp="Facebook";
			Assert.assertEquals(exp, actualTitle);		
		}
		public void signUpBtnClick() 
		{
			signUp.click();
		}
}

