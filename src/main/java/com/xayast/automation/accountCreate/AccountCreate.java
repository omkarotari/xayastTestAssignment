package com.xayast.automation.accountCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreate {
	WebDriver dr;
	
	@FindBy(css="input#email_create")
	WebElement emailCreate;
	
	@FindBy(css="button#SubmitCreate")
	WebElement submitButton;
	
	public AccountCreate(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public void enterEmailId(String emailId) {
		try {
		emailCreate.sendKeys(emailId);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public AccountCreateAddInfo clickSubmitButton() {
		try {
			submitButton.click();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new AccountCreateAddInfo(dr);
		
	}
	
}
