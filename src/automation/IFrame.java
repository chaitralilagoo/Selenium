package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url = "http://demo.automationtesting.in/Frames.html";
		WebDriver driver = Browser.openBrowser(url);
		
		driver.manage().window().maximize();
		
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(singleFrame);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("velocity");
		
	
		
/*		
		WebElement multi = driver.findElement(By.xpath("//a[@href='#Multiple']"));
		multi.click();
		
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(firstFrame);
		
		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html'][1]"));
		driver.switchTo().frame(secondFrame);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("velocity");
		*/
	}

}
