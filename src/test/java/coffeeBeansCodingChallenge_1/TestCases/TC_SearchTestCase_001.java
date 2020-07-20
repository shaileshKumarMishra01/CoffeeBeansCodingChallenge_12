package coffeeBeansCodingChallenge_1.TestCases;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import coffeeBeansCodingChallenge_1.pageObjects.HomePage;



public class TC_SearchTestCase_001 extends BaseClass{
	
static	WebDriver driver;                                                                                                                        

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				

		
		
		HomePage hp=new HomePage(driver);
		
		
		hp.RoundTrip();
		hp.Origin();
		
	    hp.Orig();
		
	    hp.Destination();
	    Thread.sleep(5000);

	    hp.Dest();
	    Thread.sleep(5000);
	    
	    hp.DepartDate();
	    Thread.sleep(5000);

	    
	    hp.ReturnDate();
	    
	    Thread.sleep(7000);
        hp.Search();
	   
	   
	    Thread.sleep(5000);

	    List<WebElement> AllDeparture = driver.findElements(By.cssSelector(".col-12 [data-test-attrib='onward-view'] p[class='m-0 fs-4 fw-600 c-neutral-900']"));
	    System.out.println(AllDeparture.size());
	       
        for (WebElement webElement : AllDeparture) {
            String DepartPriceasString = webElement.getText();
        String   DepartPriceasString1= DepartPriceasString.replaceAll("[₹,]", "");
       
        int DepartPriceLessthan5000= Integer.parseInt(DepartPriceasString1);
           if(DepartPriceLessthan5000<5000){
        	   System.out.println(DepartPriceLessthan5000);
           }
           else 
            System.out.println("No Departing FLights found in matching Budget");
           
           {
           
           List<WebElement> AllReturn = driver.findElements(By.cssSelector(".col-12 [data-test-attrib='return-view'] p[class='m-0 fs-4 fw-600 c-neutral-900']"));
	        for (WebElement webElement1 : AllDeparture) {
	            String ReturnPriceasString1 = webElement.getText();
	        String   ReturnPriceasString2= DepartPriceasString.replaceAll("[₹,]", "");
          
	        int ReturnPriceLessthan7000= Integer.parseInt(ReturnPriceasString2);
	           if(ReturnPriceLessthan7000<7000){
	        	  
	        	   System.out.println(ReturnPriceLessthan7000);
	           }
	           else 
	            System.out.println("No Return FLights found in matching Budget");


	    	            }
	        
        }}}
	  

}



