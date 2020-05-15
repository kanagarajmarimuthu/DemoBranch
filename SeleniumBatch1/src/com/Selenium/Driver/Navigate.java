package com.Selenium.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
	
		driver.navigate().to("http://ntltaxi.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		if(driver.findElement(By.xpath(".//*[@id='namesignup']")).isDisplayed()){
			System.out.println("Moved to SinguP Page");
		}
		
		driver.navigate().back();
		
		if(driver.getTitle().equalsIgnoreCase("NTL Taxi-Home")){
			System.out.println("Moved to Home Page");
		}else{
			System.out.println("Not in  Home Page");
		}
		
		driver.navigate().forward();
		
		if(driver.findElement(By.xpath(".//*[@id='namesignup']")).isDisplayed()){
			System.out.println("Moved to SinguP Page");
		}
		
		driver.navigate().refresh();
		
		if(driver.findElement(By.xpath(".//*[@id='namesignup']")).isDisplayed()){
			System.out.println("Moved to SinguP Page");
		}
		
		//driver.quit();
	}

}
