package com.javier.cucumber.bdd;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.javier.cucumber.base.BaseUtil;
import com.javier.cucumber.pom.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends BaseUtil{
	
	private BaseUtil base;
	
	public LoginTest(BaseUtil base) {
		this.base=base;
	}

	@Given("^Entro a la pagina de Login$")
	public void entro_a_la_pagina_de_Login() throws Throwable {
		base.driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
	}

	@When("^Ingreso la informacion de \"([^\"]*)\" y \"([^\"]*)\" en la pantalla de login$")
	public void ingreso_la_informacion_de_y_en_la_pantalla_de_login(String arg1, String arg2) throws Throwable {
		 LoginPage loginPage = new LoginPage(base.driver);
		 loginPage.Login(arg1, arg2);
	}

	@And("^Doy clic en el boton login$")
	public void doy_clic_en_el_boton_login() throws Throwable {
		LoginPage loginPage = new LoginPage(base.driver);
		loginPage.clickLogin();

	}

	@Then("^Yo deberia ver el formulario usuario$")
	public void yo_deberia_ver_el_formulario_usuario() throws Throwable {
		Assert.assertEquals("No se encontro el elemento", base.driver.findElement(By.id("Initial")).isDisplayed(),true); 

	}

}
