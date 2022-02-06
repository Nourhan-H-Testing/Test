package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orderpage extends Pagebase {

	public Orderpage(WebDriver driver) {
		
		super(driver);
	}
		@FindBy(partialLinkText = "Orde")
		WebElement Orderbtn;
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")
		WebElement neworderbtn;
		
		@FindBy(xpath ="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
		WebElement branchbtn;
		
		@FindBy (xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]")
		WebElement branch2btn;
		
		@FindBy (xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]/span[1]")
		WebElement btnnext;
		
		@FindBy (xpath="//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
		WebElement catbtn;
		
		@FindBy (xpath="//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]")
		WebElement prodbtn;
		
		@FindBy (xpath="//button[contains(text(),'+')]")
		WebElement plusbtn;
		
		@FindBy(xpath="//span[contains(text(),'Add')]")
		WebElement Addbtn;
		
		@FindBy(xpath="//body/div[@id='wrapper']/main[@id='main']/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")
		WebElement btntotal;
		
		@FindBy(xpath="//div[contains(text(),'take')]")
		WebElement btntake;
		
		@FindBy(xpath="//body/div[@id='wrapper']/main[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]")
		WebElement btn61;
		
		@FindBy(xpath="//span[contains(text(),'Pay')]")
		WebElement btnpay;
		
		public void createorder() throws InterruptedException
		{
			Orderbtn.click();
			Thread.sleep(3000);
			neworderbtn.click();
			Thread.sleep(3000);
			branchbtn.click();
			branch2btn.click();
			Thread.sleep(3000);
			btnnext.click();
			Thread.sleep(3000);
			catbtn.click();
			Thread.sleep(3000);
			prodbtn.click();
			Thread.sleep(3000);
			plusbtn.click();
			Thread.sleep(3000);
			Addbtn.click();
			Thread.sleep(3000);
			btntotal.click();
			Thread.sleep(3000);
			btntake.click();
			Thread.sleep(3000);
			
		}
	public void addpayement() throws InterruptedException
	{
		btn61.click();
		Thread.sleep(3000);
		btnpay.click();
		
	}
		
		
		
	
	
	
	}


