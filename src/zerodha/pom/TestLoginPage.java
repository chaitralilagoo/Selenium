package zerodha.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import automation.Browser;
import automation.ScreenShot;

import org.testng.annotations.*;

public class TestLoginPage
{
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() throws InterruptedException 
	{
		String url = "https://kite.zerodha.com/";
		driver = Browser.openBrowser(url);
	}
	@Test
	public void LoginPage() throws InterruptedException
	{	
		POMLogin pomLogin = new POMLogin(driver);
		pomLogin.enterUserId("OKP335");
		pomLogin.enterPassword("QAZ123456");
		pomLogin.clickLogIn();
		Thread.sleep(2000);
		pomLogin.enterPIN("456789");
		pomLogin.clickContinue();
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		ScreenShot.takeScreenShot(driver, "ZerodhaLoginPage");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
//	public static void main(String[] args) throws InterruptedException
//	{
//		TestLoginPage testLoginPage = new TestLoginPage();
//		testLoginPage.LoginPage();
//
//	}

}
