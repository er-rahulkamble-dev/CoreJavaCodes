package jee_fs_core_java8_lab_book.inheritance_has_a_rel;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			Person person = new Person();
			person.setName("Smith");
			person.setAge(24);
			
			Person person2 = new Person();
			person2.setName("Kethy");
			person2.setAge(24);
			
			Account a1 = new Account();
			a1.setAccHolder(person);
			a1.setAccBalance(2000);	
			a1.setAccNum(a1.randomnum());
				
			if(person.getName()=="Smith") {
			
			}
			
			Account a2 = new Account();
			a2.setAccHolder(person2);
			a2.setAccBalance(3000);
			a2.setAccNum(a2.randomnum());
				
			SavingAccount sa2 = new SavingAccount();
			CurrentAccount ca2 = new CurrentAccount();
				
			if(person.name == "Kethy") {
				
			}
			
			System.out.println("Account Holder 1 Details:");
			
			System.out.println("Name: "+a1.getAccHolder().name);
			System.out.println("Balance: "+a1.getAccBalance());
			
			System.out.print("Acc No: ");
			for(int j = 0; j < a1.getAccNum().length; j++) {
				
				System.out.print(a1.getAccNum()[j]);
			}
			
			System.out.println("");
			System.out.println("");
	System.out.println("Account Holder 2 Details:");
			
			System.out.println("Name: "+a2.getAccHolder().name);
			System.out.println("Balance: "+a2.getAccBalance());
			
			System.out.print("Acc No: ");
			for(int j = 0; j < a2.getAccNum().length; j++) {
				
				System.out.print(a2.getAccNum()[j]);
			}
			System.out.println("");
			System.out.println("");
		//	System.out.println("Enter withdraw amount:");
			//double amt = sc.nextInt();
			//ca2.withdraw(amt);
			//ca2.display();
		
	}

}
