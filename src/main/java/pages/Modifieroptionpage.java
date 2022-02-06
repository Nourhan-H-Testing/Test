package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Modifieroptionpage extends PageLogin {

	public Modifieroptionpage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]")
	WebElement btnmenu;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[6]/a[1]")
	WebElement btnmodofieroption;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement btncreoption;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement txtmodifieroptionname;
	
	@FindBy(xpath="//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]")
	WebElement btnmod;
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")

	WebElement btndressing;
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[2]/input[1]")
	WebElement txtprice;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	WebElement btnspace;
	
	@FindBy( xpath ="//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")
	WebElement btnsave;

	public void Createmodifieroption(String Modifieropname,String price) throws InterruptedException
	{
		btnmenu.click();
		btnmodofieroption.click();
		btncreoption.click();
		txtmodifieroptionname.sendKeys(Modifieropname);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);

		btnmod.click();
		Thread.sleep(5000);

		btndressing.click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		btnspace.click();
		Thread.sleep(3000);

		txtprice.sendKeys(price);
		btnsave.click();


	}




}
