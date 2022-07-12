package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		String url = "https://vctcpune.com/selenium/practice.html";
		WebDriver driver = Browser.openBrowser(url);
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dd = new Select(dropDown);
//		driver.navigate().refresh();
//		Thread.sleep(1000);
		dd.selectByIndex(2);
		
//		Thread.sleep(1000);
//		dd.deselectByIndex(2);
//		Thread.sleep(5000);
//		dd.click();
	}

}
