package com.Selenium.PageObjectInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Selenium.TestNGPackage.BaseTest;

public class BookingPage {
	
	public BookingPage(){
		
		PageFactory.initElements(BaseTest.getDriver(), this);
	}
	
	public static final String BOOKING_NAME="nameid";
	
	public static final String BOOKING_MOBILENUMBER="Mobile";
	
	
	@FindBy(id="BOOKING_NAME")
	public WebElement getBookingName;	
	
	@FindBy(id="BOOKING_MOBILENUMBER")
	public WebElement getBookingMobileNumber;	
	
	
	public void enterBookingName(String bookingName){
		getBookingName.clear();
		getBookingName.sendKeys(bookingName);
	}
	
	public void enterBookingMobileNumber(String number){
		getBookingMobileNumber.clear();
		getBookingMobileNumber.sendKeys(number);
	}
	
	
	
	
	/*
	driver.findElement(By.id("nameid")).clear();
	driver.findElement(By.id("nameid")).sendKeys(bookingname);
	*/
	
	

}
