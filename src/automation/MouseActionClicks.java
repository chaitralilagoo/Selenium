package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionClicks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		WebDriver driver = Browser.openBrowser(url);
		Actions action = new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightClick);
		action.perform();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.contextClick(doubleClick);
		
		action.perform();	
	}
	
}
