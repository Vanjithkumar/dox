package Modules;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	WebDriver driver;
	public TakeScreenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	public void takeScreenshot() throws IOException
	{
		TakesScreenshot tss=((TakesScreenshot)driver);
		File src=tss.getScreenshotAs(OutputType.FILE);
		File des=new File("ScreenShot/new.jpg");
		FileUtils.copyFile(src, des);
//		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File("ScreenShot/new.jpg"));
	}

}
