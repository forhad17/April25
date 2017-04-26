package com.demoaut.newtours.TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demoaut.newtours.pages.BookAFlight;
import com.demoaut.newtours.pages.FlightFinder;
import com.demoaut.newtours.pages.Login;
import com.demoaut.newtours.pages.SelectFlight;

import reporter.JyperionListener;

@Listeners(JyperionListener.class)
public class TestFlightBooking extends BaseTest{
	
	@Test
	public void BookTicketTest(){
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		
		lp.appLogin("mercury", "mercury");
		ff.findAFlight();
		sf.flightSelection();
		bf.flightBooking("dd", "gg", "59575437");
		
		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	

}
