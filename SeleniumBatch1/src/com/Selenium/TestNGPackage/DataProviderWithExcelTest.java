package com.Selenium.TestNGPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Selenium.PageObjectInfo.BookingPage;

public class DataProviderWithExcelTest extends BaseTest {
	
	
	@Test(dataProvider="BookingData")
	public void tc1(String bookingname,String mobileNumber){
		
		//Id
		/*driver.findElement(By.id("nameid")).clear();
		driver.findElement(By.id("nameid")).sendKeys(bookingname);*/
		
		BookingPage page=new BookingPage();
		page.enterBookingName(bookingname);
		
		page.enterBookingMobileNumber(mobileNumber);
		
		
		/*driver.findElement(By.name("Mobile")).clear();
		driver.findElement(By.name("Mobile")).sendKeys(mobileNumber);*/
	}
	

	
	@DataProvider(name="BookingData")
    public Object[][] getTextData() throws BiffException, IOException{
		
		Object[][] data = getExcelData();
		return data;
    }
	
	
	

	

}
