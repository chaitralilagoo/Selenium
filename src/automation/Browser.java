package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser 
{

	public static WebDriver openBrowser(String s) throws InterruptedException 
	{
/*		
		// lunching browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//hitting URL 
		driver.get(s);
		
		driver.manage().window().maximize();
		return driver;
*/		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get(s);
		
		driver.manage().window().maximize();
		return driver;
	}
}
