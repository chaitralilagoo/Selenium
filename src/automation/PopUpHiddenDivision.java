package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PopUpHiddenDivision 
{
	public static void main(String[] args) throws InterruptedException 
	{

		String url = "https://www.facebook.com/";
		WebDriver driver = Browser.openBrowser(url);
		
		WebElement createAcc = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createAcc.click();
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
  		firstName.sendKeys("Chaitrali");
	
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Lagoo");
		
		WebElement emailID = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailID.sendKeys("chaitrali@facebook.com");
		//confirm emailID
		Thread.sleep(5000);
		WebElement reEntEmailID = driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		reEntEmailID.sendKeys("chaitrali@facebook.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passWord.sendKeys("facebooktest123");
		
		//select[@aria-label='Day']
		WebElement birthDay = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select day = new Select(birthDay);
		day.selectByValue("22");
		
		WebElement birthMonth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select month = new Select(birthMonth);
		month.selectByValue("6");
		
		WebElement birthYear = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select year = new Select(birthYear);
		year.selectByValue("1995");	
		
		WebElement gender = driver.findElement(By.xpath("(//label[text()='Female'])"));
		gender.click();
		boolean result = gender.isSelected();
		System.out.println(result);
		
//		List<WebElement> test = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
//		test.get(1).click();
//		for(int i = 0; i<test.size();i++)
//		{
//			System.out.println(test.get(i));
//		}
		
		WebElement signUp = driver.findElement(By.xpath("(//button[text()='Sign Up'][1])"));
		//boolean result = gender.isSelected();
		//System.out.println(result);
		Thread.sleep(5000);
		signUp.click();
	}

}
