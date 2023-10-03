//Program to demonstrate the final variable
package com.tns.daysix.finalvariable;

public class FinalVariable {

	// final int x; // final instance must be initaialized
	
	final int x= 1000;
	
	//Declare a static blank final variable
	
	//final static int y;
	
	//Declare and initialize static final variable
	
	final static int y = 200;
	
	//instance method
	void change()
	{
		//x = 3000; // final variable can't be reassigned
		//y = 4000; // final static can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
	
	
}
 	 