package com.Selenium.Advance;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		/*System.setProperty("webdriver.chrome.driver", "C://Users//kanagaraj.m//Downloads//chromedriver//chromedriver.exe");
			
		driver=new ChromeDriver();*/
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Robot robot = new Robot();
        
 
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.id("imagesrc")).click();
 
        robot.setAutoDelay(2000);
 
        StringSelection selection = new StringSelection("D:\\upload.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
 
        robot.setAutoDelay(1000);
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
 
        robot.setAutoDelay(1000);
 
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
