package com.tns.dayfivehierarchicalinheritance;

public class HierarchicalInDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("......person details ......");
		System.out.println(p1);
		
		Person p;
		
		p = new Person("Aditi","Mumbai");
		if (p instanceof Person)
			System.out.println("person details " +p);
		
		p = new Employee("Samiksha","Akola",101,50000,"IT");
		if(p instanceof Employee)
			System.out.println("Employee details " +p);
		
		p = new Student("Mrunal","Akola","FE",99);
		if(p instanceof Student)
			System.out.println("Student details " +p);
		
	}

}
