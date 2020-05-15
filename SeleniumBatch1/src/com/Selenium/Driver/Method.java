package com.Selenium.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

	}

}
