package POM_PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RishiTestSortPage 
{
	WebDriver driver;
	public RishiTestSortPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='ls-nav-link'][normalize-space()='HEALTH']")
	WebElement health;
	
	@FindBy(xpath="//*[@id=\"input-sort\"]")
	WebElement sort;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")
	WebElement product;
	
	public void healthClick()
	{
		health.click();
	}
	
	public void sortDropClick()
	{
		sort.click();	
	}
	public void sortDropdownSelect()
	{
		Select sortobj=new Select(sort);
		sortobj.selectByValue("alphabet-asc");
	}
	public void productClick()
	{
		product.click();
	}

}
