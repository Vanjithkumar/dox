package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
       // driver.get("https://www.espncricinfo.com/");
       WebDriverWait wait=new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.id("hplogo")), ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-containe']/div/section[1]/article[1]/div/ul/li[2]/a/div[2]/span"))));
       driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
      // driver.findElement(By.xpath("//*[@id='main-containe']/div/section[1]/article[1]/div/ul/li[2]/a/div[2]/span")).click();
	}
}
