package org.testNG.test.testNg_practice;





import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import org.testng.annotations.Test;



public class Amazon_test_case2 extends Abstract_baseclass {
	
   /*  Amazon_sanity_page amazontestelement;
	
	@BeforeClass
	public void starting_class() {
		System.out.println("Execution of amazon is started");
	}
	
	@AfterClass
	public void EndOF_class () {
		System.out.println("Execution of amazon is over");
	}
	
	
	@BeforeMethod
	public void starting_setup () throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		    driver = new ChromeDriver ();
			
			driver.get("https://www.amazon.com/");
			
			driver.manage().window().maximize();
		
			//amazontestelement = new Amazon_sanity_page(driver);
			
			Thread.sleep(3000);		
	}
	
	
	
	@AfterMethod 
	public void closing_system () {
		
	}	
		*/
		
	
	@Test
	public void Empty_search() throws InterruptedException {

		
		
			String expectedurl ="https://www.amazon.com/";
			String expectedtitle = "Amazon.com. Spend less. Smile more.";
			

			
			String URL = driver.getCurrentUrl();
			String TITLE = driver.getTitle() ;
			
			System.out.println(URL);
			System.out.println(TITLE);		
			

			   
			assertEquals(URL, expectedurl,"Veriefy URL of new page");
			assertEquals(TITLE, expectedtitle,"veriefy title of page");
			Assert.assertTrue(app2().pages().h2().issearchEnabled(),"Veriefy search button is enabled");
			
}
	
	
	@Test
	public void sanity_test2() throws InterruptedException {

		
		
			String expectedurl ="https://www.amazon.com/";
			String expectedtitle = "Amazon.com. Spend less. Smile more.";
			

			
			String URL = driver.getCurrentUrl();
			String TITLE = driver.getTitle() ;
			
			System.out.println(URL);
			System.out.println(TITLE);		
			

			   
			assertEquals(URL, expectedurl,"Veriefy URL of new page");
			assertEquals(TITLE, expectedtitle,"veriefy title of page");
			
		
	
	
	
	
	
	}
	
	
	
}