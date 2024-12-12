package POM_TestPackage;

import org.testng.annotations.Test;
import BaseClassPackage.FbBase;
import POM_PagePackage.PageFacotyDemoFB;
public class TestPageFacotryFB extends FbBase       //extends from base class in base class package and import that package to this class
{	
	
		@Test
		public void testLogin() throws InterruptedException 
		{	
			PageFacotyDemoFB ob=new PageFacotyDemoFB(driver);
			ob.setValues("nisashinil@gmail.com", "abc123");
			ob.login();			
		}
	
}
