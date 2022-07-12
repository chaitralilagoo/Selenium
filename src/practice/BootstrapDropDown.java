package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.Browser;

public class BootstrapDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://www.hdfcbank.com/";
		WebDriver driver = Browser.openBrowser(url);
		//Thread.sleep(5000);
		WebElement ptype = driver.findElement(By.xpath("//div[@class='drp1']"));
		//(By.xpath("//div[@class='dropdown']//a[text()='Select Product Type']"));
		ptype.click();
		
		List<WebElement> pList = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		//ul[@class='dropdown1 dropdown-menu']//li
		BootstrapDropDown.selectFromDropdown(pList, "EMI");
		
		WebElement product = driver.findElement(By.xpath("//div[@class='drp2']"));
		product.click();
		List<WebElement> proList = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		BootstrapDropDown.selectFromDropdown(proList, "Lifestyle");
//		for(WebElement option:pList)
//		{
//			if(option.getText().equalsIgnoreCase("Loans"))
//			{
//				option.click();
//			}
//		}
	}

	public static void selectFromDropdown(List <WebElement> pList, String val)
	{
		for(WebElement option:pList)
		{
			if(option.getText().equalsIgnoreCase(val))
			{
				option.click();
			}
		}
	}
}
