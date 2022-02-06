package Test;

import org.testng.annotations.Test;

import pages.Modifierpage;
import pages.PageLogin;

public class CreateModifier extends Userlogintest  {
	
	
	
	Modifierpage Modifierobject;
	@Test
	public void usercreatemodifier() throws InterruptedException
	
	
	
	{loginobject=new PageLogin(driver);
	loginobject.userlogin("179306", "n.hagag@foodics.com", "Foodics_N1");
		Modifierobject=new Modifierpage(driver);
	Modifierobject.Createmodifier("Spicy");
	
		
	}
}
