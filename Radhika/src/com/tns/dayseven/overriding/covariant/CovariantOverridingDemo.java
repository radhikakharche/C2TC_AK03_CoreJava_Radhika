package com.tns.dayseven.overriding.covariant;

public class CovariantOverridingDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		// new student object
		Student st1 = new Student (101,"BE","Radha");
		st1.printData();
		
		//student object created using clone method
		//assuming type casting is required
		Student st2 = (Student) st1.clone();
		st2.printData();
		
		//using covariant return type no need to type cast
		//Student st3 = st2.clone();
		st2.setName("Radhika");
		st2.setClassname("BE");
		st2.setRollNo(102);
		st2.printData();

	}

}
