package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Modifierpage extends PageLogin
{

	public Modifierpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")
	WebElement btnmenu;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[5]/a[1]")
	WebElement btnmodifier;
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement btncreatemodifier;
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement txtmodifiername;
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]/span[1]")
	WebElement btnsave;


	
	public void Createmodifier(String modifiername)
	{
		btnmenu.click();
		btnmodifier.click();
		btncreatemodifier.click();
		txtmodifiername.sendKeys(modifiername);
		btnsave.click();
	}}
	
		
		
	
	


