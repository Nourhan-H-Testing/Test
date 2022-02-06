package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {

protected WebDriver driver;

	//create constructor
	public Pagebase(WebDriver driver)

	{
		PageFactory.initElements(driver, this);

	}


}
