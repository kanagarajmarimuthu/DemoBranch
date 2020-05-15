package com.Selenium.TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Selenium.PageObjectInfo.BookingPage;

public class BookingTest extends BaseTest {
	
	

	
	@Test
	public void tc1(){
		
		//Id
		/*driver.findElement(By.id("nameid")).clear();
		driver.findElement(By.id("nameid")).sendKeys("Selenium");*/
		BookingPage page=new BookingPage();
		page.enterBookingName("Selenium");
		
		
		
	}
	
	
	
	
	@Test
	public void tc2(){
		
		//Name
		/*driver.findElement(By.name("Mobile")).clear();
		driver.findElement(By.name("Mobile")).sendKeys("99444444444");*/
		
		BookingPage page=new BookingPage();
		
		
		page.enterBookingMobileNumber("9995444444");
		
	}

}
