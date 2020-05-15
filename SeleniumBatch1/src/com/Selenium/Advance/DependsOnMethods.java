package com.Selenium.Advance;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test(groups="Regression")
	public void tescase(){
		System.out.println("Mango");
	}
	
	@Test(dependsOnMethods="tescase",groups="Regression")
	public void testcase1(){
		System.out.println("Pomogranate");
		
	}
	@Test(groups="Regression")
	public void testcase2(){
		System.out.println("Papaya");
	}
	
	@Test(dependsOnMethods="testcase2",groups="Regression")
	public void testcase4(){
		System.out.println("Chapota");
	}
	
	@Test(groups="Regression")
	public void testcase3(){
		System.out.println("watermillon");
	}
}
