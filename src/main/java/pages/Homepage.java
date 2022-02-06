package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Homepage extends Pagebase {

	public Homepage(WebDriver driver)
	{
		super(driver);}
	@FindBy(linkText = "Log In")
	WebElement LoginLink ;
	
	
	
		
		public void Openloginpage() {
		}
		{
			LoginLink.click();
			
		}
		
	

}
