package Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAlllinksandclick {

	WebDriver driver;

	public GetAlllinksandclick(WebDriver driver)
	{
		this.driver=driver;
	}
	public void getAlllinksandClick() throws InterruptedException
	{ 
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebDriverWait wait = new WebDriverWait (driver, 30);
		WebElement ele=driver.findElement(By.xpath("//*[@id='drag1']"));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		WebElement ele2=driver.findElement(By.xpath("//*[@id='div2']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(ele, ele2);
		//drag and drop
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(ele));
//		List<WebElement> list=driver.findElements(By.tagName("a"));
//		System.out.println(list.size());
//		for(WebElement ele1:list)
//		{
//			System.out.println(ele1.getText());
//			ele1.click();
//			Thread.sleep(7000);
//			ele.click();
//			wait.until(ExpectedConditions.elementToBeClickable(ele));
//		}
		
	}

}

