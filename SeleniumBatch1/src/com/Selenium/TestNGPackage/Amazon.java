package com.Selenium.TestNGPackage;



import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;








import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	public void testcase() throws InterruptedException{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poorani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Book");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		List<WebElement>list1= driver.findElements(By.xpath(".//*[@id='search']//*[@class='rush-component']/a/div/img"));
		
		
			int value=list1.size();
			if(value>=10){
				
				list1.get(9).click();
				
			}
			
			String parentwindow = driver.getWindowHandle();
			
			System.out.println(parentwindow+"new window open");
			
			Set<String>childwindow=driver.getWindowHandles();
			
			for(String window:childwindow){
				
				if(!window.equalsIgnoreCase(parentwindow)){
					
					driver.switchTo().window(window);
					//(driver.findElement(By.xpath("//*id='imgBlkFront']")));
					Assert.assertTrue(driver.findElement(By.xpath("//*[@id='productTitle']")).isDisplayed());
				System.out.println("Verified successfully");
				JavascriptExecutor js =(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,2000)");
				
			
			driver.close();
			
				
				
				}
			}
						driver.switchTo().window(parentwindow);
					
					Thread.sleep(5000);
/*				Actions action = new Actions(driver);
				WebElement element =driver.findElement(By.xpath("//*[text()='Exam Central']"));
				action.moveToElement(element).build().perform();
*/			
		}
		
	}




