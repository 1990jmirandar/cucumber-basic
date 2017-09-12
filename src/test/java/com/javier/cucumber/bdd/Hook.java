package com.javier.cucumber.bdd;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.javier.cucumber.base.BaseUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil{
	private BaseUtil baseUtil;
	public Hook(BaseUtil base) {
		baseUtil=base;
	}
	
	@Before
	public void initicalTest(){
		System.setProperty("webdriver.firefox.marionette", "/home/javier/webdriver/firefox/geckodriver.exe");
		baseUtil.driver= new FirefoxDriver();
		
	}
	
	@After
	public void tearDownTest(){
		
	}
}
