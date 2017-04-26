package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	private WebDriver driver;
	
	@FindBy(xpath="(//input[contains(@value, 'Blue')])[2]")
	@CacheLookup
	private WebElement departFlight;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")
	@CacheLookup
	private WebElement returnFlight;
	
	@FindBy(name="reserveFlights")
	@CacheLookup
	private WebElement submit;
	
	public SelectFlight(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void flightSelection(){
		departFlight.click();
		returnFlight.click();
		submit.click();
	}

}
