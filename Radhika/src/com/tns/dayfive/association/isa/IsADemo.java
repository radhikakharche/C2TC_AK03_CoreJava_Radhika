package com.tns.dayfive.association.isa;

public class IsADemo {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Sarika",101,"IT");
		Manager mger = new Manager("Aarti",201,"Hr",10);
		
		System.out.println(emp);
		System.out.println("............");
		System.out.println(mger);
		
	}

}
