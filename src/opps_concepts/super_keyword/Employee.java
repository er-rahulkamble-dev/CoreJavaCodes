package opps_concepts.super_keyword;

import opps_concepts.super_keyword.Person;
public class Employee extends Person {

	private int empno;
	private double salary;
	
	Employee(String fname, String lname, int age,int empno, double salary){
		super(fname, lname, age);// if yous created parameterized constructor in Person the her super key should be parameterized
		//super();	// and if you called default zero parameter super keyword it will show error
		this.empno = empno;
		this.salary = salary;
		
	}

}
