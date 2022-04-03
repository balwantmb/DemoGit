package com.maven.project.lib;



import org.openqa.selenium.WebDriver;




public class App_Lib {
	WebDriver driver ;
	private Page_Lib  page ;
	
	public App_Lib (WebDriver driver) {
		this.driver = driver ;	
		page = new Page_Lib (this.driver);
		
	}
	
	public Page_Lib pages () {
		return page;
	}
	
	
	
}
