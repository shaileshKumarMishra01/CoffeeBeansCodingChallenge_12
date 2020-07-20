package coffeeBeansCodingChallenge_1.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	String baseURL="https://www.cleartrip.com/";
	public static WebDriver driver;
	
	@Parameters("browser")

	@BeforeClass
	public void setup(String br){
		

	if (br.equals("chrome"))
		
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get(baseURL);


	}
	
	else if(br.equals("firefox"))
	
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver");
		driver=new FirefoxDriver();
	}
	
	driver.get(baseURL);
}
	
	@AfterClass
	public void Teardown()
	{
		driver.quit();
	
}
}