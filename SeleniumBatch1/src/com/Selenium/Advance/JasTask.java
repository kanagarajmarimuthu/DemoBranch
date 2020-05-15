package com.Selenium.Advance;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JasTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "G:\\kanagaraj\\Technical\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://newtours.demoaut.com/");
	    
	    //
	    
	    //driver.manage().window().maximize();

	        //register link 
	    
	    
	        WebElement elm_reg=driver.findElement(By.linkText("REGISTER"));
	        
	        if(elm_reg.isDisplayed()){
	        	elm_reg.click();
	        }else{
	        	System.out.println("Register link is not working");
	        }
	        
	        //Wait until register page display
	        new WebDriverWait(driver, 60).
			until(ExpectedConditions.visibilityOf(
					driver.findElement(By.name("firstName"))));
	        

	      //for text boxes
	       /* 
	        if(driver.findElement(By.name("firstName")).isDisplayed()){
	        	if(driver.findElement(By.name("firstName")).isEnabled()){
	    	        
	     	       driver.findElement(By.name("firstName")).sendKeys("Selenium");
	        	}
	        }else{
	        	System.out.println("FristName text box  is not present");
	        }*/
	        
	        enterTextbox(driver.findElement(By.name("firstName")),"Selenium");
	        enterTextbox(driver.findElement(By.name("lastName")),"Test");
	        enterTextbox(driver.findElement(By.name("phone")),"9999900000");
	        enterTextbox(driver.findElement(By.name("userName")),"abc@gmail.com");
	        enterTextbox(driver.findElement(By.name("address1")),"xyz housing");
	        enterTextbox(driver.findElement(By.name("address2")),"Road1");
	        enterTextbox(driver.findElement(By.name("city")),"banglore");
	        
	        enterTextbox(driver.findElement(By.name("state")),"karnataka");
	        enterTextbox(driver.findElement(By.name("postalCode")),"010101");


	      /* driver.findElement(By.name("lastName")).sendKeys("Test"); 
	       driver.findElement(By.name("phone")).sendKeys("9999900000"); 
	       driver.findElement(By.name("userName")).sendKeys("abc@gmail.com"); 
	       driver.findElement(By.name("address1")).sendKeys("xyz housing");
	       driver.findElement(By.name("address2")).sendKeys("Road1");
	       driver.findElement(By.name("city")).sendKeys("banglore");
	       driver.findElement(By.name("state")).sendKeys("karnataka");
	       driver.findElement(By.name("postalCode")).sendKeys("010101");*/
	        
	        selectDropDownbyVisibleText(driver.findElement(By.name("country")),"INDIA");
	       
	      /* Select elm_country = new Select(); 
	       
	       elm_country.selectByVisibleText("INDIA"); */
	        
	        enterTextbox(driver.findElement(By.name("email")),"abcdef");

	       
	   /*    driver.findElement(By.name("email")).sendKeys("abcdef"); */
	        
	       String userName=  driver.findElement(By.name("email")).getAttribute("value");
	       
	       enterTextbox(driver.findElement(By.name("password")),"12345");
	       
	      /* driver.findElement(By.name("password")).sendKeys("12345"); */
	       String password=  driver.findElement(By.name("password")).getAttribute("value");
	       
	       enterTextbox(driver.findElement(By.name("confirmPassword")),"12345");
	       
	       /*driver.findElement(By.name("confirmPassword")).sendKeys("12345"); */
	       
	       //submit
	    /*   driver.findElement(By.xpath("//input[@name='register']")).click();
	       */
	       
	       clickOnButton(driver.findElement(By.xpath("//input[@name='register']")));
	       
	       new WebDriverWait(driver, 60).
			until(ExpectedConditions.visibilityOf(
					driver.findElement(By.xpath("//*[@href='mercurysignon.php']"))));
	       
	       clickOnButton(driver.findElement(By.xpath("//*[@href='mercurysignon.php']")));
	       
	       
	       //driver.findElement(By.xpath("//*[@href='mercurysignon.php']")).click();
			
	       /*
	       driver.navigate().to("http://newtours.demoaut.com/create_account_success.php");
			
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//*[@href='mercurysignon.php']")).click();
		   
		  // 

	       driver.findElement(By.linkText("Home")).click();*/

	       //Enter the username and password and click on the submit button. 
	       
	       enterTextbox(driver.findElement(By.name("userName")),userName);
	       
	       enterTextbox(driver.findElement(By.name("password")),password);
	       clickOnButton(driver.findElement(By.xpath("//input[@name='login']")));
	       
	       
	       /*driver.findElement(By.name("userName")).sendKeys(userName); 
	       driver.findElement(By.name("password")).sendKeys(password); 
	       driver.findElement(By.xpath("//input[@name='login']")).click();
	       */

	}
	
	public static void enterTextbox(WebElement elm,String input){
		
		if(elm.isDisplayed()){
			if(elm.isEnabled()){
				elm.clear();
				elm.sendKeys(input);
			}
		}
		
	}
	
public static void selectDropDownbyVisibleText(WebElement elm,String input){
		
		if(elm.isDisplayed()){
			
			  Select elm_country = new Select(elm); 
		       
		       elm_country.selectByVisibleText(input); 
		}
		
	}

public static void clickOnButton(WebElement elm){
	
	if(elm.isDisplayed()){
		
		 elm.click();
	}
}

}
