package Modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudyTestNg {
	WebDriver driver;
	@BeforeTest
	public void login() throws InterruptedException
	{
		
		System.out.println("- --- -- Running Before Test---------");
		Thread.sleep(3000);
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
	@AfterTest
	public void quit() throws InterruptedException
	{
		System.out.println("- --- -- Running After Test---------");
		Thread.sleep(4000);
		driver.quit();
	}
	@BeforeMethod
	public void checkhomepagebutton() throws InterruptedException
	{
		System.out.println("- --- -- Running Before Method---------");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		if(driver.findElement(By.id("hplogo")).isDisplayed())
		{
			System.out.println("Url of current page"+driver.getCurrentUrl());
		}
	}
	@Test (priority = 0)
	public void search() throws InterruptedException
	{
		System.out.println("- --- -- Running Test1 ---------");
		Thread.sleep(3000);
		driver.get("https://www.ezidox.com");
	}
	@AfterMethod
	public void clickhomepagebutton() throws InterruptedException
	{
		System.out.println("- --- -- Running After method ---------");
		Thread.sleep(3000);
		driver.get("https://www.google.co.in");
		
	}
	@Test(priority = 1)
	public void search1() throws InterruptedException
	{
		System.out.println("- --- -- Running Test2 ---------");
		Thread.sleep(3000);
		driver.get("https://www.espncricinfo.com/");
	}

}
