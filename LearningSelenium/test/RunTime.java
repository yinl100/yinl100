package test;

import org.openqa.selenium.WebDriver;

public class RunTime {
	
	public static void main(String[] args) {
		WebDriver driver;
		String browser;
		
		browser= FirstSeleniumTest.GetProperties();
		driver=FirstSeleniumTest.setProperties(browser);
		FirstSeleniumTest.openWebsite(driver);
		FirstSeleniumTest.WriteProperties();
		
	}
	

}
