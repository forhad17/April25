package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	private WebDriver driver;
	
	@FindBy(css="input[value='Business']")
	@CacheLookup
	private WebElement businessClass;
	
	@FindBy(name="airline")
	@CacheLookup
	private WebElement pickAirline;
	
	@FindBy(name="findFlights")
	@CacheLookup
	private WebElement submit;
	
	public FlightFinder(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void findAFlight(){
		businessClass.click();
		Select airline = new Select(pickAirline);
		airline.selectByIndex(2);
		submit.click();
	}
}
