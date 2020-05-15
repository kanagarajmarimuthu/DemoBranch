package com.Selenium.Java;

public class methodOverWrite extends Animal {
	

	public void eat()
	{
		System.out.println("Method Over Write");
		//super.eat();
		int a=10, b=10;
		int c=a-b;
		System.out.println("child OutPut="+c);
		super.eat();
		
	}  
	

}
