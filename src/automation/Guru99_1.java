package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99_1
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		String url = "https://demo.guru99.com/test/radio.html";
		WebDriver driver = Browser.openBrowser(url);		
		//"https://demo.guru99.com/Agile_Project/Agi_V1/";//
		WebElement agilePro = driver.findElement(By.xpath("//a[text()='Agile Project']"));
		agilePro.click();
				
 		Thread.sleep(10000);
 		//driver.navigate().refresh();
 		
		WebElement uID = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/input"));
		uID.sendKeys("1303");
		
		WebElement uPassword = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		uPassword.sendKeys("Guru99");
		
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input"));
		login.click();
		
	}
}
