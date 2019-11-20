package Modules;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class MyClkass2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:/vanjith/vanjith/Software files jars & exe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		String strng=driver.findElement(By.xpath("//*[@id='pt-anoncontribs']/a")).getText();
		System.out.println(strng);
		String strng1="Contributions";
		if(strng.equals(strng1))
		{
			System.out.println("Equal");
		}
		else
		{
		System.out.println(strng);
		}
		driver.navigate().back();
		driver.navigate().back();
		// Checking image is present or not
		driver.get("https://previewportal.ezidox.com/#/login");
		WebElement image=driver.findElement(By.xpath("/html/body/div[3]/section/div/div/div[1]/img"));
		Boolean imagesrc=(Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth!= \"undefined\" && arguments[0].naturalWidth>0",image);
		if(imagesrc)
		{
			System.out.println("Imgae is Present");
		}
		else
		{
			System.out.println("not ok");
		}
		
		//driver.get("https://previewapp.ezidox.com/#/login");
		FileInputStream file=new FileInputStream("D:/workspace/Kohli/src/test.properties");
		Properties prop=new Properties();
		//FileInputStream file1=FileInputStream("D:/workspace/Kohli/src/test.properties");
        prop.load(file);
		driver.get(prop.getProperty("url"));
        WebElement element =driver.findElement(By.cssSelector(prop.getProperty("imagerr")));
        Boolean image5=(Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth!=\"undefined\"&&arguments[0].naturalwidth>0", element);
		if(image5)
		{
        File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("D:\\vanji.png"));
		}
      
	}

	
	
}
