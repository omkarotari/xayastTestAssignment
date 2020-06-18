package com.xayast.automation.landingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xayast.automation.accountCreate.AccountCreate;

public class LandingPage {
	WebDriver dr;
	
	@FindBy(css="a.login")
	WebElement signInButton;
	
	
	public LandingPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public AccountCreate clickOnSignInButton() {
		try {
			signInButton.click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new AccountCreate(dr);
	}

}
