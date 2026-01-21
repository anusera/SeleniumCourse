package seleniumbasics;

import org.openqa.selenium.By;

public class HandlingLocators extends Base{
	public void verifyLocators() {
		
		//Selenium Locators
		
		//id	
		driver.findElement(By.id("button-one"));
		
		//name
		driver.findElement(By.name("viewport"));
		
		//tagName
		driver.findElement(By.tagName("section"));
		
		//className
		driver.findElement(By.className("container page"));
		
		//linkText
		driver.findElement(By.linkText("Simple Form Demo"));
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Simple"));
		
		//cssSelector
		driver.findElement(By.cssSelector("button[id='button-one']"));
		
		//xpath
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//input[@id='value-a']"));
		
		//xpath with text() function
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		//xpath with contains text()
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]"));
		
		//xpath with and
		driver.findElement(By.xpath("//button[@id='button-one'  and  @type='button']"));
		
		//xpath with or
		driver.findElement(By.xpath("//button[@id='button-one'  or  @type='button0']"));
		
		//xpath access methods
		
		//parent
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		
		//child
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		
		//following
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		
		//preceding
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		
		//ancestor
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
		//descendant
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		
	}
	
	public static void main(String[] args) {
		

	}
	
	

}
