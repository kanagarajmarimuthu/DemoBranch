package com.Selenium.Advance;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.hdfcbank.com/");
		
		try{
			if(driver.findElement(By.id("div-close")).isDisplayed())
			{
				driver.findElement(By.id("div-close")).click();
			}
		}catch(NoSuchElementException e){
			
			System.out.println("Nopopup displayed");
		}
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for (String currentWindowHandle : allWindowHandles) {
			
			if (!currentWindowHandle.equals(parentWindow)) {
				
				driver.switchTo().window(currentWindowHandle);
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		
		driver.close();
		

	}

}
