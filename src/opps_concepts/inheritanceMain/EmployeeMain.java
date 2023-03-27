package opps_concepts.inheritanceMain;
// Has-A Relationship inheritance
import opps_concepts.inheritanceBean.Address;
import opps_concepts.inheritanceBean.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address();
		addr.city = "Tamgaon";
		addr.district = "Kolhapur";
		addr.pin = "234523";
		
		Employee emp1 = new Employee();
		emp1.empid=101;
		emp1.empname = "Raj";
		emp1.empsalary = 45000;
		
		//Address copyaddr = addr;
		emp1.address = addr;
		
		System.out.println("Employee Details");
		System.out.println(emp1.empid+" "+emp1.empname+" "+emp1.empsalary);
		System.out.println(emp1.address.city);

	}

}
