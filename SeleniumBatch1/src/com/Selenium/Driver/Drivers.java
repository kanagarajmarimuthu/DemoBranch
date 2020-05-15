package com.Selenium.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver","G:\\kanagaraj\\Technical\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		
		//Manage
		//driver.manage().window().maximize();
		
		//GetwindoName
		System.out.println("WindowName-"+driver.getWindowHandle());
		
		//Get title
		String title=driver.getTitle();
	
		
		String url=driver.getCurrentUrl();
		
		System.out.println("Title -"+title);
		
		System.out.println("url -"+url);
		
		driver.quit();
		

	}

}
