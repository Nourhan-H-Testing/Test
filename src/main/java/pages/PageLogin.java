package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageLogin extends Pagebase
{

	public PageLogin(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css  = "#business_ref")
	WebElement txtaccountnumber;

	//@FindBy(xpath="//*[@id=\\\"wrapper\\\"]/div/div/div[2]/form/div[2]/input")
	@FindBy(xpath="//*[@id=\"wrapper\"]/div/div/div[2]/form/div[2]/input")
	
	WebElement txtemailaddress;
	@FindBy(name="password")
	WebElement txtpassword;
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/form[1]/button[1]")
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	WebElement btnlogin;
	
	
	public void userlogin(String accountnumber,String emailaddress,String password) throws InterruptedException
	{
		Thread.sleep(3000);
	
	txtaccountnumber.sendKeys(accountnumber);
	Thread.sleep(3000);
	txtemailaddress.sendKeys(emailaddress);
	txtpassword.sendKeys(password);
	btnlogin.click();
	
}}
	
