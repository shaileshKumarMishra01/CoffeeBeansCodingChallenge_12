package coffeeBeansCodingChallenge_1.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import coffeeBeansCodingChallenge_1.pageObjects.HomePage;


	
	public class TC_SearchTestCase_002 extends BaseClass{
		
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
			 // hp.NonStop();

			    //Thread.sleep(5000);
		       // hp.OneStop();

			   //Thread.sleep(5000);
					        
		        List<WebElement> AllDeparture = driver.findElements(By.cssSelector(".col-12 [data-test-attrib='onward-view'] p[class='m-0 fs-4 fw-600 c-neutral-900']"));
                
		       
		        for (WebElement webElement : AllDeparture) {
		            String DepartPriceasString = webElement.getText();
		        String   DepartPriceasString1= DepartPriceasString.replaceAll("[₹,]", "");
	           
		        int DepartPriceLessthan7000= Integer.parseInt(DepartPriceasString1);
		           if(DepartPriceLessthan7000<7000){
		        	   System.out.println(DepartPriceLessthan7000);
		           }
		           else 
		            System.out.println("No FLights found in matching Budget");
	  
				  
			      
			        
			    }
			       
			
			}
			}

