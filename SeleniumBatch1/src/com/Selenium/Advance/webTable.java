package com.Selenium.Advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver=new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		List<WebElement>trList=driver.findElements(By.xpath(".//*[@id='customers']/tbody/tr"));
		int rowCount=trList.size();
		
		
		
		for(int i=1;i<rowCount;i++)	{
			
			List<WebElement> colList=trList.get(i).findElements(By.tagName("td"));
			
			
			//driver.findElements(By.xpath(".//*[@id='customers']/tbody/tr"+[i]+"/td"))
			
			String country=colList.get(2).getText();
			
			if(country.equalsIgnoreCase("UK")){
				
				String companyName=colList.get(0).getText();
				
				
				if(companyName.equalsIgnoreCase("Island Trading")){
					System.out.println("Island Trading company is display");
				}else{
					System.out.println("Island Trading is not display");
				}
				
				break;
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
