package org.testNG.test.testNg_practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.maven.project.lib.App_Lib;


public class Abstract_baseclass {

	  WebDriver driver ;
   private App_Lib app ;
   
	  
	  
	  @BeforeTest
	  
		public void setup() throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
			    driver = new ChromeDriver ();
				
				driver.get("https://www.ebay.com/");
				
				driver.manage().window().maximize();
			
				Thread.sleep(3000);
				
				app = new App_Lib (driver);
		}
		
		@BeforeTest
		public void starting_setup () throws InterruptedException {
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
			    driver = new ChromeDriver ();
				
				driver.get("https://www.amazon.com/");
				
				driver.manage().window().maximize();
		
				app = new App_Lib (driver);
		}
				
	  
	  
	  
	  
	  
		@AfterTest
		public void closesystem() {
	       driver.close();
		
		}
		
		public App_Lib app1 () {
			return app;
			
		}
		
		public App_Lib app2 () {
			return app;
			
		}
		
	
	
}
