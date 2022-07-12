package pom.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage 
{
	@FindBy (xpath = "//input[@id='email']")private WebElement email;
	@FindBy (xpath = "//input[@id='pass']") private WebElement pass;
	@FindBy (xpath = "//button[@name='login']") private WebElement login;
	@FindBy (xpath = "//a[text()='Forgotten password?']") private WebElement forgot;
	@FindBy (xpath = "//a[@data-testid='open-registration-form-button']") private WebElement createAcc;
	@FindBy (xpath = "//a[text()='Create a Page']") private WebElement createPage;
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterEmailId(String emailId)
	{
		email.sendKeys(emailId);
	}
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickOnLogin()//(String loginButton)
	{
		login.click();//(loginButton);
	}
	public void clickOnCreateNewAccount()//(String loginButton)
	{
		createAcc.click();//(loginButton);
	}
	public void clickOnCreateNewPage()//(String loginButton)
	{
		createPage.click();//(loginButton);
	}
}
