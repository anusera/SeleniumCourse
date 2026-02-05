package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	
	@Test (priority = 1 , description = "Validating that a user is able to add new news" )
	public void verifyUserIsAbleToAddANewNews() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnmoreInfoOnManageNews();
		ManageNewsPage manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.clickOnNewTab();
		manageNewsPage.sendTextToenterTheNewsTextBox();
		manageNewsPage.clickOnSaveButton();

	}
	
	@Test(priority = 2 , description = "Validating that a user is search news" )
	public void verifyUserIsAbleToSearchNews() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnmoreInfoOnManageNews();
		ManageNewsPage manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.clickOnSearchTab();
		manageNewsPage.sendTextToSearchTextBox();
		manageNewsPage.clickOnSearchButton();

	}
	
	@Test(priority = 3 , description = "Validating that a user is able to reset news" )
	public void verifyUserIsAbleToResetNews() throws IOException
	{
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnmoreInfoOnManageNews();
		ManageNewsPage manageNewsPage = new ManageNewsPage(driver);
		manageNewsPage.clickOnResetButton();

	}


}
