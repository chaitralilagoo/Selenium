package automation;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
//import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod
{

	public static void navigationLib(String s, WebDriver driver) throws InterruptedException 
	{
		
		//to use all methods from navigate
		//driver.navigate().to(s);
		
//		Navigation nav = driver.navigate();
//		nav.back();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();

	}
}
