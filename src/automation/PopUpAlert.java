package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpAlert 
{
	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://the-internet.herokuapp.com/javascript_alerts";//"https://www.amazon.com/";
		WebDriver driver = Browser.openBrowser(url);
		WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick = 'jsPrompt()']"));
		jsPrompt.click();

		Alert a = driver.switchTo().alert();
	
//		a.accept();
//		a.dismiss();
		a.sendKeys("Velocity");
		a.accept();
//		String text = a.getText();
//		System.out.println(text);//I am a JS prompt
	}
}
