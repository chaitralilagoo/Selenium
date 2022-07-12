package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMove 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://www.amazon.in/";
		WebDriver driver = Browser.openBrowser(url);
		Actions action = new Actions(driver);//action is class
		
		WebElement signIn = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		action.moveToElement(signIn);//creating action
		//Actions s = action.moveToElement(signIn);//actions is an interface
		action.perform();

	}//a[@data-nav-ref='nav_ya_signin']

}
