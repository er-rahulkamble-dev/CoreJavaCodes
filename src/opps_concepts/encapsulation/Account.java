package opps_concepts.encapsulation;

public class Account {

	private int accno;
	private String name;
	private double salary;
	public Account(int accno, String name, double salary) {
		//super();
		this.accno = accno;
		this.name = name;
		this.salary = salary;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
