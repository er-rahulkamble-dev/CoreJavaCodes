package Assignments;

import java.util.Scanner;

public class RetailPrice {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("enter product No.");
		int product_no = s.nextInt();
		System.out.println("enter Qauntity of Product");
		int qty = s.nextInt();	
		double total_amount=0;
		double price=0;
		switch(product_no){
		case 1:	price = 10.00;
			total_amount = price*qty;
			System.out.println("Price: "+product_no+"x"+qty+" = "+total_amount);
			break;
		case 2:	price = 20.00;
			total_amount = price*qty;
			System.out.println("Price: "+product_no+"x"+qty+"="+total_amount);
			break;
		case 3:	price = 30.00;
			total_amount = price*qty;
			System.out.println("Price: "+product_no+"x"+qty+"="+total_amount);
			break;
		default: System.out.println("invalid input");
		}
	}
}
