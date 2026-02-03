package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	
	public void verifyRightClick()
	{
		WebElement others = driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions = new Actions(driver);
		actions.contextClick(others).build().perform();
	}
	
	//mouse Hover - moveToElement
	public void verifyMouseHover()
	{
		WebElement others = driver.findElement(By.xpath("//a[@id='others']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(others).perform();
	}
	
	public void verifyDragDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop);
	}
	
	public void verifyKeyboardActions() throws AWTException
	{
		//ctrl + T opens a new tab
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);   //VK stands for virtual key
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);   
		robot.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		
		HandlingActions mouseActions = new HandlingActions();
		mouseActions.initializeDriver();
		mouseActions.verifyRightClick();
		mouseActions.verifyMouseHover();
		mouseActions.verifyDragDrop();
		try {
			mouseActions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
