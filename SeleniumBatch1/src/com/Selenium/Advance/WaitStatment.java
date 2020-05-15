package com.Selenium.Advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.ntltaxi.com");
		
		driver.manage().window().maximize();
		
		
		//Explicit Waits
		new WebDriverWait(driver, 60).
		until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//*[@href='login.php']"))));
		
		driver.findElement(By.xpath("//*[@href='login.php']")).click();
		
		new WebDriverWait(driver, 60).
		until(ExpectedConditions.visibilityOf(
				driver.findElement(By.id("namesignup"))));
		
		
		
	/*
		new WebDriverWait(driver, 60).
		until(ExpectedConditions.invisibilityOfElementLocated(By.id("namesignup")));
		*/
		
		if(driver.findElement(By.id("namesignup")).isDisplayed())
		{
			System.out.println("Navigate to SignUp Page");
		}else{
			System.out.println("ti is not Navigate SignUp Page");
		}
		
		
		//Thread.Sleep
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		driver.close();

	}

}
