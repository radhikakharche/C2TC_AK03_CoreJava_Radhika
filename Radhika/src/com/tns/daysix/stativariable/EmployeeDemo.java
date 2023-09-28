package com.tns.daysix.stativariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Employee ("radha",100);
		System.out.println(e);
		
		System.out.println(Employee.companyName);
		
		e = new Employee ("mrinal",200);
		System.out.println(e);
		

	}

}
