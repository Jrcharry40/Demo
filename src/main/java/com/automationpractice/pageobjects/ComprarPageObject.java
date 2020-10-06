package com.automationpractice.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class ComprarPageObject extends PageObject {
	
	By btnHome = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[1]/a[1]"); 
	By scrollReference = By.xpath("//a[@class='blockbestsellers']");
	By imgBlouse = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//a[@class='product-name'][contains(text(),'Blouse')]");
	By btnPlus = By.xpath("//i[@class='icon-plus']");
	By listSize = By.xpath("//option[contains(text(),'M')]");
	By btnColor = By.id("color_8");
	By btnAddToCart = By.xpath("//span[contains(text(),'Add to cart')]");
	By btnProceedToCheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
	By btnProceedToCheckoutTwo = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
	By btnProceedToCheckoutThree = By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
	By checkBoxTerms = By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to')]");
	By btnProceedToCheckoutFour = By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
	By btnPayByBankWire = By.xpath("//a[@class='bankwire']");
	By btnIConfirmMyOrder = By.xpath("//span[contains(text(),'I confirm my order')]");
	By txtOrderCompleted = By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]");
	
	public By getBtnHome() {
		return btnHome;
	}
	public By getScrollReference() {
		return scrollReference;
	}
	public By getImgBlouse() {
		return imgBlouse;
	}
	public By getBtnPlus() {
		return btnPlus;
	}
	public By getListSize() {
		return listSize;
	}
	public By getBtnColor() {
		return btnColor;
	}
	public By getBtnAddToCart() {
		return btnAddToCart;
	}
	public By getBtnProceedToCheckout() {
		return btnProceedToCheckout;
	}
	public By getBtnProceedToCheckoutTwo() {
		return btnProceedToCheckoutTwo;
	}
	public By getBtnProceedToCheckoutThree() {
		return btnProceedToCheckoutThree;
	}
	public By getCheckBoxTerms() {
		return checkBoxTerms;
	}
	public By getBtnProceedToCheckoutFour() {
		return btnProceedToCheckoutFour;
	}
	public By getBtnPayByBankWire() {
		return btnPayByBankWire;
	}
	public By getTxtOrderCompleted() {
		return txtOrderCompleted;
	}
	public By getBtnIConfirmMyOrder() {
		return btnIConfirmMyOrder;
	}
	
	
	

}
