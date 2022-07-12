package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = Browser.openBrowser(url);
		
		Actions action = new Actions(driver);
		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iFrame);
		
		
		List<WebElement> images = driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content ui-corner')]"));
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		for(int i = 0; i<images.size();i++)//i=0 i=1
		{
			WebElement image = images.get(i);
			Thread.sleep(2000);
			action.dragAndDrop(image, trash);
			action.perform();
		}
		Thread.sleep(5000);
		
		List<WebElement> recycle = driver.findElements(By.xpath("//a[@title='Recycle this image']"));
		for(int i = 0; i<recycle.size();i++)
		{
			WebElement recycleImage = recycle.get(i);
			recycleImage.click();
			Thread.sleep(2000);
			
//			action.dragAndDrop(image, trash);
//			action.perform();
		}
		
		driver.close();
	}

}
