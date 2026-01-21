package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements extends Base {
	
	public void verifyWebElement()
	{
		//Navigate to the specific page
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//WebElement for the message box
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		//sendKeys()
		messageBox.sendKeys("Sample Test message");
		
		//WebElement for the show message button
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//click()
		showMessageButton.click();
		
		//WebElement for the your message field
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		
		//getText()
		System.out.println(yourMessage.getText());
		
		//clear()
		messageBox.clear();
		
		//WebElement for Total button
		WebElement totalButton = driver.findElement(By.id("button-two"));
		
		//getTagName()
		System.out.println(totalButton.getTagName());
		
		//getCssValue()
		System.out.println(showMessageButton.getCssValue("background-color"));
	}

	public static void main(String[] args) {
		HandlingWebElements webElementHandling = new HandlingWebElements();
		webElementHandling.initializeDriver();
		webElementHandling.verifyWebElement();

	}

}
