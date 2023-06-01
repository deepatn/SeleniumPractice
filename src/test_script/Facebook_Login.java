package test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic_script.BaseTest;
import generic_script.Data_Driven;
import pom_script.Pom;

public class Facebook_Login extends BaseTest
{
	@Test
	public void test1() throws EncryptedDocumentException, IOException 
	{
		String un = Data_Driven.fetchData("Sheet1",0,0);
		String pass = Data_Driven.fetchData("Sheet1", 0, 1);
		Pom pom = new Pom(driver);
		pom.username(un);
		pom.password(pass);
		pom.loginBtn();
	}
}
