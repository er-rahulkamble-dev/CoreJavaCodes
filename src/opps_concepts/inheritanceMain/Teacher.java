package opps_concepts.inheritanceMain;

import opps_concepts.inheritanceBean.Person;

public class Teacher extends Person{

	String subject;
	//inherited methods
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher();
		
		t1.setFirstname("Vijay");
		t1.setLastname("Kurne");
		t1.setAge(20);
		t1.setSubject("Algorithm");
		System.out.println(t1.getFirstname());
		System.out.println(t1.getLastname());
		System.out.println(t1.getAge());
		System.out.println(t1.getSubject());
	
	}

	
}

