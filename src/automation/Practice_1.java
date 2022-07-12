package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= Browser.openBrowser("https://vctcpune.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
	     driver.navigate().refresh();
	     //Thread.sleep(5000);
	     System.out.println("text is");
	     WebElement Header=driver.findElement(By.className("header1 font-weight-bold text-white text-center"));
	     System.out.println("text is");
	     System.out.println(Header.getText());

	}

}
