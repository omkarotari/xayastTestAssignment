package com.xayast.automation.dressCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressCatrgory {
	WebDriver dr;
	WebDriverWait wt;
	
	@FindBy(xpath="//ul[@class='product_list grid row']//li[1]//div[@class='product-image-container']")
	WebElement firstProductImage;
	
	@FindBy(xpath="//ul[@class='product_list grid row']//li[1]//div[@class='product-image-container']//a[@class='quick-view']")
	WebElement quickViewButton;
	
	@FindBy(id="fancybox-frame1592467315707")
	WebElement iFrame;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	WebElement addQuantityButton;
	
	@FindBy(xpath="//p[@id='add_to_cart']//button")
	WebElement addToCartButton;
	
	public DressCatrgory(WebDriver dr) {
		this.dr = dr;
		wt = new WebDriverWait(dr,20);
	}
	
	public void moveCursorToImage() {
		Actions act = new Actions(dr);
		act.moveToElement(firstProductImage).build().perform();
	}
	
	public void clickOnQuickView() {
		wt.until(ExpectedConditions.visibilityOfElementLocated((By) quickViewButton));
		quickViewButton.click();
	}
	
	public void waitForIFrame() {
		wt.until(ExpectedConditions.visibilityOfElementLocated((By) iFrame));
	}
	
	public void switchiFrame() {
		dr.switchTo().frame(iFrame);
	}
	
	public void addExtraQuantity() {
		addQuantityButton.click();
	}
	
	public void addToCart() {
		addToCartButton.click();
	}
}
