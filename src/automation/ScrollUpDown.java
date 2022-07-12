package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class ScrollUpDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://vctcpune.com/";//"https://vctcpune.com/selenium/practice.html";
		WebDriver driver = Browser.openBrowser(url);
		WebElement practice = driver.findElement(By.xpath("//input[@name='show-hide']"));//(By.xpath("//legend[text()='Element Displayed Example']"));
		
		//WebElement katrajBranch = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		//katrajBranch.click();
		//Scroll up down
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", practice);
		//Scroll up down (by location)
		//((JavascriptExecutor)driver).executeScript(("window.scrollBy(200,300)"));
		//sendkeys using java script?
		//((JavascriptExecutor)driver).executeScript("arguments[0].value='hello';", practice);
	}
}
