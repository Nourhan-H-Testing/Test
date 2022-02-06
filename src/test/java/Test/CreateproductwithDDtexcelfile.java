package Test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Excelreader;
import pages.PageLogin;
import pages.Productpage;

public class CreateproductwithDDtexcelfile extends Userlogintest {
	Productpage Productpageobject;
	@DataProvider
	public Object [][] Productcreationdata() throws IOException
	{
		//get data from Excelreader class
		Excelreader ER=new Excelreader();
		return ER.getExceldata();
	}
			
	@BeforeTest
	public void userloginsuccessufully() throws InterruptedException

	{loginobject=new PageLogin(driver);
	loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");
	}
	
	@Test(dataProvider="ExcelData")
	
	public void usercreateproductwithmodifier(String Productname,String Price) throws InterruptedException
	
	{
		Productpageobject=new Productpage(driver);
				Productpageobject.Createproductwithmodifier(Productname, Price);
				//JavascriptExecutor js=(JavascriptExecutor) driver ;
		       // js.executeScript("scrollBy(0,200)");
		       // Productpageobject=new Productpage(driver);
		       // Productpageobject.admodfi();
		
	}

}
