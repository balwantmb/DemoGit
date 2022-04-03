package com.mavenproject.pages;

import org.openqa.selenium.WebDriver;
import org.testNG.test.testNg_practice.Amazon_test_element;

public class Amazon_sanity_page {
 WebDriver driver ;
	Amazon_test_element amazontestelement ;
	
	public Amazon_sanity_page (WebDriver driver) {
		this.driver = driver ;
		amazontestelement = new Amazon_test_element(driver);
	}
	
	public boolean issearchEnabled() {
		return amazontestelement.amazonhomeelement.isEnabled();
		
	
}

}