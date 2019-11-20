package TrainingSession;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Modules.ListElements;
import Modules.LoginModule;
import Modules.MyProfile;


public class TestngMain {
	public WebDriver driver;
	//@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "Browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
	}
	//@Test(priority=3)
	public void login() throws InterruptedException, AWTException {
		LoginModule lm=new LoginModule(driver);
		lm.Loginscreen();
		Thread.sleep(2000);
		MyProfile mp=new MyProfile(driver);
		mp.myprofile();
	}
	//@Test(priority=1)
	public void listElement() throws InterruptedException {
		ListElements lm=new ListElements(driver);
		lm.listelements();
	}
	//@Test(priority=2)
	public void TakeScreenshot() throws IOException 
	{
		Modules.TakeScreenshot tss=new Modules.TakeScreenshot(driver);
		tss.takeScreenshot();
	}
	//@Test(priority=3)
	public void TakeScreenshot2() throws IOException 
	{
		System.out.println("hi test");
	}
	//@Test
	public void GetAlllinksandclick() throws InterruptedException
	{
		Modules.GetAlllinksandclick gc=new Modules.GetAlllinksandclick(driver);
		gc.getAlllinksandClick();
	}
	//@AfterTest()
		public void QuitBrowser() throws IOException, InterruptedException
		{
		    Thread.sleep(4000);
			driver.close();
		}
}
