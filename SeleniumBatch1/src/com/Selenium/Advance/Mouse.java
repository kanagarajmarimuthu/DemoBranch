package com.Selenium.Advance;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		
		/*System.setProperty("webdriver.chrome.driver", "C://Users//kanagaraj.m//Downloads//chromedriver//chromedriver.exe");
			
		driver=new ChromeDriver();*/
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
	
        driver.get("http://demo.automationtesting.in/Register.html");
        
        
        
        WebElement elmWidgets=driver.findElement(By.xpath(".//*[@href='Widgets.html']"));
        
        Actions action =new Actions(driver);
        action.moveToElement(elmWidgets).build().perform();
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement elmDate=driver.findElement(By.xpath(".//*[@href='Datepicker.html']"));
        action.moveToElement(elmDate).build().perform();
        elmDate.click();
        
       // driver.get("http://demo.automationtesting.in/Datepicker.html");
        
      
	}

}
