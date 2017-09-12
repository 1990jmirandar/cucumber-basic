package com.javier.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(how=How.NAME,using="UserName")
	public WebElement txtNameUser;
	@FindBy(how=How.NAME,using="Password")
	public WebElement txtPassword;
	@FindBy(how=How.NAME,using="Login")
	public WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
	}
	
	public void Login(String usuario, String password){
		txtNameUser.sendKeys(usuario);
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin(){
		btnLogin.submit();
	}
}
