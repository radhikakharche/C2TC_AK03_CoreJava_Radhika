package com.tns.dayfive.association.hasa;

public class Executor {

	public static void main(String[] args) {
		
		Address address = new Address("100 enclave","Akola","Maharashtra","500098");
		Person person = new Person("Riddhi",address);
		
		person.displayInfo();
		
	}

}
