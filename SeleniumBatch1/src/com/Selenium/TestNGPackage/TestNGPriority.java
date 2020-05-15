package com.Selenium.TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPriority {
	
	
	@Test(priority=2)
	public void tc01(){
		System.out.println("Tc01");
	}
	
	@Test(priority=1)
	public void tc02(){
		System.out.println("Tc02");
	}
	
	@Test(priority=0)
	public void tc03(){
		System.out.println("Tc03");
	}
	
	
	
	@Test
	public void tc04(){
		System.out.println("Tc04");
		//Assert.fail("Hai");
	}
	
	
	@Test(dependsOnMethods="tc04")
	public void tc05(){
		System.out.println("Tc05");
	}
	

}
