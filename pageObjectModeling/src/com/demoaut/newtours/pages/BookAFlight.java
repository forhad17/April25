package com.demoaut.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	private WebDriver driver;
	
	@FindBy(name="passFirst0")
	@CacheLookup
	private WebElement firstName;
	
	@FindBy(name="passLast0")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(name="creditnumber")
	@CacheLookup
	private WebElement ccNumber;
	
	@FindBy(name="buyFlights")
	@CacheLookup
	private WebElement submit;
	
	public BookAFlight(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void flightBooking(String fName, String lName, String cNumber){
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		ccNumber.sendKeys(cNumber);
		submit.click();
	}
	
	
	

}
