package coffeeBeansCodingChallenge_1.pageObjects;






                                                                                                                                             
import org.openqa.selenium.WebDriver;                                                                                                        
import org.openqa.selenium.WebElement;                                                                                                       
import org.openqa.selenium.support.FindBy;                                                                                                   
import org.openqa.selenium.support.PageFactory;                                                                                              
                                                                                                                                             
                                                                                                                                             
public class HomePage{                                                                                                                       
//	WebDriver driver;                                                                                                                        
	                                                                                                                                         
	                                                                                                                                         
public HomePage(WebDriver driver)                                                                                                            
	                                                                                                                                         
	//ldriver=driver;                                                                                                                      
	{                                                                                                                                        
		PageFactory.initElements(driver, this);                                                                                              
	}                                                                                                                                        
	@FindBy(id="RoundTrip")                                                                                                                  
	WebElement RoundTrip;                                                                                                                    
	                                                                                                                                         
	@FindBy(id="FromTag")                                                                                                                    
	WebElement Origin;                                                                                                                       
	                                                                                                                                         
	@FindBy(xpath="//ul[@id='ui-id-1']/li/a[text()='New Delhi, IN - Indira Gandhi Airport (DEL)']")                                          
	WebElement Orig;                                                                                                                         
	                                                                                                                                         
	@FindBy(id="ToTag")                                                                                                                      
	WebElement Destination;                                                                                                                  
                                                                                                                                             
	                                                                                                                                         
	@FindBy(xpath="//ul[@id='ui-id-2']/li/a[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']")                                        
	WebElement Dest;                                                                                                                         
	                                                                                                                                         
	@FindBy(css=".calendar td a[class~='ui-state-active']")                                                                                  
	WebElement DepartDate;                                                                                                                   
	                                                                                                                                         
	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[4]/a")	                                                         
	                                                                                                                                         
	WebElement ReturnDate;                                                                                                                   
	                                                                                                                                         
	@FindBy(xpath="//input[@id='SearchBtn']")	                                                                                                             
	WebElement Search;                                                                                                                       
	                                                                                                                                         
	@FindBy(xpath="//label[contains(text(),'0 stop')]")                        
	WebElement NonStop;                                                                                                                      
	                                                                                                                                         
	@FindBy(xpath="//label[contains(text(),'1 stop')]")                                                                                                   
	WebElement OneStop;                                                                                                                      
	                                                                                                                                         
	@FindBy(xpath=".//*[@id='flightForm']/section[2]/div[4]/div[1]/nav/ul/li[2]/div")	                             
	WebElement SecondDep;                                                                                                                    
                                                                                                                                             
	@FindBy(xpath=".//*[@id='flightForm']/section[2]/div[4]/div[2]/nav/ul/li[5]/div")                                 
	WebElement FifthRet;                                                                                                                     
                                                                                                                                             
	@FindBy(xpath="(//p[contains(@class,'m-0 fs-4 fw-600 c-neutral-900')])[2]")          
	WebElement DepartAmount;                                                                                                                 
	                                                                                                                                         
	@FindBy(xpath="(//p[contains(@class,'m-0 fs-4 fw-600 c-neutral-900')])[9]")          
	WebElement ReturnAmount;                                                                                                                 
	                                                                                                                                         
	@FindBy(css=".col-12 [data-test-attrib='onward-view'] p[class='m-0 fs-4 fw-600 c-neutral-900']")                                         
	WebElement AllDepartAmount;                                                                                                              
	                                                                                                                                         
	@FindBy(css=".col-12 [data-test-attrib='onward-view'] p[class='m-0 fs-4 fw-600 c-neutral-900']")                                         
	WebElement AllReturnAmount;                                                                                                              
	                                                                                                                                         
	                                                                                                                                         
	                                                                                                                                         
                                                                                                                                             
	public void RoundTrip()                                                                                                                  
	{                                                                                                                                        
		RoundTrip.click();                                                                                                                   
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void Origin()                                                                                                                     
	{                                                                                                                                        
		Origin.sendKeys("delhi");                                                                                                            
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void Orig()                                                                                                                       
	{                                                                                                                                        
	Orig.click();                                                                                                                            
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void Destination()                                                                                                                
	{                                                                                                                                        
       Destination.sendKeys("mumbai");                                                                                                       
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void Dest()                                                                                                                       
	{                                                                                                                                        
       Dest.click();                                                                                                                         
                                                                                                                                             
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void DepartDate()                                                                                                                 
	{                                                                                                                                        
		DepartDate.click();                                                                                                                  
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void ReturnDate()                                                                                                                 
	{                                                                                                                                        
		ReturnDate.click();                                                                                                                  
	                                                                                                                                         
	}                                                                                                                                        
	public void Search()                                                                                                                     
	{                                                                                                                                        
		Search.click();                                                                                                                      
	                                                                                                                                         
	}                                                                                                                                        
	public void NonStop()                                                                                                                    
	{                                                                                                                                        
		NonStop.click();                                                                                                                     
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void OneStop()                                                                                                                    
	{                                                                                                                                        
		OneStop.click();                                                                                                                     
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void SecondDep()                                                                                                                  
	{                                                                                                                                        
		SecondDep.click();                                                                                                                   
	                                                                                                                                         
	}                                                                                                                                        
	public void FifthRet()                                                                                                                   
	{                                                                                                                                        
		FifthRet.click();                                                                                                                    
	                                                                                                                                         
	}                                                                                                                                        
                                                                                                                                             
	public void DepartAmount()                                                                                                               
	{                                                                                                                                        
		DepartAmount.getText();                                                                                                              
	                                                                                                                                         
	}                                                                                                                                        
	                                                                                                                                         
	public void ReturnAmount()                                                                                                               
	{                                                                                                                                        
		ReturnAmount.getText();                                                                                                              
	                                                                                                                                         
	}                                                                                                                                        
                                                                                                                                             
	public void AllDepartAmount()                                                                                                            
	{                                                                                                                                        
		AllDepartAmount.getText();                                                                                                           
	                                                                                                                                         
	}                                                                                                                                        
	public void AllReturnAmount()                                                                                                            
	{                                                                                                                                        
		AllReturnAmount.getText();                                                                                                           
	                                                                                                                                         
	}                                                                                                                                        
	}                                                                                                                                        