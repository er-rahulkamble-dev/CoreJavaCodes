package Assignments;

public class SetGetMethods {

	
	   public static void main(String[] args) {

			 

		    Account myAccount = new Account(); 

		 

		    myAccount.setAccount(101,"Roshan",50000); 

		 

		    myAccount.deposit(7000);

		 

		    //double interest = 0.25;

		 

		    // add interest to the balance  ?

		 

		     double currentBal = myAccount.getBalance();
		     int accno = myAccount.getAccno();
		     String name = myAccount.getName();
		    
		     System.out.println("Balance: "+currentBal);
		     System.out.println("A/c No "+accno);
		     System.out.println("Name: "+name);        

		 

		   }
}

class Account {

		 

	    int accno;
	    String name;
	    double balance;

	 

	    void setAccount(int ano,String aname,double acbal) {
	     accno = ano;
	     name = aname;
	     balance = acbal;
	    }
	 
	   void deposit(double amount) {
	      balance = balance+amount;
	   }

	 

	   void withdraw(double amount) {
	    balance = balance-amount;
	   } 

	 

	   double getBalance() {
	    return balance;
	   }

	 

	   int getAccno() {
	     return accno;
	   }

	 

	   String getName() {
	     return name;
	   }

	 

	 }

	 


	 