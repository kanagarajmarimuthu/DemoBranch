package com.Selenium.Java;

public class MethodOverLoading {
	
	public void add(int a,int b){
		
		int c=a+b;
		System.out.println("Method"+c);
	}
	
	
	public void add(int a,int b,int c){
		int D=a+b+c;
		System.out.println("Method"+D);
	}
	
	public void add(int a,String name){
		
		System.out.println("Method"+a+name);
	}

}
