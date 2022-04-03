package com.maven.project.lib;

import org.openqa.selenium.WebDriver;

import com.mavenproject.pages.Amazon_sanity_page;
import com.mavenproject.pages.Ebay_Sanity_page;

public class Page_Lib {

	
	
		private  WebDriver driver ;
		private  Ebay_Sanity_page ebaytestelement ;	
		private  Amazon_sanity_page amazontestelement;
		  
	public Page_Lib (WebDriver driver) {
		
		this.driver = driver;
		ebaytestelement = new Ebay_Sanity_page(driver);
		 amazontestelement = new Amazon_sanity_page(driver);
	}


	

	public Ebay_Sanity_page h1 () {
		return ebaytestelement;
		
	}
	public 	Amazon_sanity_page  h2 () {
		return amazontestelement;
		
	}
		
	}

