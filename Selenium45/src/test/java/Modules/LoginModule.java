package Modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginPageObjects;

public class LoginModule { 
	WebDriver driver;

public LoginModule(WebDriver driver)
{
	this.driver=driver;
}
public void Loginscreen() throws InterruptedException
{
	driver.get("https://previewportal.ezidox.com");
	LoginPageObjects lpo=PageFactory.initElements(driver, LoginPageObjects.class);
	WebDriverWait wait = new WebDriverWait (driver, 50);
	wait.until(ExpectedConditions.elementToBeClickable(lpo.username));
	lpo.username.sendKeys("adminstg@lakeba.com");
	lpo.password.sendKeys("Testing@12");
	Thread.sleep(3000);
	lpo.SIGNIN.click();
	Thread.sleep(10000);
}
}
