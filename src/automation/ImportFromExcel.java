package automation;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImportFromExcel 
{
//	enum FieldName
//	{
//		EMAILID,
//		TEMP,
//		PASSWORD;
//  
//		private final int value;
//
//		public String toString(int value)
//		{
//			
//			return Integer.toString(value);
//		}
//	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		String url = "https://www.facebook.com/";
		WebDriver driver = Browser.openBrowser(url);
		
		String[] arr = new String[11] ;
		for(int i = 0, j = 1; i<=2; i++)
		{
			String value = Parameterization.getData("Credentials", i, j);
			arr[i] = value;
			System.out.println(arr[i]);
		}
		//System.out.println(Arrays.toString(arr));
		
		//String emailIdVal = Parameterization.getData("Credentials", 0, 1);
		WebElement emailId = driver.findElement(By.xpath("//input[@name='email']"));
		emailId.sendKeys(arr[0]);
		
		//String passwordVal = Parameterization.getData("Credentials", 2, 1);
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(arr[2]);

	}

}
