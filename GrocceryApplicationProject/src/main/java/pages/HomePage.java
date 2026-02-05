package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement adminLogoutIcon;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logoutButton;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement moreInfoOnManageNews;
	
	public void clickOnAdminLogoutIcon()
	{
		adminLogoutIcon.click();
	}
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
	
	public void clickOnmoreInfoOnManageNews()
	{
		moreInfoOnManageNews.click();
	}
}


