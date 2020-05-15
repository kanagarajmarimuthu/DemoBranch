package com.Selenium.TestNGPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertClass {
	
	WebDriver driver;
	
	 @Test
	public void tc02() throws InterruptedException {
		 
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/test/delete_customer.php");			
 		
	      	
	        driver.findElement(By.name("cusid")).sendKeys("53920");					
	        driver.findElement(By.name("submit")).submit();			
	        		
	        // Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);
	        		
	        // Accepting alert		
	       // alert.accept();
	        
	        alert.dismiss();
	        
	       
	 }

}
