package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
	public void verifyTable()
	{
	   driver.navigate().to("https://money.rediff.com/indices/nse");
	   WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
	  // System.out.println(table.getText());
	   WebElement row1 = driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[1]"));
	   System.out.println(row1.getText());
	}


	public static void main(String[] args) {
		
		TableHandling tableHandling = new TableHandling();
		tableHandling.initializeDriver();
		tableHandling.verifyTable();
		
	}

}
