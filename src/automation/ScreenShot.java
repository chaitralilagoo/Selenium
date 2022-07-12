package automation;
import java.io.File;
import java.io.IOException;
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.TimeZone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	public static void screenshotTime()
	{ 
//		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
//
//		SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MMM-yyhh:mm-aa");
//		Date date = new Date();
//		Calendar c =Calendar.getInstance();
//		c.setTime(date);
//		String cd = dateFormat.format(date);
//		String interviewScheduleDate=(dateFormat.format(c.getTime()));
//
//		return interviewScheduleDate;
	}
	public static String currentDateTime()
	{
		

	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   
	   return (dtf.format(now));
	   //System.out.println(dtf.format(now));  
	}
//(WebDriver driver,String title) 
	public static void takeScreenShot (WebDriver driver, String s)/*, String dt)*/ throws InterruptedException, IOException 
	{
		//TakesScreenshot ed = new ChromeDriver();
//		String url = "https://vctcpune.com/";
//		WebDriver driver = Browser.openBrowser(url);
		//ChromeDriver cd = new ChromeDriver();
		String dt = date();//currentDateTime();//
		String name = "hi";
						//interface		//interface------------implemented by chromedriver class
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println("F:\\Velocity\\screeshot\\"+ s +".png");//+ s + dt + ".png");
		System.out.println(dt);
		File destination = new File("F:\\Velocity\\screeshot\\" + s + dt + ".png");//hello1.png");//"+ s + dt + ".png");
		
		FileHandler.copy(source, destination);
	}
	public static String date()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime currentTime = LocalDateTime.now();
		String d = dtf.format(currentTime);
		return d;
	}
	


}
