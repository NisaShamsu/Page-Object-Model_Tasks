package POM_TestPackage;
import org.testng.annotations.Test;
import BaseClassPackage.RishiHerbalBase;
import POM_PagePackage.RishiTestEnquiryPage;
//import POM_PagePackage.RishiElements;

public class RishiTestEnquiry extends RishiHerbalBase
{
	@Test
	  public void testEnquiry()
	  {
		//RishiElements enq=new RishiElements(driver);	
		RishiTestEnquiryPage enq=new RishiTestEnquiryPage(driver);
			enq.enquiryClick();
			enq.sendEnquiry();
			enq.enquiryBtnClick();
	  }
	
}
