package com.mavenproject.pages;

import org.openqa.selenium.WebDriver;

import org.testNG.test.testNg_practice.Ebay_test_element;

public class Ebay_Sanity_page {
	
	
    WebDriver driver ;
    Ebay_test_element ebaytestelement ;
    
    public Ebay_Sanity_page (WebDriver driver) {
    	this.driver = driver ;
    	ebaytestelement  = new Ebay_test_element(driver);
    	
    }
	
    public boolean issearchEnabled() {
		return ebaytestelement.ebayhomeelement.isEnabled() ;
	
		
	
    	
    }
	
	
}
