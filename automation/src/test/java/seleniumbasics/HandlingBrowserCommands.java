package seleniumbasics;

public class HandlingBrowserCommands extends Base{
	
	public void verifyBrowserCommands() {
		
		//driver.commands
		
		
		//driver.findElement()
		//driver.manage()
		//driver.switchTo()
		
		
		//driver.close()
		//driver.quit()
				
		
		//driver.get()
		//driver.getTitle()
		//driver.getCurrentUrl()
		//driver.getWindowHandle()
		//driver.getPageSource()
		
		//driver.navigate().to()
		//driver.navigate().back()
		//driver.navigate().forward()
		//driver.navigate().refresh()
		
		
		
		//get the title of the webpage
		String title = driver.getTitle();
		System.out.println("Title of the page: " + title);
		
		//Get the current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of the page: " + currentUrl);
		
		//get the windowHandle
		String id = driver.getWindowHandle();
		System.out.println("Window Handle ID: " + id);
		
		//get the pageSource
		String pageSource = driver.getPageSource();
		System.out.println("Page Source : " + pageSource);
	}
	
	
	public void verifyNavigationCommands() {
		
		//Navigate to
		driver.navigate().to("https://www.flipkart.com/");
		
		//Navigate back
		driver.navigate().back();
		
		//Navigate forward
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		
	}
	
		
	public static void main(String[] args) {
		HandlingBrowserCommands browser = new HandlingBrowserCommands();
		browser.initializeDriver();
		browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
		//browser.browserCloseAndQuit();
		
	}
}
