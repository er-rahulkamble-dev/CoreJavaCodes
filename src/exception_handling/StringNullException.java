package exception_handling;

import java.util.Scanner;

public class StringNullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp = new employee();
		emp.setName();
	}

}
class employee{
	Scanner sc = new Scanner(System.in);
	String fname, lname;
	double salary;
	void setName() {
		System.out.println("enter first name:");
		fname = sc.nextLine();
		System.out.println("enter last name:");
		lname = sc.nextLine();
		System.out.println("enter employee Salary:");
		salary = sc.nextDouble();
		
		try {
			
			if(fname == "" && lname == "") {
				NullStringException ex = new NullStringException("Error -> Empty first name and last name");// this is user defined exception and should extend to the throwable class 
																								// or should extends to super class that is Exception class
				throw ex;
			}
			else if(fname == ""){
				NullStringException ex = new NullStringException("Error -> Empty first name ");
				throw ex;
			}
			else if(lname == "") {
				NullStringException ex = new NullStringException("Error -> Empty last name");
				throw ex;
			}
			else {
				System.out.println("Employee Name: "+fname+" "+lname);
			}
			if(salary < 3000){
				EmployeeException exp = new EmployeeException("Employee salary is below 3000.");
			}

		}
		catch(NullStringException e) {
			
			System.out.println(e.msg);
		}
		//catch(EmployeeException e){
			
			//System.out.println(e.msg);
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		//finally {
			
		//	System.out.println("Finally Block Execute !");
		//}
	//}
}
