package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Guru99_InsuranceBrokerSystem 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://demo.guru99.com/insurance/v1/register.php";
		WebDriver driver = Browser.openBrowser(url);
		
		WebElement title = driver.findElement(By.xpath("//select[@id='user_title']"));
		Select nameTitle = new Select(title);
		nameTitle.selectByValue("Lady");
				
		WebElement firstName = driver.findElement(By.xpath("//input[@id='user_firstname']"));
		firstName.sendKeys("Whistle");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='user_surname']"));
		lastName.sendKeys("Down");
		
		WebElement userPhone = driver.findElement(By.xpath("//input[@id='user_phone']"));
		userPhone.sendKeys("1234567890");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='year']"));
		Select birthYear = new Select(year);
		birthYear.selectByValue("1947");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='month']"));
		Select birthMonth = new Select(month);
		birthMonth.selectByVisibleText("August");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='date']"));
		Select birthDate = new Select(date);
		birthDate.selectByValue("15");
		
		WebElement licence = driver.findElement(By.xpath("//input[@value='Provisional']"));
		licence.click();
		
		WebElement period = driver.findElement(By.xpath("//select[@name='licenceperiod']"));
		Select licencePeriod = new Select(period);
		licencePeriod.selectByValue("11");
		
		WebElement occ = driver.findElement(By.xpath("//select[@name='occupation']"));
		Select occupation = new Select(occ);
		occupation.selectByVisibleText("Writer");
		
		WebElement addStreet = driver.findElement(By.xpath("//input[@name='street']"));
		addStreet.sendKeys("Featherington Street");
		
		WebElement addCity = driver.findElement(By.xpath("//input[@name='city']"));
		addCity.sendKeys("London");
		
		WebElement addCounty = driver.findElement(By.xpath("//input[@name='county']"));
		addCounty.sendKeys("Bridgerton");
		
		WebElement postCode = driver.findElement(By.xpath("//input[@name='post_code']"));
		postCode.sendKeys("EC3M");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("bridgerton3@netflix.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("123456789");
		
		WebElement conPassword = driver.findElement(By.xpath("//input[@name='c_password']"));
		conPassword.sendKeys("123456789");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		WebElement loginEmail = driver.findElement(By.xpath("//input[@name='email']"));
		loginEmail.sendKeys("bridgerton3@netflix.com");
		
		WebElement loginPassword = driver.findElement(By.xpath("//input[@name='password']"));
		loginPassword.sendKeys("123456789");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='submit']"));
		login.click();
		
	}
}
