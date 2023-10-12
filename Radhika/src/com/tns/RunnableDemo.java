package com.tns.daythirteen;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		UsingRunnable ur = new UsingRunnable(10,20,"Hello");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() { //Anonymous class
				System.out.println("Runnable with Anonymous class");
			}
		};	
		
		
		Thread t1 = new Thread (runnable);
		t1.start();
		
			}
		
	
	
	}


