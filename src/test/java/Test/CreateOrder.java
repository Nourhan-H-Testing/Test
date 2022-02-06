package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Orderpage;
import pages.PageLogin;

public class CreateOrder extends Userlogintest{
Orderpage Orderpageobject;
	
	PageLogin loginobject;
	@BeforeTest
	public void usercanlogin() throws Throwable
	{loginobject=new PageLogin(driver);
	loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");
	}
		
	
	@Test
	public void usercreateorder() throws InterruptedException
	{
		
		Orderpageobject= new Orderpage(driver);
		Orderpageobject.createorder();
		JavascriptExecutor js=(JavascriptExecutor) driver ;
        js.executeScript("scrollBy(0,200)");
        Orderpageobject=new Orderpage(driver);
        Orderpageobject.addpayement();
		
		}
	
	}
