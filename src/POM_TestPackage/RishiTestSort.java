package POM_TestPackage;
import org.testng.annotations.Test;
import BaseClassPackage.RishiHerbalBase;
import POM_PagePackage.RishiTestSortPage;
//import POM_PagePackage.RishiElements;
public class RishiTestSort extends RishiHerbalBase
{
	@Test
	  public void testSort()
	  {
			//RishiElements so=new RishiElements(driver);
		
		RishiTestSortPage  so=new RishiTestSortPage(driver); 
			so.healthClick();
			so.sortDropClick();
			so.sortDropdownSelect();
			so.productClick();
	  }		
}
