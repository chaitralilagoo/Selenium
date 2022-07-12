package automation;
import java.awt.Desktop.Action;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MockMouseActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		String url = "https://www.amazon.in/";
		WebDriver driver = Browser.openBrowser(url);
		Actions act = new Actions(driver);//actions is class
		
		WebElement hoverOverSignIn = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		act.moveToElement(hoverOverSignIn);//creating action
//		Actions moreAct = act.moveToElement(hoverOverSignIn).click().doubleClick();
//		Action act2 = moreAct.build();//action is an interface
		act.perform();
		
		
		WebElement memberShip = driver.findElement(By.xpath("//span[text()='Your Prime Membership']"));
		act.moveToElement(memberShip);
//		act.click(signIn);
		act.perform();
		
	}

}
