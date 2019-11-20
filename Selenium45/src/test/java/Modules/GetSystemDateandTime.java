package Modules;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSystemDateandTime {

	public static void main(String[] args) throws ParseException 
	{
	/*	System.setProperty("webdriver.chrome.driver", "D:/vanjith/vanjith/Software files jars & exe/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	*/	
		//Get System date
		
		DateFormat dateformat=new SimpleDateFormat("dd:mm:yyyy HH:mm:ss");
		DateFormat dateformat1=new SimpleDateFormat("DD:MM:YYYY mm:ss:hh");
		Date date=new Date();
		System.out.println(date);
		System.out.println("Today's date is :"+dateformat.format(date));
		System.out.println("Today's date is :"+dateformat1.format(date));
        
	}

}
