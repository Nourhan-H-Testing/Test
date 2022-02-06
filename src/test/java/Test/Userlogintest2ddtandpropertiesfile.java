package Test;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.PageLogin;

public class Userlogintest2ddtandpropertiesfile extends Testbase {
	
	Homepage homeobject;
	
	PageLogin loginobject;
	
	
	@Test 
	public void usercanlogin() throws InterruptedException
	
	{ 
		//homeobject=new Homepage(driver);
		//homeobject.Openloginpage();
		loginobject=new PageLogin(driver);
		loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");
		
		
	}
	

}
