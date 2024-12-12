package POM_TestPackage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import POM_PagePackage.FbLogin;

public class FbLoginTest
{
	FbLogin ob=new FbLogin(driver); // create object of class name
	public static WebDriver driver;	
	
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void testLogin()
	{	
	    FbLogin ob=new FbLogin(driver);
		ob.setValues("nisashinil@gmail.com", "abc123");
		ob.login();	
	}
	/*
	@Test
	public void createApage()
	{
		FbLogin ob=new FbLogin(driver); // create object of class name
		ob.createPage();
		ob.titleVerify();	
	}*/

}
