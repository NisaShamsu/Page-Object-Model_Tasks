package POM_TestPackage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import POM_PagePackage.LoginPageOrange;
import POM_PagePackage.PageFactoryLoginOHRM;

public class LoginTestOrange
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testLogin()
	{
		  //LoginPageOrange  lp=new LoginPageOrange(driver);
		  PageFactoryLoginOHRM lp= new PageFactoryLoginOHRM(driver);
		  lp.setUserName("Admin");	
		  lp.setPassword("admin123");
		  lp.clickLoginBtn();
		  
		  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
}
