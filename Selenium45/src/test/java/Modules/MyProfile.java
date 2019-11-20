package Modules;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProfile {
	WebDriver driver;

	public MyProfile(WebDriver driver)
	{
		this.driver=driver;
	}
	public void myprofile() throws InterruptedException, AWTException
	{
		WebDriverWait wait = new WebDriverWait (driver, 30);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/navbar/div[1]/div/div/div/div/ul/li[3]")).click();
	Thread.sleep(3000);
	List<WebElement> list=driver.findElements(By.tagName("a"));
    for(WebElement ele:list)
    {
    	if(ele.getText().contentEquals("My Profile"))
    	{
    		ele.click();
    	}
    }
    Thread.sleep(5000);
    WebElement profile=driver.findElement(By.xpath("//*[@id='userImage']"));
    wait.until(ExpectedConditions.elementToBeClickable(profile));
    profile.click();
    Thread.sleep(3000);
    StringSelection selection=new StringSelection("C:\\Users\\VanjithkumarRamasamy\\Pictures\\test.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Robot robot=new Robot();
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='cropModal']/div/div/div[3]/button")).click();;
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='profile']/div/form/div/div[4]/button")).click();;
	wait.until(ExpectedConditions.elementToBeClickable(profile));
    
	}
}
