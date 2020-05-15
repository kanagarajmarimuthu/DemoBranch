package com.Selenium.Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		
		//Static
		Select drop=new Select(driver.findElement(By.xpath("//*[@id='vehid']")));
		
		//Index
		drop.selectByIndex(0);
		
		//VisibleTex
		drop.selectByVisibleText("9-Seater");
		
		//Value
		drop.selectByValue("Tavera");
		
		//Dynamic
		
		WebElement droElm=driver.findElement(By.className("sel"));
		List<WebElement> dropList=droElm.findElements(By.tagName("option"));
		
		
		System.out.println("dropCount="+dropList.size());
		
		for(int i=0;i<dropList.size();i++){
			
			String dropValue=dropList.get(i).getText();
			
			System.out.println("DropValue="+dropValue);
			
			if(dropValue.trim().equalsIgnoreCase("Sedan")){
				dropList.get(i).click();
				break;
				
			}
			
		}
		
		
		
		

	}

}
