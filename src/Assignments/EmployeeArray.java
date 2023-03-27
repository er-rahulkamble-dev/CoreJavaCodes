package Assignments;

import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args)
	{
		// Employee emp1 = new Employee(1,"Arvind", 50000);
		// Employee emp2 = new Employee(2,"Bob", 60000);
		// Employee emp3 = new Employee(3,"Chintamani", 40000);
		// Employee emp4 = new Employee(4,"Dweller", 30000);
		//Employee emp5 = new Employee(5,"Einsten", 20000);

		Scanner s = new Scanner(System.in);
		Employee[] emps = new Employee[5];
		
		emps[0]= new Employee(1,"Arvind", 50000);
		emps[1] = new Employee(2,"Bob", 60000);
		emps[2]= new Employee(3,"Chintamani", 40000);
		emps[3]= new Employee(4,"Dweller", 30000);
		emps[4]= new Employee(5,"Einsten", 20000);
		
		System.out.println("Choose one employee id among following");
		for(int i = 0; i < 5; i++){
			System.out.println("option "+i);	
		}
		int getEmployeeDetail = s.nextInt();

		System.out.println();
		System.out.println("Details:");	
		for(int i = 0; i < 5; i++){
			if(emps[i].empno==getEmployeeDetail){
				emps[i].display();
				break;
			}		
		}
	}
}

class Employee{
	
	int empno;
	String emp_name;
	double salary;
	Employee(int empno, String emp_name, double salary){
		this.empno = empno;
		this.emp_name = emp_name;
		this.salary = salary;
	}
	void display()
	{
		System.out.println(empno+" "+emp_name+" "+salary);
	}
}