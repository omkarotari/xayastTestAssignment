package com.xayast.automation.pages;

import org.openqa.selenium.WebDriver;

import com.xayast.automation.accountCreate.*;
import com.xayast.automation.accountDashboard.*;
import com.xayast.automation.checkout.*;
import com.xayast.automation.dressCategory.DressCatrgory;
import com.xayast.automation.landingPage.LandingPage;

public class PageHost {
	WebDriver dr;
	
	LandingPage lp;
	AccountCreate ac;
	AccountCreateAddInfo acad;
	AccountDashboard ad;
	DressCatrgory dc;
	Checkout co;
	CheckoutAddress coa;
	CheckoutShipping cos;
	CheckoutPayment cop;
	CheckoutPaymentConfirm copc;
	AccountOrderHistory aoh;
	
	public PageHost(WebDriver dr) {
		lp = new LandingPage(dr);
		ac = new AccountCreate(dr);
		acad = new AccountCreateAddInfo(dr);
		ad = new AccountDashboard(dr);
		dc = new DressCatrgory(dr);
		co = new Checkout(dr);
		coa = new CheckoutAddress(dr);
		cos = new CheckoutShipping(dr);
		cop = new CheckoutPayment(dr);
		copc = new CheckoutPaymentConfirm(dr);
		aoh = new AccountOrderHistory(dr);
	}
	

}
