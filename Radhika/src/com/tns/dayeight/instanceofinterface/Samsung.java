////Program to define concrete class the implements the phone interface
package com.tns.dayeight.instanceofinterface;

public class Samsung implements Phone {
	@Override
	public void call() {
		System.out.println(" Calling using samsung");
		
	}
     @Override
	 public void sms() {
    	 System.out.println("Messaging using Samsung");
		 
	 }
}