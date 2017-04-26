package com.demoaut.newtours.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoaut.newtours.pages.Login;

import reporter.JyperionListener;


@Listeners(JyperionListener.class)
public class ValidateCredential extends BaseTest{

	@Test
	public void validateCreden(){
		Login lp = new Login(driver);
		lp.appLogin("mercury", "mercury");
		String expectedTitle = "Find a Flight: Mercury Tours:";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
}
