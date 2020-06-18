package com.xayast.automation.accountCreate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.xayast.automation.accountDashboard.AccountDashboard;

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
	
	@FindBy(css="input#email")
	WebElement email;
	
	@FindBy(css="input#passwd")
	WebElement passwd;
	
	
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
	
	@FindBy(css="input#address1")
	WebElement address1;
	
	
	@FindBy(css="input#city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement stateDropDown;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="id_country")
	WebElement countryDropDown;
	
	@FindBy(id="phone_mobile")
	WebElement mobileNo;
	
	@FindBy(id="alias")
	WebElement addressAlias;
	
	@FindBy(id="submitAccount")
	WebElement submitAccountButton;
	
	
	public AccountCreateAddInfo(WebDriver dr) {
		this.dr =dr;
		PageFactory.initElements(dr, this);
	}
	
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			genderMale.click();
		}
		if(gender.equalsIgnoreCase("female")) {
			genderFemale.click();
		}
	}
	
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	public void enterEmailId(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}
	
	public void enterPassword(String pass) {
		passwd.sendKeys(pass);
	}
	
	public void selectDOB(int d) {
		Select dateDropDown = new Select(days);
		dateDropDown.deselectByIndex(d);
	}
	
	public void selectMOB(int m) {
		Select dateDropDown = new Select(months);
		dateDropDown.deselectByIndex(m);
	}
	
	public void selectYOB(int y) {
		Select dateDropDown = new Select(years);
		dateDropDown.deselectByIndex(y);
	}

	public void enterFNameForAddress(String fNme){
		firstNameAddress.sendKeys(fNme);
	}
	
	public void enterLNameAddress(String lNme) {
		lastNameAddress.sendKeys(lNme);
	}
	
	public void enterCompanyName(String cNme) {
		company.sendKeys(cNme);
	}
	
	public void enterCityName(String cityNme) {
		city.sendKeys(cityNme);
	}
	
	public void selectState(String stateNme) {
		//Georgia
		Select states = new Select(stateDropDown);
		states.selectByVisibleText(stateNme);
	}
	
	public void selectCountry(String country) {
		//United States
		Select countryD = new Select(countryDropDown);
		countryD.selectByValue("United States");
	}
	
	public void enterMobileNo(CharSequence[] mobNo) {
		mobileNo.sendKeys(mobNo);
	}
	
	public void enterAddressType(String addType) {
		addressAlias.clear();
		addressAlias.sendKeys(addType);
	}
	
	public AccountDashboard clickOnRegisterButton() {
		submitAccountButton.click();
		return new AccountDashboard(dr);
	}
	
	
}
