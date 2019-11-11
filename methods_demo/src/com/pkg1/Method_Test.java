package com.pkg1;

public class Method_Test {

	static int a;
	static int b;
	
	public static void main(String[] args) {
		a= 20;
		b =30;
		System.out.println("The sum is...:");
		show_sum();
		
	}
	
	static void show_sum(){
		System.out.println(a+b);
		
		
	}
}
