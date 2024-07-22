package com.orange.hrm.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.orange.hrm.pages.HomePage;

public class HomePageTest extends BaseTest{
	
	@Test()
	public void logout() throws InterruptedException
	{
		HomePage homepage = new HomePage();
		//homePage.clickonAdminLink();
		homepage.logoutFromApplication();
		
	}

}
