package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	
	public void verifyFrames(){
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> frameElements = driver.findElements(By.tagName("iframe"));
		System.out.println(frameElements.size());
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement frame1Title = driver.findElement(By.id("sampleHeading"));
		System.out.println(frame1Title.getText());
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		
		HandlingFrames frames = new HandlingFrames();
		frames.initializeDriver();
		frames.verifyFrames();

	}

}
