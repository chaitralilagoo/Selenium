package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://demo.guru99.com/test/web-table-element.php";
		WebDriver driver = Browser.openBrowser(url);
		
		WebElement preClose = driver.findElement(By.xpath("//table//tbody//tr[6]//td[3]"));
		 System.out.println(preClose.getText());
		 
		 List <WebElement> header = driver.findElements(By.xpath("//table//thead//tr//th"));
		 int noOfColumn = header.size();
		 System.out.println(noOfColumn);
		 for(int i = 0; i< noOfColumn; i++)
		 {
			 System.out.println(header.get(i).getText());
		 }
		 
		 List <WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
		 int noOfRows = row.size();
		 System.out.println(noOfRows);
		 
		 for(int i = 0; i<noOfRows; i++)
		 {
			 WebElement currPrice = driver.findElement(By.xpath("//table//tbody//tr["+"i"+"]//td[4]"));
			 String price = currPrice.getText();
		 }
		//table//thead//tr
		
	}

}
