package pom_script;

import org.bouncycastle.oer.its.PublicVerificationKey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(id = "email")
	private WebElement un;
	
	@FindBy(id = "pass")
	private WebElement pwd;
	
	@FindBy(name = "login")
	private WebElement btn;
	
	public Pom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String value1)
	{
		un.sendKeys(value1);
	}
	
	public void password(String value2) 
	{
		pwd.sendKeys(value2);
	}
	
	public void loginBtn() 
	{
		btn.click();
	}
}
