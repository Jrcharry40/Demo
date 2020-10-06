package com.automationpractice.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class IniciarSesionPageObject extends PageObject {

	By btnSingIn = By.xpath("//a[@class='login']");
	By txtEmail = By.id ("email");
	By txtPassword = By.id("passwd");
	By btnSingInTwo =By.xpath("//i[@class='icon-lock left']");
	By txtLoginSuccessfully = By.xpath("//span[contains(text(),'Gabriel Betancur')]");
	By txtErrorLogin = By.xpath("//p[contains(text(),'There is 1 error')]");
	
	public By getBtnSingIn() {
		return btnSingIn;
	}
	public By getTxtEmail() {
		return txtEmail;
	}
	public By getTxtPassword() {
		return txtPassword;
	}
	public By getBtnSingInTwo() {
		return btnSingInTwo;
	}
	public By getTxtLoginSuccessfully() {
		return txtLoginSuccessfully;
	}
	public By getTxtErrorLogin() {
		return txtErrorLogin;
	}
	
	
	
	
	

	
}