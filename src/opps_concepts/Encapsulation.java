package opps_concepts;

//Encapsulation is the process of compartmentaling the elements of abstraction that constitute its structure and behavior;
//encapsulation serves to separate the contractual interface of an abstraction and its implements

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A1 = new Account();
		Account A2 = new Account();
		
		A1.setAccno(1);
		System.out.println(A1.getAccno());
		A1.setUsername("Avinash");
		System.out.println(A1.getUsername());
		A1.setBalance(50000);
		System.out.println(A1.getBalance());
		System.out.println();
		
		A2.setAccno(2);
		System.out.println(A2.getAccno());
		A2.setUsername("Bob");
		System.out.println(A2.getUsername());
		A2.setBalance(70000);
		System.out.println(A2.getBalance());
		System.out.println();
	}

}
class Account{
	private int accno;
	private String username;
	private double balance;
	
//	void display(){
//		System.out.println(accno+" "+username+" "+balance);
//	}
	void setAccno(int accno){
		this.accno = accno;
	}
	int getAccno() {
		return accno;
	}
	
	void setUsername(String username){
		this.username = username;
	}
	String getUsername() {
		return username;
	}
	
	void setBalance(double balance){
		this.balance = balance;
	}
	double getBalance() {
		return balance;
	}
	
}
