package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyClass {

@Test
	public void mouseevent() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:/vanjith/vanjith/Software files jars & exe/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://previewportal.ezidox.com/#/login");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form/div[1]/input")).sendKeys("v.ramasamy@lakeba.com");
	driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form/div[2]/input")).sendKeys("123456");
	driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form/div[3]/button")).click();
	 Thread.sleep(8000);

	driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/navbar/div/div/div/div/div/ul/li[3]/a")).click();
	driver.findElement(By.xpath("//*[@id='settings']/a")).click();
	driver.findElement(By.xpath("//*[@id='2029']/div[3]/button[1]/span")).click();
	Thread.sleep(8000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)", "");
	Thread.sleep(8000);
	//WebElement source=driver.findElement(By.xpath("//*[@id='6404']"));
	//WebElement destination=driver.findElement(By.xpath("//*[@id='dropArea_0']"));
	//Actions action=new Actions(driver);
	//action.doubleClick(source).dragAndDrop(source, destination);
	//action.dragAndDrop(source, destination);
	//Thread.sleep(8000);
	jse.executeScript("window.scrollBy(0,-250", "");
	}
//@Test
public void mouseevent1() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:/vanjith/vanjith/Software files jars & exe/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.acer.com/ac/en/US/content/group/laptops");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

Actions action=new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("/html/body/div[5]/header/div/div/div/div/div[2]/div[3]/ul/li[2]/a"))).build().perform();
action.moveToElement(driver.findElement(By.xpath("/html/body/div[5]/header/div/div/div/div/div[2]/div[3]/ul/li[2]/div/div/div[1]/nav/ul/li[1]/a"))).build().perform();
System.out.println("Key down Event");
action.sendKeys(Keys.ARROW_DOWN).build().perform();
action.sendKeys(Keys.ARROW_DOWN).build().perform();
action.sendKeys(Keys.ARROW_DOWN).build().perform();
System.out.println("Key Up Event");
Thread.sleep(4000);
action.sendKeys(Keys.ARROW_UP).build().perform();
System.out.println("Keys Right Click Event");
Thread.sleep(4000);
action.contextClick().build().perform();

}
}
