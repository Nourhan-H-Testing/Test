package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PageLogin;
import pages.Productpage;

public class Createproductwithmodifier extends Userlogintest {
	Productpage Productpageobject;
	@BeforeTest
	public void userloginsuccessufully() throws InterruptedException

	{loginobject=new PageLogin(driver);
	loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");
	}
	
	@Test
	public void usercreateproductwithmodifier() throws InterruptedException
	
	{
		Productpageobject=new Productpage(driver);
				Productpageobject.Createproductwithmodifier(" fried Chicken", "40");
				JavascriptExecutor js=(JavascriptExecutor) driver ;
		        js.executeScript("scrollBy(0,200)");
		       // Productpageobject=new Productpage(driver);
		       // Productpageobject.admodfi();
		
	}

}
