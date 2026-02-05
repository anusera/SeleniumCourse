package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newTab;
	@FindBy(id = "news" )WebElement enterTheNewsTextBox;
	@FindBy(xpath = "//button[@name='create']")WebElement saveButton;
	@FindBy(xpath = "//i[@class=' fa fa-search']")WebElement searchTab;
	@FindBy(xpath = "//input[@name='un']")WebElement searchTextBox;
	@FindBy(xpath = "//button[@name='Search']")WebElement searchButton;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-sync-alt']")WebElement resetButton;



	public void clickOnNewTab()
	{
		newTab.click();
	}
	
	public void sendTextToenterTheNewsTextBox()
	{
		enterTheNewsTextBox.sendKeys("New_news_by_Anu");
	}
	
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public void clickOnSearchTab()
	{
		searchTab.click();
	}
	public void sendTextToSearchTextBox()
	{
		searchTextBox.sendKeys("New_news_by_Anu");
	}
	public void clickOnSearchButton() 
	{
		searchButton.click();
	}
	
	public void clickOnResetButton()
	{
		resetButton.click();
	}
}
