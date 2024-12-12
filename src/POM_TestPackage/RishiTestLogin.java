package POM_TestPackage;
import org.testng.annotations.Test;
import BaseClassPackage.RishiHerbalBase;
import POM_PagePackage.RishiTestEnquiryPage;
//import POM_PagePackage.RishiElements;
import POM_PagePackage.RishiTestLoginPage;

public class RishiTestLogin extends RishiHerbalBase
{
	@Test
	public void testLogin()
	{	  
		//RishiElements lp=new RishiElements(driver);
		//RishiElements enq1=new RishiElements(driver);
		
		RishiTestLoginPage lp=new RishiTestLoginPage(driver);
		RishiTestEnquiryPage enq1=new RishiTestEnquiryPage(driver);
		  lp.setEmail("nisashinil@gmail.com");	
		  lp.setPassword("Abcd12345678#");
		  lp.clickLoginBtn();	
		  enq1.enquiryBtnClick();
		  
	}
}
