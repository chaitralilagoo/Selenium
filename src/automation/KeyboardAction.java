package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://demoqa.com/text-box";
		WebDriver driver = Browser.openBrowser(url);
		Actions act = new Actions(driver);
		WebElement userName = driver.findElement(By.xpath("//input[@id = 'userName']"));
		userName.sendKeys("Chaitrali Lagoo");
		
		act.sendKeys(Keys.TAB);
		act.sendKeys("chaitrali@pune.com");
		act.build().perform();
		
		act.sendKeys(Keys.TAB);
		act.sendKeys("Katraj Pune Maharashtra");
		act.build().perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
//		act.build().perform();
		
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.sendKeys(Keys.TAB);
		//act.click();
//		act.perform();
//		act.keyDown(Keys.ENTER);
//		act.keyUp(Keys.ENTER);
		//Thread.sleep(2000);
		act.sendKeys(Keys.ENTER);
		act.build().perform();
	}

}
