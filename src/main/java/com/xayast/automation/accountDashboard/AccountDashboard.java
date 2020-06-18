package com.xayast.automation.accountDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xayast.automation.dressCategory.DressCatrgory;

public class AccountDashboard {
	WebDriver dr;
	
	@FindBy(xpath="//a[@class='sf-with-ul'][contains(text(),'Women')]")
	WebElement womenPageLink;
	
	public AccountDashboard(WebDriver dr) {
		this.dr =dr;
		PageFactory.initElements(dr, this);
	}
	
	public String getTitle() {
		return dr.getTitle();
	}
	
	public DressCatrgory clickWomenPageLink() {
		womenPageLink.click();
		return new DressCatrgory(dr);
	}
	
	
}
