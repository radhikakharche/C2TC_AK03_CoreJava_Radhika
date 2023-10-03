//Program to demonstrate final class
package com.tns.daysix.finalvariable;

final class FinalClass
{
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//Can't create child classes from final class,
//class FinalClass extends FinalClass{
//
//}
public class FinalClassDemo {

	public static void main(String[] args ) {
	
		// create the object of final class
		FinalClass f1 = new FinalClass();
		f1.show();
	}
	
}
