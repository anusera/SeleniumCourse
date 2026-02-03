package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	//Assigning a reference variable for the WebDriver interface
		public WebDriver driver;   
		
		
	public void initializeDriver() {
		
		//initializing the reference variable driver with the ChromeDriver class that implements the WebDriver interface
		driver = new ChromeDriver();
		
		//launching the url under test
		driver.get("https://selenium.qabible.in/");
		
		//maximize the window
		driver.manage().window().maximize();
		
	}
	
	public void browserCloseAndQuit() {
		
		//close the current window
		//driver.close();
		
		//close the current window and all the windows opened by the driver.
		driver.quit();
	}
	public static void main(String[] args) {
		Base base = new Base();
		base.initializeDriver();
		base.browserCloseAndQuit();

	}

}
