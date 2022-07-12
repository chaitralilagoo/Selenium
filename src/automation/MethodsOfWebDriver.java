package automation;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class MethodsOfWebDriver
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		String url = "https://the-internet.herokuapp.com/javascript_alerts";//"https://www.amazon.com/";
		WebDriver driver = Browser.openBrowser(url);
		
		Thread.sleep(5000);
		String title = driver.getTitle();
		//String dateTime  = ScreenShot.currentDateTime();
		//ScreenShot.takeScreenShot(driver, "Snippet30" );//,dateTime);//(driver,title);//,dateTime);
			
//		String title = driver.getTitle();
//		System.out.println(title);

		
		
//		NavigateMethod.navigationLib(url, driver);
//		
//		ManageWindow.ManageMethods(driver);
		
//		 		
//		String currurl = driver.getCurrentUrl();
//		System.out.println(currurl);
//				
//		driver.manage().window().maximize();//.window().maximize();
//				//manage is method of webdriver which returns complete interface of Option
//				//window is method of manage which returns complete interface of Window
//				//maximize is method of Window interface
//				
//		driver.manage().window().minimize();
//		Dimension d = new Dimension(500, 200);
//		
//		driver.manage().window().setSize(d);
//		
//		Point p = new Point(100,50);
//		driver.manage().window().setPosition(p);
//		
//		driver.close();
//		String titleToCheck = "flipkart";
		
//		if(title.equalsIgnoreCase(titleToCheck))
//			System.out.println("Pass");
//		else
//			System.out.println("Fail");
		
	}

}



