package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJavaScriptExecutor extends Base {
	public void verifyJavaScript()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; //casting
		js.executeScript("arguments[0].click();", showMessage); //click
		js.executeScript("window.scrollBy(0,350)", "null"); //vertical scroll towards down
		js.executeScript("window.scrollBy(0,-350)", "null"); //vertical scroll towards up
	}

	public static void main(String[] args) {
		
		HandlingJavaScriptExecutor jsExecutor = new HandlingJavaScriptExecutor();
		jsExecutor.initializeDriver();
		jsExecutor.verifyJavaScript();
		

	}

}
