package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators 
{
	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://www.facebook.com/";
		WebDriver driver = Browser.openBrowser(url);
		
		//xpath by attribute
		// tagname[@attribute="attribute_value"]
//		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
//		email.sendKeys("velocity");
		
		//xpath by text
		// tagname[text()='text']
//		WebElement fp = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		fp.click();

		
		//xpath bv index
		// tagname[text()='text'][position_no]
		
		//xpath bv contains
		// tagname[contains[@attribute_name,'partial_attribut_value']()]
//		WebElement forgot = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/')]"));
//		forgot.click();
		
		WebElement email1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		email1.sendKeys("velocity");
		//forgot.click();
		//html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input
		
		//absolute xpath
		//relative xpath
		
/*		
		WebElement login = driver.findElement(By.tagName("button"));
		//duplicatr
		//login.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Velocity");//sendKeys is use to enter values in webpage field
		// not prasent everywhere
		//class name duplicate
		//css
		//linktext text no present everywhere
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Speed");
		
		//tag_name [attribute = attribute_value]
		WebElement createNewAcc = driver.findElement(By.cssSelector("a[data-testid = 'open-registration-form-button']"));
		createNewAcc.click();
*/
	}

}
