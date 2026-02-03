package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\anuja\\git\\SeleniumCourse\\automation\\src\\test\\resources\\InheritanceHW.pdf");
		WebElement accept = driver.findElement(By.id("terms"));
		accept.click();
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();
	}
	
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdf = driver.findElement(By.id("pickfiles"));
		selectPdf.click();
		StringSelection selection = new StringSelection("C:\\Users\\anuja\\git\\SeleniumCourse\\automation\\src\\test\\resources\\InheritanceHW.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot r=new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		
		HandlingFileUpload fileUpload = new HandlingFileUpload();
		fileUpload.initializeDriver();
		fileUpload.fileUploadUsingSendKeys();
		try {
			fileUpload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
