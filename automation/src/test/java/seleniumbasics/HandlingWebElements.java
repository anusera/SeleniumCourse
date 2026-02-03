package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElements extends Base {
	
	//WebElement Methods
	
	//click()
	//clear()
	//sendKeys()
	//getText()
	//getTagName()
	//getCssValue()
	
	
	//isSelected()
	//isDisplayed()
	//isEnabled()
	
	
	
	public void verifyWebElement()
	{
		//Navigate to the specific page
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//WebElement for the message box
		WebElement messageBox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		
		//isSelected 
		//gives true when a checkbox, radiobutton etc is selected
		System.out.println("Is the Messagebox selected : " +messageBox.isSelected());
		
		//sendKeys()
		messageBox.sendKeys("Sample Test message");
					
		//show message button WebElement
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//isDisplayed()
		System.out.println("Is the Show message button displayed : "+showMessageButton.isDisplayed());
		
		//isEnabled()
		System.out.println("Is the Show message button enabled : "+showMessageButton.isEnabled());
		
		//click()
		showMessageButton.click();
		
		//your message field WebElement
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		
		//getText()
		System.out.println(yourMessage.getText());
		
		//clear()
		messageBox.clear();
		
		//Total button WebElement
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
