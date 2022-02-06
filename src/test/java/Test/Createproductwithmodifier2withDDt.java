package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.PageLogin;
import pages.Productpage;




public class Createproductwithmodifier2withDDt extends Userlogintest {
	Productpage Productpageobject;
	@DataProvider(name="testData")
	public static Object[][] productdata()
	{
		return new Object [][]  {
				{"chicken burger","40"},
				{"sausage","35"}};
				
			
		
	}
	
	@BeforeTest
	public void userloginsuccessufully() throws InterruptedException

	{loginobject=new PageLogin(driver);
	loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");
	}
	
	@Test( dataProvider="testData")
	public void usercreateproductwithmodifier(String productname,String price) throws InterruptedException
	
	{
		Productpageobject=new Productpage(driver);
				Productpageobject.Createproductwithmodifier(productname, price);
				//JavascriptExecutor js=(JavascriptExecutor) driver ;
		        //js.executeScript("scrollBy(0,200)");
		      //  Productpageobject=new Productpage(driver);
		      //  Productpageobject.admodfi();
		        
		        
		        
		
	}

}
