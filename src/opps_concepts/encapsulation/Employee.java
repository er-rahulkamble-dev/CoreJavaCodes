package opps_concepts.encapsulation;

public class Employee {
	
		private int empid;
		private String empname;
		private double empsalary;
		public Employee(int empid, String empname, double empsalary) {
			//super();
			this.empid = empid;
			this.empname = empname;
			this.empsalary = empsalary;
		}
		
		public void display() {
			System.out.println();
		}

}
