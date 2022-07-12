package pom.testng;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import automation.Browser;
import automation.ScreenShot;
import org.testng.annotations.*;

public class TestFaceBookCreateNewAccPage 
{
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() throws InterruptedException
	{
		String url = "https://www.facebook.com/";
		driver = Browser.openBrowser(url);
	}
	@Test
	public void createNewAcc() throws InterruptedException
	{
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		facebookLoginPage.clickOnCreateNewAccount();
		Thread.sleep(2000);
		FacebookCreateNewAccPage facebookCreateNewAccPage = new FacebookCreateNewAccPage(driver);
		facebookCreateNewAccPage.enterFirstName("Chaitrali");
		facebookCreateNewAccPage.enterLastName("Lagoo");
		facebookCreateNewAccPage.enterEmailId("chaitrali@facebook.com");
		facebookCreateNewAccPage.reEnterEmailId("chaitrali@facebook.com");
		facebookCreateNewAccPage.enterPassword("facebook123");
		facebookCreateNewAccPage.selectBirthDate("6");
		facebookCreateNewAccPage.selectBirthMonth("10");
		facebookCreateNewAccPage.selectBirthYear("1994");
		//facebookCreateNewAccPage.clickGender(2, 1);
		facebookCreateNewAccPage.clickMaleGender();
		facebookCreateNewAccPage.clickSignIn();
		
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		ScreenShot.takeScreenShot(driver, "FaceBookCreateNewAccPage");
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
//	public static void main(String[] args) throws InterruptedException 
//	{
//		TestFaceBookCreateNewAccPage testFaceBookCreateNewAccPage = new TestFaceBookCreateNewAccPage();
//		testFaceBookCreateNewAccPage.createNewAcc();
//
//	}

}
