package POM_PagePackage;

import org.testng.annotations.Test;
import BaseClassPackage.FbBase;

public class CreatePage extends FbBase
{
	@Test
	public void createApage()
	{
		PageFacotyDemoFB ob=new PageFacotyDemoFB(driver); // create object of class name
		ob.createPage();
		ob.titleVerify();	
		ob.signUpBtnClick();
	}

}
