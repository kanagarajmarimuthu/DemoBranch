package com.Selenium.Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		
		
		
		//Statci
		Select drop=new Select(driver.findElement(By.className("sel")));
		
		//Index
		drop.selectByIndex(0);
		
		//VisibleTex
		drop.selectByVisibleText("9-Seater");
		
		//Value
		drop.selectByValue("Tavera");
		
		//Daynamic
		
		/*WebElement droElm=driver.findElement(By.className("sel"));
		List<WebElement> dropList=droElm.findElements(By.tagName("option"));*/
		List<WebElement> dropList=driver.findElements(By.xpath("//*[@id='vehid']/option"));
		
		System.out.println("dropCount="+dropList.size());
		
		for(int i=0;i<dropList.size();i++){
			
			String dropValue=dropList.get(i).getText();
			
			System.out.println("DropValue="+dropValue);
			
			if(dropValue.trim().equalsIgnoreCase("Sedan")){
				dropList.get(i).click();
				break;
				
			}
			
		}
		
		//Xpath Expression:
		
		//Contains
		
		driver.findElement(By.xpath("//a[contains(text(),'Cancel Booking')]")).click();
		
		//Startwith
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Cancel Booking')]")).click();
		
		

	}

}
