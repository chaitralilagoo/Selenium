package zerodha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLogin 
{
	/*
	 Kite login credentials
		UN: OKP335
		Pass:QAZ123456
		Pin:456789
	 */
	@FindBy (xpath = "//input[@id='userid']") private WebElement userId;
	@FindBy (xpath = "//input[@id='password']") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement logIn;
	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submit;
	@FindBy (xpath = "//a[@href='/forgot']") private WebElement forgot;
	
	public POMLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUserId(String userId)
	{
		this.userId.sendKeys(userId);
	}
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
	}
	public void clickLogIn()
	{
		logIn.click();
	}
	public void enterPIN(String pin)
	{
		this.pin.sendKeys(pin);
	}
	public void clickContinue()
	{
		submit.click();
	}
	public void clickForgot()
	{
		forgot.click();
	}
}
