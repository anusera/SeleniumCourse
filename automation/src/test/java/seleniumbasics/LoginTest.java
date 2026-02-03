package seleniumbasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends BaseTestNG {

	@Test
	public void verifyUserLoginWithValidUsernameAndValidPassword() throws IOException
	{
		//WebElement userNameButton = driver.findElement(By.id("user-name"));
		//userNameButton.sendKeys("standard_user");
		//WebElement passwordButton = driver.findElement(By.id("password"));
		//passwordButton.sendKeys("secret_sauce");
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
		//System.out.println(driver.getCurrentUrl());
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordFiels(password);
		loginpage.clickOnLoginButton();
		
	}
	
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() throws IOException
	{
		//WebElement userNameButton = driver.findElement(By.id("user-name"));
		//userNameButton.sendKeys("standard_user");
		//WebElement passwordButton = driver.findElement(By.id("password"));
		//passwordButton.sendKeys("secret_sauce1");
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
		//WebElement errorMessage = driver.findElement(By.xpath("//h3[contains(text(),'sadface')]"));
		//System.out.println(errorMessage.getText());
		
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordFiels(password);
		loginpage.clickOnLoginButton();
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() throws IOException
	{
		//WebElement userNameButton = driver.findElement(By.id("user-name"));
		//userNameButton.sendKeys("standard_user1");
		//WebElement passwordButton = driver.findElement(By.id("password"));
		//passwordButton.sendKeys("secret_sauce");
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
		//WebElement errorMessage = driver.findElement(By.xpath("//h3[contains(text(),'sadface')]"));
		//System.out.println(errorMessage.getText());
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordFiels(password);
		loginpage.clickOnLoginButton();
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() throws IOException
	{
		//WebElement userNameButton = driver.findElement(By.id("user-name"));
		//userNameButton.sendKeys("standard_user1");
		//WebElement passwordButton = driver.findElement(By.id("password"));
		//passwordButton.sendKeys("secret_sauce1");
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
		//WebElement errorMessage = driver.findElement(By.xpath("//h3[contains(text(),'sadface')]"));
		//System.out.println(errorMessage.getText());
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username);
		loginpage.enterPasswordOnPasswordFiels(password);
		loginpage.clickOnLoginButton();
	}
}
