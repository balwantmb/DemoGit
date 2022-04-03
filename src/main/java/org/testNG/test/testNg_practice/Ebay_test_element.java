package org.testNG.test.testNg_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_test_element {

    WebDriver driver ; 
	@FindBy(id="gh-btn") public  WebElement ebayhomeelement ;
	
	public Ebay_test_element  (WebDriver driver) {
	this.driver = driver ;
	PageFactory.initElements(driver, this);
	
	}

	
		
	}
	

