package com.orange.hrm.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginWithValidUserNameAndValidPassword() throws InvalidFormatException, IOException, InterruptedException
	{
		LoginPage loginPage = new LoginPage();
		//loginPage.loginToApplication("Admin","admin123");

		// Excel POI
		
		/*
		 * 
		for(int i=0;i<5;i++)
		{
			loginPage.loginToApplication(ExcelUtility.getTestData(i+1,0),ExcelUtility.getTestData(i+1,1));
		}
		*/
		
		loginPage.loginToApplication(PropertiesUtility.getData("username"),PropertiesUtility.getData("password"));
	}
}