package com.Selenium.TestNGPackage;

import org.testng.annotations.Test;

public class GroupsTest {
	
	@Test(groups="Smoke")
	public void tc1(){
		System.out.println("tc1");
	}
	
	@Test(groups="Smoke")
	public void tc2(){
		System.out.println("tc2");
	}
	
	@Test(groups="Smoke")
	public void tc3(){
		System.out.println("tc3");
	}
	
	@Test(groups="Smoke")
	public void tc4(){
		System.out.println("tc4");
	}
	
	@Test(groups="Regression")
	public void tc5(){
		System.out.println("tc5");
	}

}
