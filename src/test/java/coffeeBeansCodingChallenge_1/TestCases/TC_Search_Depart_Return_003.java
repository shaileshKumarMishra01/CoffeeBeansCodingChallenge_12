package coffeeBeansCodingChallenge_1.TestCases;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import coffeeBeansCodingChallenge_1.pageObjects.HomePage;

import java.util.concurrent.TimeUnit;


public class TC_Search_Depart_Return_003 extends BaseClass
	{
		public static void main(String[] args) throws InterruptedException 
		{
			   String baseURL="https://www.cleartrip.com/";
			   

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
	          driver.get(baseURL);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				

			
			
			HomePage hp=new HomePage(driver);
			
			hp.RoundTrip();
			
			
			hp.Origin();
			
		    hp.Orig();
			
		    hp.Destination();

		    hp.Dest();
		    
		    hp.DepartDate();
		    Thread.sleep(7000);

		    hp.ReturnDate();
		    Thread.sleep(7000);

		    hp.Search();
		    Thread.sleep(9000);
		  
		    
	 	    hp.SecondDep();
		    Thread.sleep(5000);


		  	    hp.FifthRet();


		          String departprice=driver.findElement(By.xpath(".//*[@id='root']/div/main/div/div/div[2]/div[2]/div[12]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div[3]/div[2]/p")).getText(); 
	              String liveprice = departprice;
	              String DepPrice = liveprice.replaceAll("[₹,]", "");
	             int Depart= Integer.parseInt(DepPrice);
	              System.out.println(Depart);


		        

		          String Returnprice=driver.findElement(By.xpath(".//*[@id='root']/div/main/div/div/div[2]/div[2]/div[12]/div[2]/div[1]/div/div[5]/div[1]/div[2]/div[3]/div[2]/p")).getText(); 
		           String liveprice1 = Returnprice;
	              String RetPrice = liveprice1.replaceAll("[₹,]", "");
	             int  Return=Integer.parseInt(RetPrice);
	              System.out.println(Return);

		        
		          String travelPrice=driver.findElement(By.xpath(".//*[@id='root']/div/main/div/div/div[2]/div[2]/div[7]/div/div[2]/div/div/span")).getText();
		          String liveprice2 = travelPrice;
	              String TravPrice = liveprice2.replaceAll("[₹,]", "");
	              int Travel=Integer.parseInt(TravPrice);
	              System.out.println(Travel);
	              
	              int TravelDepRet=Depart+Return;
	              System.out.println(TravelDepRet);

	              
	               if(TravelDepRet!=Travel){
	            	System.out.println("Tarvel price is not equal to sum of Departure Price and Return Price");
	             }
	             else
		          
	               System.out.println("Tarvel price is equal to sum of Departure Price and Return Price");

		
		}
		   
	   }
		    
		   


