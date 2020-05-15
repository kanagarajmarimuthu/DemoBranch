package com.Selenium.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		
		//System.setProperty("webdriver.chrome.driver","G:\\kanagaraj\\Technical\\chromedriver\\chromedriver.exe");
		//driver=new ChromeDriver();
		
		driver=new FirefoxDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		
		//Id
		driver.findElement(By.id("nameid")).clear();
		driver.findElement(By.id("nameid")).sendKeys("Selenium");
		
		
		//Name
		driver.findElement(By.name("Mobile")).clear();
		driver.findElement(By.name("Mobile")).sendKeys("99444444444");
		
		//lINK;
		
		//driver.findElement(By.linkText("Cancel Booking?")).click();
		
		//Partical LinkText
		
		driver.findElement(By.partialLinkText("Cancel")).click();
		
		
		
		
		
		//driver.close();

	}

}
