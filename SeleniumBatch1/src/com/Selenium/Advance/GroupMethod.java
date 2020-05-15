package com.Selenium.Advance;

import org.testng.annotations.Test;

public class GroupMethod {

	@Test(groups="Regression")
	public void testcase(){
		System.out.println("Hello");
	}
	
	@Test(groups="smoke")
	public void testcase1(){
		System.out.println("Apple");
	}
	
	@Test(groups="Regression")
	public void testcase2(){
		System.out.println("Orange");
	}
	
	@Test(groups="adoc")
	public void testcase3(){
		System.out.println("Junkfruit");
	}
	
	@Test(groups="smoke")
	public void testcase4(){
		System.out.println("Banna");
	}
}
