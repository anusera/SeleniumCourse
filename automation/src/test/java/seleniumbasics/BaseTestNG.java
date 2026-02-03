package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestNG {
	
	
		//Assigning a reference variable for the WebDriver interface
			public WebDriver driver;   
			
		@BeforeMethod	
		public void initializeDriver() {
			
			//initializing the reference variable driver witht he ChromeDriver class
			driver = new ChromeDriver();
			
			//launching the url under test
			driver.get("https://www.saucedemo.com/");
			
			//maximize the window
			driver.manage().window().maximize();
		}
		
		@AfterMethod
		public void browserCloseAndQuit() {
			
			//close the current window
			//driver.close();
			
			//close the current window and all the windows opened by the driver.
			//driver.quit();
		}

}
