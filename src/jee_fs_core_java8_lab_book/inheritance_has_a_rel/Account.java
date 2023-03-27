package jee_fs_core_java8_lab_book.inheritance_has_a_rel;

import java.util.Random;
import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);
	
	private long[] accNum;
	private double accBalance;
	private Person accHolder;

	
	long[] randomnum() {
		Random rn = new Random();
		 long[] numarr = new long[11];
		
		for(int i =0; i < 10; i++)
		{
			 numarr[i]  = rn.nextInt(10)+1;
		    
		}
//		for(int i = 0; i < numarr.length-1; i++ ) {
//			System.out.print(numarr[i]);
//		}
		return numarr;
	}
	
	
	public long[] getAccNum() {
		return accNum;
	}
	public void setAccNum(long[] accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
//	public Person getAccHolder() {
//		return accHolder;
//	}
//	public void setAccHolder(Person accHolder) {
//		this.accHolder = accHolder;
//	}
//	
	
	void deposit(double depoAmt) {
		depoAmt = 0;
		accBalance+=depoAmt ;
		System.out.println("deposited Amount"+depoAmt+"\t Current Balance:"+accBalance);
		
	}
	
	void withdraw(double withdrawAmt) {
		withdrawAmt = 0;
		accBalance-= withdrawAmt;
		//System.out.println("Withdraw Amount"+withdrawAmt+"\t Remaining Balance:"+accBalance);
	}
	double getBalance() {
		
		return accBalance;
	}
	

}
