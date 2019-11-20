package Modules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListElements {
	WebDriver driver;

	public ListElements(WebDriver driver)
	{
		this.driver=driver;
	}
	public void listelements() throws InterruptedException
	{
		WebElement ele=driver.findElement(By.id("gbwa"));
		WebDriverWait wait = new WebDriverWait (driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));	
		ele.click();
		Thread.sleep(4000);
	//List<WebElement> list=driver.findElements(By.className("gb_O"));
		List<WebElement> list=driver.findElements(By.id("//*[contains(@id, 'ogbkddg')]"));
		//List<WebElement> list=driver.findElements(By.cssSelector("#gbwa > div.gb_ca.gb_ba.gb_va.gb_da.gb_g.gb_ia"));
		//List<WebElement> list=driver.findElements(By.xpath("//*[@id="ogbkddg:d"]]"));
		//Xpath=//label[starts-with(@id,'message')] @id="ogbkddg
	System.out.println(list.size());
	try
	{
	for(WebElement ele2:list)
		//for(int i=0;i<list.size();i++)
	{
		System.out.println(ele2.getText());
//		if(ele2.getText().contains("Account"))
//				{
//			      ele2.click();
//			      return;
//				}
	}
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}
