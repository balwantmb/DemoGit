package org.testNG.test.testNg_practice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Ebay_test_case1 extends Abstract_baseclass {
	
	/* WebDriver driver ;
	 Ebay_Sanity_page ebaytestelement ;	

	
	@BeforeClass
	public void startingclasssetup() {
		System.out.println("Execution Start: sanity testing");
	}
	
	@AfterClass
	public void endingclass() {
		System.out.println("Execution stop: now regression testing");
	}
	
	*/
	/*@BeforeMethod
	public void setup() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		    driver = new ChromeDriver ();
			
			driver.get("https://www.ebay.com/");
			
			driver.manage().window().maximize();
		
			Thread.sleep(3000);
			 ebaytestelement = new Ebay_Sanity_page(driver);
			
	}
	
	@AfterMethod
	public void closesystem() {
	}
	*/
	
	

	@Test
	
	public void empty_search_test () {
	
		String expectedurl ="https://www.ebay.com/";
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		

		
		String URL = driver.getCurrentUrl();
		String TITLE = driver.getTitle() ;
		
		System.out.println(URL);
		System.out.println(TITLE);		
	   
		
		Assert.assertTrue(app1().pages().h1().issearchEnabled(),"Veriefy search button is enabled");
		assertEquals(URL, expectedurl,"Veriefy URL of new page");
		assertEquals(TITLE, expectedtitle,"veriefy title of page");
		

		
	}
	

	  
	

	@Test
	    public void sanity_test1() {
	    
	    	
			String expectedurl ="https://www.ebay.com/";
			String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
			
			
			
			String URL = driver.getCurrentUrl();
			String TITLE = driver.getTitle() ;
			
			System.out.println(URL);
			System.out.println(TITLE);		
			
		    SoftAssert sa = new SoftAssert();
			   
			sa.assertEquals(URL, expectedurl,"Veriefy URL of new page");
			sa.assertEquals(TITLE, expectedtitle,"veriefy title of page");
			sa.assertAll();
			
		  
	   }
}
