package com.Selenium.TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingUpTest {
	
	
	
	@BeforeMethod
	public void before(){
		System.out.println("Before");
		
	}
	
	@Test
	public void tc1(){
		System.out.println("tc1");
	}
	
	@AfterMethod
	public void after(){
		System.out.println("After");
		
	}
	
	@Test
	public void tc2(){
		System.out.println("TC2");
	}
	

	@Test(enabled=false)
	public void tc3(){
		System.out.println("tc3");
	}
}
