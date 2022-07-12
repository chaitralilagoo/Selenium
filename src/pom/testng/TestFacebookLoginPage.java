package pom.testng;
import automation.Browser;
import automation.ScreenShot;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import org.testng.annotations.*;
public class TestFacebookLoginPage 
{
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() throws InterruptedException 
	{
		String url = "https://www.facebook.com/";
		driver = Browser.openBrowser(url);
	}
	@Test
	public void facebookLoginTestPage() throws InterruptedException 
	{		
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("Velocity");
		facebookLoginPage.enterPassword("Speed");
		facebookLoginPage.clickOnLogin();
	
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		ScreenShot.takeScreenShot(driver, "FacebookLoginPage");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
//	public static void main(String[] args) throws InterruptedException 
//	{
//		TestFacebookLoginPage facebookTestPage = new TestFacebookLoginPage();
//		facebookTestPage.facebookLoginTestPage();
//	}

}
