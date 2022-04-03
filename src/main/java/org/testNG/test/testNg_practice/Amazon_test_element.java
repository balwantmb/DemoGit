package org.testNG.test.testNg_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_test_element {
    WebDriver driver ;
	@FindBy(id="nav-search-submit-button")public WebElement amazonhomeelement ;	
	
	public Amazon_test_element (WebDriver driver) {
	this.driver = driver ;
	PageFactory.initElements(driver, this);
	
	}
}
