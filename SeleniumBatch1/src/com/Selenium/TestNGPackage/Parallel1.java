package com.Selenium.TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel1  {
	
	
	WebDriver driver;
	
	@Parameters({"appUrl"})
	@Test
	public void tc01(String appUrl){
		
		System.out.println("TC01");
		driver=new FirefoxDriver();
		driver.get(appUrl);
	}
	
	@Parameters({"appUrl"})
	@Test
	public void tc02(String appUrl){
		
		System.out.println("TC02");
		driver=new FirefoxDriver();
		driver.get(appUrl);
	}
	
	@Parameters({"appUrl"})
	@Test
	public void tc03(String appUrl){
		
		System.out.println("TC03");
		driver=new FirefoxDriver();
		driver.get(appUrl);
	}
	
	@Parameters({"appUrl"})
	@Test
	public void tc04(String appUrl){
		
		System.out.println("TC04");
		driver=new FirefoxDriver();
		driver.get(appUrl);
	}
	
	@Parameters({"appUrl"})
	@Test
	public void tc05(String appUrl){
		
		System.out.println("TC05");
		driver=new FirefoxDriver();
		driver.get(appUrl);
	}

}
