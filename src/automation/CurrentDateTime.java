package automation;
import java.time.format.DateTimeFormatter;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import java.time.LocalDateTime; 

public class CurrentDateTime 
{
   
	public static String currentDateTime()
	{
		

	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("-yyyy-MM-dd_HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   
	   return (dtf.format(now));
	   //System.out.println(dtf.format(now));  
	}
}
