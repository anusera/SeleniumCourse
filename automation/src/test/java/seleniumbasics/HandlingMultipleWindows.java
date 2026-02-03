package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows extends Base{
	
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentHandleId = driver.getWindowHandle();
		System.out.println(parentHandleId);
		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String> handleIds = driver.getWindowHandles();
		System.out.println(handleIds);
		Iterator<String> it = handleIds.iterator();
		while(it.hasNext())
		{
			String currentId = it.next();
			if(! currentId.equals(parentHandleId))
				{
				driver.switchTo().window(currentId);
				WebElement eMail = driver.findElement(By.xpath("//input[@name='emailid']"));
				eMail.sendKeys("anuserahs@gmail.com");
				WebElement submitButton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submitButton.click();
				}
		}
		
		
	}

	public static void main(String[] args) {
		HandlingMultipleWindows multipleWindows = new HandlingMultipleWindows();
		multipleWindows.initializeDriver();
		multipleWindows.verifyMultipleWindow();
		
		

	}

}
