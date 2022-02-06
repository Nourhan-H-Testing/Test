package Test.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testbase {
	
	
	

	public static WebDriver driver ;
	@BeforeSuite

	public void StartDriver()
	{

		System.setProperty("webdriver.chromedriver", System.getProperty("user.dir")+"\\Resources\\Chromedriver.exe");
		driver=(WebDriver) new ChromeDriver();
	}
	@AfterSuite
	public void StopDriver()
	{
		driver.quit();



	}}






