package com.maven.projet.prctice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts_methods {

	@Test

	public void assert_test_samples () {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver ();
			
			driver.get("https://www.ebay.com/");
			
			
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
			
			String expectedurl1="https://www.ebay.com/";
			String expectedtitle1 = "Electronics, Cars, Fashion, Collectibles & More | eBay1";
			
			
			String URL = driver.getCurrentUrl();
			String TITLE = driver.getTitle() ;
			
			System.out.println(URL);
			System.out.println(TITLE);	
			
			Assert.assertEquals(URL, expectedurl1,"VERIEFY url of new page");
			Assert.assertNotEquals(TITLE, expectedtitle1,"veriefy Title");
			
		
			driver.close();
	        
		    
		
		
			
			
			
		  
}
}