package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory - OR
	@FindBy(id="username") WebElement username;
	
	@FindBy(id="password") WebElement password;
	
	@FindBy(xpath="//button[@type,'submit']") WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, LoginPage.class);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public HomePage signIn() {
		login.click();
		return new HomePage();
	}
}
