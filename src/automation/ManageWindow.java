package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class ManageWindow
{
	public static void ManageMethods(WebDriver driver)
	{
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
//		//manage is method of webdriver which returns complete interface of Option
//		//window is method of manage which returns complete interface of Window
//		//maximize is method of Window interface		
		
		
		
		Dimension d = new Dimension(500, 200);
		
		driver.manage().window().setSize(d);
		
		Point p = new Point(100,50);
		driver.manage().window().setPosition(p);
		
	}
}
