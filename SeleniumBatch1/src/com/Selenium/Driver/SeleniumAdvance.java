package com.Selenium.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Id
		driver.findElement(By.id("nameid")).clear();
		driver.findElement(By.id("nameid")).sendKeys("Selenium");
		
		
		
		driver.findElement(By.linkText("Login")).click();

		//Invisibile
		new WebDriverWait(driver, 30).
		until(ExpectedConditions.invisibilityOfElementLocated(By.id("nameid")));
		
		
		
		//Explicit
		
		//WebElement Wait
		new WebDriverWait(driver, 30).
		until(ExpectedConditions.visibilityOf(driver.findElement(By.id("namesignup"))));
		
		
		//Locater
		new WebDriverWait(driver, 30).
		until(ExpectedConditions.visibilityOfElementLocated(By.id("namesignup")));
		
		driver.findElement(By.id("namesignup")).sendKeys("Selenium1");
		
		 driver.close();

	}

}
