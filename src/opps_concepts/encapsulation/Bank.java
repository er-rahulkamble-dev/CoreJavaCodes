package opps_concepts.encapsulation;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1,"Rahul",100000);
		System.out.println("A/c Details");
		System.out.println("Acc No.: "+account.getAccno());
		System.out.println("Acc Holder: "+account.getName());
		System.out.println("Acc Balance: "+account.getSalary());
	}
	
}
