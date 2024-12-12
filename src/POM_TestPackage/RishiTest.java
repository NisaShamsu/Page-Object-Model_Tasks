package POM_TestPackage;

//import org.testng.Assert;
import org.testng.annotations.Test;
import BaseClassPackage.RishiHerbalBase;
import POM_PagePackage.RishiLogin;

public class RishiTest extends RishiHerbalBase
{
	@Test
	  public void testRishi()
	  {
			RishiLogin ob=new RishiLogin(driver);
			ob.healthClick();
			ob.sortDropClick();
			ob.sortDropdownSelect();
			ob.productClick();
			ob.enquiryClick();
			ob.sendEnquiry();
			ob.enquiryBtnClick();
			
	  }
	
}
