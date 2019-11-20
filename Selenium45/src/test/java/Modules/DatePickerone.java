package Modules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatePickerone
{
  @Test
  public void Datepicker()
  {
	    System.setProperty("webdriver.chrome.driver", "D:/vanjith/vanjith/Software files jars & exe/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 50);
		WebElement element=driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		WebElement fromdate=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table"));
		/*driver.get("https://previewportal.ezidox.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 50);
		WebElement element=driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form/div[1]/input"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("v.ramasamy@lakeba.com");
		driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form/div[2]/input")).sendKeys("123456");
		Thread.sleep(8000);
		driver.findElement(By.xpath("")).click();*/
		
		List<WebElement> elements=fromdate.findElements(By.tagName("td"));
		for(WebElement ele:elements)
		{
			String value=ele.getText();
			if(value.equalsIgnoreCase("25"))
			{
				ele.click();
			}
			
		}
		driver.findElement(By.xpath("//*[@id='search']/div/div[4]/div/label")).click();
		WebElement todate=driver.findElement(By.xpath("//*[@id='rb-calendar_return_cal']/table/tbody"));
		List<WebElement> elements1=todate.findElements(By.tagName("td"));
		for(WebElement ele1:elements1)
		{
			String value1=ele1.getText();
			if(value1.equalsIgnoreCase("31"))
			{
				ele1.click();
			}
			
		}
  }
}
