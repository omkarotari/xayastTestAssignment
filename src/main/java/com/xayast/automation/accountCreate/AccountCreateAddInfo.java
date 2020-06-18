package com.xayast.automation.accountCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreateAddInfo {
	WebDriver dr;
	
	@FindBy(css="input#id_gender1")
	WebElement genderMale;
	
	@FindBy(css="input#uniform-id_gender2")
	WebElement genderFemale;
	
	@FindBy(css="input#customer_firstname")
	WebElement firstName;
	
	@FindBy(css="input#customer_lastname")
	WebElement lastName;
	
	@FindBy(css="select#days")
	WebElement days;
	
	@FindBy(css="select#months")
	WebElement months;
	
	@FindBy(css="select#years")
	WebElement years;
	
	@FindBy(css="input#firstname")
	WebElement firstNameAddress;
	
	@FindBy(css="input#lastname")
	WebElement lastNameAddress;
	
	@FindBy(css="input#company")
	WebElement company;
	
	
	public AccountCreateAddInfo(WebDriver dr) {
		this.dr =dr;
		PageFactory.initElements(dr, this);
	}
}
