package com.Selenium.TestNGPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation {
	
	@Test
	public void tc01(){
		
		String name="Testing";
		String name2="Testing1";
		
		if(name.equalsIgnoreCase(name2)){
			System.out.println("passed");
		}else{
			System.out.println("failed");
		}
		
		//Equal
		Assert.assertEquals(name, name2,"Filed-The Actual is not matched with excepted");
		
		
		//Assert True
		Assert.assertTrue(name.equalsIgnoreCase(name2), "Filed-The Actual is not matched with excepted");
		
		//AssertFalse
		
		name2="Sample";
		Assert.assertFalse(name.equalsIgnoreCase(name2), "Filed-The Actual is not matched with excepted");
		
		
		//Assert fail
		
		Assert.fail("Failed due to some reason");
		
		
	}
	
	
	@Test
	public void tc1(){
		
		WebDriver driver;
		
		System.out.println("Before");
		driver=new FirefoxDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		//Id
		
		Assert.assertTrue(driver.findElement(By.id("nameid")).isDisplayed(), "Nanme object is not displayed");
		
		driver.findElement(By.id("nameid")).clear();
		driver.findElement(By.id("nameid")).sendKeys("Selenium");
		
		String expected=driver.findElement(By.id("nameid")).getAttribute("value");
		
		Assert.assertEquals(expected, "Selenium","Failed actual value is not matched");
		
		
	}
	
	
	
	
	

}
