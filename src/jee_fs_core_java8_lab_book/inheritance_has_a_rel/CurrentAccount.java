package jee_fs_core_java8_lab_book.inheritance_has_a_rel;

public class CurrentAccount extends Account {
	
	final double minBalance = 500;
	double bal = getAccBalance();
	void display() {
		System.out.println("balance in current acc: "+bal);
	}
	void deposit(double depoAmt) {

		double depoAmount = depoAmt;
		bal+=depoAmount;
		setAccBalance(bal);
		System.out.println("deposited Amount: "+depoAmount+"\tCurrent Balance: "+bal);
	
	}
	
//	void withdraw(double withdrawAmt) {
//		double withdrawAmount =  withdrawAmt;
//		if(bal > minBalance) {
//			System.out.println(bal);
//			
//			bal-= withdrawAmount;
//			setAccBalance(bal);
//			System.out.println("Withdraw Amount"+withdrawAmount+"\t Remaining Balance:"+getAccBalance());
//		}
//		else System.out.println("Insufficient Balance !");
//	}

}
