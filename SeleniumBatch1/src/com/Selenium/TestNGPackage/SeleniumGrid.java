package com.Selenium.TestNGPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	@Test
	public void seleniumGrid() throws MalformedURLException{
		
		 WebDriver driver;
		 
		 DesiredCapabilities capability = DesiredCapabilities.chrome();
		 
		 driver=new RemoteWebDriver(new URL("http://192.168.43.14:4444/wd/hub"),capability);
			
			//get method
		 driver.get("https://github.com/SeleniumHQ/selenium/wiki/Grid2");
	}

}
