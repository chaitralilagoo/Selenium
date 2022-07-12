package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfWebElement 
{

	public static void main(String[] args) throws InterruptedException 
	{		
		// sendKeys()
		// click()
		// isSelected() // returns bool // check if element is selected
		
		String url = "https://vctcpune.com/selenium/practice.html";
		WebDriver driver = Browser.openBrowser(url);
		
		//radio button
		WebElement radio2 = driver.findElement(By.xpath("(//input[@value = 'Radio2'])"));
		boolean result = radio2.isSelected();
		System.out.println(result);
		
		radio2.click();
		
		boolean result1 = radio2.isSelected();
		System.out.println(result1);
		
		//hide show tab
		WebElement hideshow = driver.findElement(By.xpath("(//input[@id='displayed-text'])"));
		//hideshow.sendKeys("Hello");		
		//Thread.sleep(3000);
		//hideshow.clear();
		System.out.println(hideshow.isEnabled());
		
		Thread.sleep(3000);
		WebElement hide = driver.findElement(By.xpath("(//input[@id='hide-textbox'])"));
		hide.click();
		
		System.out.println(hideshow.isDisplayed());
		
	}
}
