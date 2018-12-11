package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
          static WebDriver driver;
          static String browser;
          
		public static String GetProperties(){
        	  Properties prop = new Properties();
        	  InputStream is;
			try {
				is = new FileInputStream("C:\\Users\\yilei.ORADEV\\workspace\\LearningSelenium\\test\\test.properties");
				 prop.load(is);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  browser= prop.getProperty("browserType");
        	  System.out.println("browser type: " + browser);
        	  return browser;
          }
          
          @SuppressWarnings("deprecation")
		public static void WriteProperties(){
        	  Properties prop1 = new Properties();
        	  prop1.setProperty("browserType", "Firefox");
        	  OutputStream os;
			try {
				os = new FileOutputStream("C:\\Users\\yilei.ORADEV\\workspace\\LearningSelenium\\test\\test.properties");
				prop1.save(os, "setProp");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  
          }

          
          public static WebDriver setProperties(String browser){
        	  System.out.println("browser type: " + browser);
			if (browser.equalsIgnoreCase("Firefox") ){
				System.setProperty("webdriver.gecko.driver","C:\\Users\\yilei.ORADEV\\workspace\\LearningSelenium\\lib\\geckodriver\\geckodriver.exe");
			    System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			    driver = new FirefoxDriver();
			}
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\yilei.ORADEV\\workspace\\LearningSelenium\\lib\\chromedriver\\chromedriver.exe");
			    System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
				driver = new ChromeDriver();
			}
			return driver;
				
		
		}
		
		
		public static void openWebsite(WebDriver driver){
			System.out.println("browser type: " );
			driver.get("http://google.com");
			driver.quit();
		
		}
		
}
