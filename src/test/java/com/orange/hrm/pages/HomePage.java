package com.orange.hrm.pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orange.hrm.test.BaseTest;

public class HomePage {
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminLink;
	
	@FindBy(xpath = "//img[@alt=\"profile picture\"]")
	WebElement profilePicture;
	
	@FindBy(linkText = "Logout")
	WebElement logoutLink;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	Logger log = LogManager.getLogger(HomePage.class);
	
	public void clickonAdminLink()
	{
		adminLink.click();
		log.info("User has clicked on Admin Button");
	}
	
	public void logoutFromApplication() 
	{
		
		/*
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(profilePicture)).click();
		
		// Wait for the logout link to be visible and then click it
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
		
		
		*/
		profilePicture.click();
		log.info("User has clicked on Profile Picture.");
		logoutLink.click();
		log.info("User has clicke on Logout Button.");
	}
}


