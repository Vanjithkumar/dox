package Modules;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePath {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:/vanjith/vanjith/Software files jars & exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.pdfonline.com/pdf-to-word-converter/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		StringSelection ss=new StringSelection("C:\\Users\\Lakeba-004\\Downloads\\Passbook.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r = new Robot();
	  
	    r.keyPress(KeyEvent.VK_CONTROL);    
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

}
