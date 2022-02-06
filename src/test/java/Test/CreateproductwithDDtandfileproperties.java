package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.Loadproperties;
import pages.PageLogin;
import pages.Productpage;

public class CreateproductwithDDtandfileproperties extends Userlogintest {
	Productpage Productpageobject;
	String Productname=Loadproperties.productdata.getProperty("Productname");
	String Price=Loadproperties.productdata.getProperty("Price");
	
	
	@BeforeTest
	public void userloginsuccessufully() throws InterruptedException

	{loginobject=new PageLogin(driver);
	loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");}
	
	@Test
	public void usercreateproductwithmodifier() throws InterruptedException
	
	{
		Productpageobject=new Productpage(driver);
				Productpageobject.Createproductwithmodifier( Productname, Price);
				
			//	JavascriptExecutor js=(JavascriptExecutor) driver ;
		    //    js.executeScript("scrollBy(0,200)");
		       // Productpageobject=new Productpage(driver);
		       // Productpageobject.admodfi();
		
	}

}
