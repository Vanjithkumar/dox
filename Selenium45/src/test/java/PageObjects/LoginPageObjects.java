package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects 
{
	WebDriver driver;
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="/html/body/div[1]/section/div[1]/div/form/div[1]/input")
    public WebElement username;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/section/div[1]/div/form/div[2]/input")
    public WebElement password;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/section/div[1]/div/form/div[3]")
    public WebElement SIGNIN;
}
