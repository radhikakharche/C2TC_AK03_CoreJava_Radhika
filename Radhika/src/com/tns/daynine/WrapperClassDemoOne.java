//Program to demonstrate Command Line arguments 
package com.tns.daynine;

public class WrapperClassDemoOne {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
	    int b = Integer.parseInt(args[1]);
		
		int c= a+b;
		System.out.println(c);



	}

}