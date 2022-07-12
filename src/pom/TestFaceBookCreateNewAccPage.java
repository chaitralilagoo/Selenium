package pom;

import org.openqa.selenium.WebDriver;

import automation.Browser;

public class TestFaceBookCreateNewAccPage 
{
	public void createNewAcc() throws InterruptedException
	{
		String url = "https://www.facebook.com/";
		WebDriver driver = Browser.openBrowser(url); 
		
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

	public static void main(String[] args) throws InterruptedException 
	{
		TestFaceBookCreateNewAccPage testFaceBookCreateNewAccPage = new TestFaceBookCreateNewAccPage();
		testFaceBookCreateNewAccPage.createNewAcc();

	}

}
