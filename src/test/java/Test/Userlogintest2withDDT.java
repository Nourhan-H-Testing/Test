package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.PageLogin;

public class Userlogintest2withDDT extends Testbase {
	


	Homepage homeobject;
	
	PageLogin loginobject;
	@DataProvider (name="testData")
	public static Object[][] userData()
	{
		return new Object [][]{
		{"179306","n.hagag@foodics.com","Foodics_N1"},{"992628","n.hagag@foodics.com","Foodics_N1"}};
		}



	@Test (priority=1,alwaysRun=true,dataProvider = "testData")
	public void usercanlogin(String accountnumber,String emailaddress,String password) throws InterruptedException
	
	{ 
		//homeobject=new Homepage(driver);
		//homeobject.Openloginpage();
		loginobject=new PageLogin(driver);
		loginobject.userlogin("accountnumber", "emailaddress", "password");
		
		
	}
	

}
