package automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArrayListAL 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://vctcpune.com/";
		WebDriver driver = Browser.openBrowser(url);
		
		WebElement seleniumPractice = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumPractice.click();
		seleniumPractice.click();
		seleniumPractice.click(); 
		
		String homepage = driver.getWindowHandle();
		System.out.println(homepage);
		
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		int s = list.size();
		System.out.println(s);
		
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(2));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(3));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
//		String handle = list.get(0);//0 index---homepage
//		System.out.println(handle);
//		
//		String handle1 = list.get(1);//1 index---last clicked page
//		System.out.println(handle1);
//		
//		String handle2 = list.get(2);//2 index---second last clicked page
//		System.out.println(handle2);
//		
//		String handle3 = list.get(2);//3 index---first  clicked page
//		System.out.println(handle3);
	}

}
