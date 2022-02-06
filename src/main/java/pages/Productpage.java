package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productpage extends PageLogin{

	public Productpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(partialLinkText ="Menu")
	WebElement btnmenu;
	
	@FindBy(partialLinkText = "Produc")
	WebElement btnproduct;
	
	@FindBy(xpath = "//button[contains(text(),'Create product')]")
	WebElement btncreateproduct;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement txtname;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]")
	WebElement btncat;
	
	@FindBy (xpath = "//a[contains(text(),'oriantals')]")
	WebElement categorybtn;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[6]/div[2]/input[1]")
	WebElement txtprice;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]/span[1]")
	WebElement btnsave;
	
	//@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	WebElement btnprecreated;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/button[1]")
	WebElement btnaddmodifier;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]")
	WebElement btmodifierfield;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
	WebElement btndressingbtn;
	
	//@FindBy(xpath =" /html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement btnspace;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]/span[1]")
	WebElement btnsavemodi;
	//@FindBy(xpath="//body[1]/div[1]/header[1]/div[1]/div[2]/div[2]/div[1]/button[1]/svg[1]/path[1]")
	WebElement btnmain;
	//@FindBy(partialLinkText = "Logo")
	WebElement btnlogout;
	
	
	
	
	
	
	public void Createproductwithmodifier(String name,String pricep) throws InterruptedException
	{
		btnmenu.click();
		btnproduct.click();
		btncreateproduct.click();
		Thread.sleep(4000);
		txtname.sendKeys(name);
		Thread.sleep(3000);
		btncat.click();
		Thread.sleep(3000);
		categorybtn.click();
		Thread.sleep(3000);
		txtprice.sendKeys(pricep);
		Thread.sleep(3000);
		btnsave.click();
		Thread.sleep(3000);
		//btnprecreated.click();
		//Thread.sleep(3000);
		
		
	}
	//public void admodfi () throws InterruptedException
	{
		
	//	Thread.sleep(3000);
       // btnaddmodifier.click();
        //Thread.sleep(3000);
     //   btmodifierfield.click();
        //Thread.sleep(5000);
       // btndressingbtn.click();
        //Thread.sleep(3000);
      //  btnspace.click();
       // Thread.sleep(3000);
       // btnsavemodi.click();
	}
	
	//public void logout() throws InterruptedException{
	//Thread.sleep(3000);
	//btnmain.click();
	//btnlogout.click();
	}
	
        
		
				
		
	

	


