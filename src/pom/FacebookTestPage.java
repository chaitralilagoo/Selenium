package pom;
import automation.Browser;
import org.openqa.selenium.WebDriver;

public class FacebookTestPage 
{

	public void facebookLoginTestPage() throws InterruptedException 
	{
		String url = "https://www.facebook.com/";
		WebDriver driver = Browser.openBrowser(url);
		
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("Velocity");
		facebookLoginPage.enterPassword("Speed");
		facebookLoginPage.clickOnLogin();
	
	}
	public static void main(String[] args) throws InterruptedException 
	{
		FacebookTestPage facebookTestPage = new FacebookTestPage();
		facebookTestPage.facebookLoginTestPage();
	}

}
