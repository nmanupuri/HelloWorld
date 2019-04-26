package com.mnr.test;

public class HelloWorld {
	
	public static void main(String s[]) {
		
		System.out.println("Hello World");
		
		HelloWorld obj = new HelloWorld();
		
		System.out.println(obj.add(10, 20));
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b){
		return a - b;	
	}

}
