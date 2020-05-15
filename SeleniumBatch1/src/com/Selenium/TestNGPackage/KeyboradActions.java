package com.Selenium.TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class KeyboradActions {
	
	
WebDriver driver;
	
	
	//@Test
	public void tc01() throws InterruptedException{
		
		System.out.println("TC01");
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	WebElement elm=	driver.findElement(By.xpath(".//*[@id='header']/nav/div/div[2]/ul/li[5]/a"));
	
	Actions builder = new Actions(driver);
	
    builder.moveToElement(elm).build().perform();
    
    Thread.sleep(20000);
	
    
    WebElement elm1=	driver.findElement(By.xpath(" .//*[@id='header']/nav/div/div[2]/ul/li[5]/ul/li[4]/a"));
    elm1.click();
	}
	
    @Test
	public void tc02() {
		
		System.out.println("TC01");
		driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	WebElement elm=	driver.findElement(By.xpath("//*[@ng-model='Adress']"));
	
	Actions builder = new Actions(driver);
	
    Action action1=builder.moveToElement(elm).click()
    		.keyDown(elm,Keys.SHIFT)
    		.sendKeys("hello").keyUp(elm,Keys.SHIFT).doubleClick(elm)
    		.contextClick().build();
	
    action1.perform();
	
	
	
		
		
		
		
		
	}

}
