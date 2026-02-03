package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base{
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		
		//Create a reference variable for the Alert interface and bring the control to the alert pop up
		Alert alert = driver.switchTo().alert();
		
		//Accept he alert
		alert.accept();		
	}
		
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert.click();
		
		//Create a reference variable for the Alert interface and bring the control to the alert interface
		Alert alert = driver.switchTo().alert();
		
		//dismiss the alert
		//alert.dismiss();
		
		//Accept the alert
		alert.accept();		
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Anu");
		//alert.accept();
		alert.dismiss();
	}
	
	
	

	public static void main(String[] args) {
		
		HandlingAlerts alerts = new HandlingAlerts();
		alerts.initializeDriver();
		//alerts.verifySimpleAlert();
		//alerts.verifyConfirmAlert();
		alerts.verifyPromptAlert();
	}

}
