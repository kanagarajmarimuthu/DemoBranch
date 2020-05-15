package com.Selenium.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver;
		
		
		//System.setProperty("webdriver.chrome.driver","G:\\kanagaraj\\Technical\\chromedriver\\chromedriver.exe");
		//driver=new ChromeDriver();
			
			driver=new FirefoxDriver();
		
		//get method
		driver.get("http://www.ntltaxi.com/");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		try{
		
			WebElement elmName=driver.findElement(By.xpath("//*[@id='nameid1']"));
		
		
				if(elmName.isDisplayed()){
				
				if(elmName.isEnabled()){
					elmName.clear();
					elmName.sendKeys("Selenium");
					System.out.println("NameText Value="+elmName.getAttribute("value"));
				}else{
					System.out.println("Failed-Name Text box is not enabled");
				}
			}else{
				System.out.println("Failed-Name Text box is not displayed");
			}
		}catch(Exception er){
			System.out.println(er.getMessage());
		}
		
		driver.findElement(By.xpath("//*[@id='nameid']")).sendKeys("Raj");
		
		/*WebElement elmChk=driver.findElement(By.xpath("//*[@id='bookLater']"));
		
		if(!elmChk.isSelected()){
			elmChk.click();
		}else{
			System.out.println("Failed-CheckBox is not Selected");
		}*/
		
		/*driver.findElement(By.xpath("html/body/div[1]/header/span[1]/a")).click();
		
		new WebDriverWait(driver, 60).
		until(ExpectedConditions.visibilityOfElementLocated((By.id("namesignup"))));
		*/
		
		
				
		
	}
	
	
	public static boolean isElementExist(WebElement elm){
		
		try{
			if(elm.isDisplayed()){
				return true;
			}
		}catch(Exception er){
			return false;
		}
		return false;
		
	}
	
	
	

}
