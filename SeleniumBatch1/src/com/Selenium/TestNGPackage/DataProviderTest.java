package com.Selenium.TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	WebDriver driver;
	
	@Parameters({"appUrl"})
	@BeforeMethod
	public void before(String appUrl){
		System.out.println("Before");
		driver=new FirefoxDriver();
		
		//get method
		driver.get(appUrl);
	}

	
	@Test(dataProvider="Booking")
	public void tc1(String bookingname,String mobileNumber){
		
		//Id
		driver.findElement(By.id("nameid")).clear();
		driver.findElement(By.id("nameid")).sendKeys(bookingname);
		
		driver.findElement(By.name("Mobile")).clear();
		driver.findElement(By.name("Mobile")).sendKeys(mobileNumber);
	}
	
	@AfterMethod
	public void after(){
		System.out.println("After");
		driver.close();
	}
	
	
	@DataProvider(name="Booking")
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[2][2];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "99444444172";

	// 2nd row
	data[1][0] ="testuser2";
	data[1][1] = "1234568";
	
	/*// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "pass123";*/

	return data;
	}
	
	

}
