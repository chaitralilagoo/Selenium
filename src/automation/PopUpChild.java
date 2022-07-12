package automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 

public class PopUpChild 
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
		System.out.println(homepage) ;
		//
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i = handles.iterator();
		//0 1 2 3
//		String handle1 = i.next();//i++
//		System.out.println(handle1);
//		String handle2 = i.next();
//		System.out.println(handle2);
//		String handle3 = i.next();
//		System.out.println(handle3);
		
		while(i.hasNext())//0 1 2 3
		{
			String handle = i.next();//page id//i = 1  newtab1 CDwindow-AF5B1DDfhjhkj454
			driver.switchTo().window(handle);//homepage
			String currentTitle = driver.getTitle();//homepage: velocity// Practice Page
			if(currentTitle.equals("Practice Page"))// velocity == Practice Page
			{
				WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
				radio2.click();
			}
		}
		
		
		//driver.switchTo().window(handle1);

		

	}

}
