package zerodha.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMForgotUserIdPass 
{
	@FindBy (xpath="") private WebElement rememberUserID;
	@FindBy (xpath="") private WebElement rememberPass;
	
	public POMForgotUserIdPass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickRememberUserID()
	{
		rememberUserID.click();
	}
	
}

