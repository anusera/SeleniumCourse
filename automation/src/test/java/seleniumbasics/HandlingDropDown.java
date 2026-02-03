package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base {
	public void verifyDropDown()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropDown);
		select.selectByIndex(1);
		//select.deselectByVisibleText("sql");
		//select.selectByValue("python");
	}
	
	public void verifyCheckBox()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@value='option-1']"));
		System.out.println(checkBox1.isSelected());
		checkBox1.click();
		//System.out.println(checkBox1.isSelected());
	}
	
	public void verifyRadioButton()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton4 = driver.findElement(By.xpath("//input[@value='orange']"));
		radioButton4.click();
	}

	public static void main(String[] args) {
		HandlingDropDown dropDown = new HandlingDropDown();
		dropDown.initializeDriver();
		//dropDown.verifyDropDown();
		dropDown.verifyCheckBox();
		//dropDown.verifyRadioButton();
		
	}

}
