package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testbase {
	
	
	

	public static WebDriver driver ;
	
	@BeforeSuite
	public void StartDriver()
	{
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.navigate().to("https://console.foodics.dev/");
	}
	@AfterSuite
	public void StopDriver()
	{
		driver.quit();



	}}






