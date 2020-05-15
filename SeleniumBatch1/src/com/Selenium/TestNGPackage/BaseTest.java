package com.Selenium.TestNGPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	
	static WebDriver driver;
	
	@Parameters({"appUrl"})
	@BeforeMethod
	public void before(String appUrl){
		System.out.println("Before");
		driver=new FirefoxDriver();
		
		//get method
		driver.get(appUrl);
	}
	
	public static WebDriver getDriver(){
		
		return driver;
	}
	
	public void closeDriver(){
		driver.close();
	}

	@AfterMethod
	public void after(){
		System.out.println("After");
		driver.close();
	}
	

	

	public static String[][]getExcelData() throws BiffException, IOException{
		
		

		String[][] workSheetArray1 = null;
		
	
		FileInputStream file1 = new FileInputStream(
				new File("C:\\Users\\poorani\\workspace\\sampleProject\\SeleniumBatch1\\LoginData.xls"));

		// Get Sheet1
		Workbook w1;

		w1 = Workbook.getWorkbook(file1);
		// Get the first sheet
		Sheet sheet1 = w1.getSheet(0);
		// Loop over first 10 column and lines

		workSheetArray1 = new String[sheet1.getRows()][sheet1.getColumns()];
		
		
		
		for (int i = 0; i < sheet1.getRows(); i++) {
			
			for (int j = 0; j < sheet1.getColumns(); j++) {

				//System.out.println("OutPut-"+ sheet1.getCell(j, i).getContents());
				
				workSheetArray1[i][j] = sheet1.getCell(j, i).getContents();

			}
		}
		
		file1.close();

		return workSheetArray1;

	}
}
