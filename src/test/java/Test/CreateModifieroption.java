package Test;

import org.testng.annotations.Test;

import pages.Modifieroptionpage;
import pages.PageLogin;

public class CreateModifieroption extends Userlogintest {
	Modifieroptionpage modifieroptionobject;
	@Test
	
	public void usercreatemodifieroption() throws InterruptedException
	{
		{loginobject=new PageLogin(driver);
		loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");
		modifieroptionobject=new Modifieroptionpage(driver);
		modifieroptionobject.Createmodifieroption("Mayonise","12" );
		//modifieroptionobject.Createmodifieroption("Mayonise", "2");
	}

}}
