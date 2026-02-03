package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //first is local and the second is global		
	}
	
	@FindBy(id = "user-name")WebElement userNameButton;
	
	@FindBy(id= "password")WebElement passwordButton;
	
	@FindBy(id = "login-button")WebElement loginButton;
	
	
	public void enterUserNameOnUserNameField(String username)
	{
		userNameButton.sendKeys(username);
	}
	
	
	public void enterPasswordOnPasswordFiels(String password)
	{
		passwordButton.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
}
