package generic_script;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements FrameworkConstant
{
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty(gecko_key, gecko_value);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}
}
