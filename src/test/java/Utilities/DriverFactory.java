package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	//Returns a WebDriver object
	
	public WebDriver openBrowser(String browserType) {
		
		WebDriver driver;
		
		if(browserType.equalsIgnoreCase("IE")) {

			//Initializing IE
			System.setProperty("webdriver.ie.driver", "C:\\Webdrivers\\IEDriverServer.exe");
			return driver = new InternetExplorerDriver();
			
		}else if(browserType.equalsIgnoreCase("firefox")){
			
			//Initializing firefoxdriver
			System.setProperty("webdriver.gecko.driver", "C:\\Webdrivers\\geckodriver.exe");
			return driver = new FirefoxDriver();
		}else {
			
			//Initializing chromedriver by default
			System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
			return driver = new ChromeDriver();
		}
	}
	
}
