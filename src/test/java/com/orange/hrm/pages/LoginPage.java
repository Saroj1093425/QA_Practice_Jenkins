package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;


public class LoginPage {
	
	@FindBy(name = "username")
	WebElement userNameTextBox;
	
	
	@FindBy(name = "password")
	WebElement passwordTextBox;
	
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	
	Logger log = LogManager.getLogger(LoginPage.class);
	
	
	public void loginToApplication(String username,String password) throws InterruptedException
	{
		userNameTextBox.sendKeys(username);
		log.info("User has entered the Username.");
		
		passwordTextBox.sendKeys(password);
		log.info("User has entered the Password.");
		
		loginBtn.click();
		log.info("User has clicked on Submit button");
	}
}




