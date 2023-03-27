package Assignments;

import java.util.Scanner;

public class TaxApply {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		System.out.println("mention gender man/woman");
		//String gender=s.nextLine();
		System.out.println("mention income");
		double income=s.nextDouble();	
		double Tax=0;
		String gender="male";
		if(gender=="man"){
		System.out.println("Man");
			if(income<=180000){
				System.out.println("No Tax is applicable.");
				System.out.println("Taxt:"+Tax);
			}
			else if(income>=180001 && income<=500000){
				System.out.println("Tax is applicable: 10%");
				Tax=income*0.1;
				System.out.println("Tax:"+ Tax);
			}
			else if(income>=500001 && income<=800000){
				System.out.println("Tax is applicable: 20%");
				Tax=income*0.2;
				System.out.println("Tax:"+ Tax);
			}
			else if(income>=800001){
				System.out.println("No Tax is applicable: 30%");
				Tax=income*0.3;
				System.out.println("Tax:"+Tax );
			}
		}
		else if(gender=="woman"){
		System.out.println("Woman");
			if(income<=190000){
				System.out.println("No Tax is applicable.");
				System.out.println("Tax:"+Tax);
			}
			else if(income>=190001 && income<=500000){
				System.out.println("Tax is applicable: 10%");
				Tax=income*0.1;
				System.out.println("Tax:"+Tax);
			}
			else if(income>=500001 && income<=800000){
				System.out.println("Tax is applicable: 20%");
				Tax=income*0.2;
				System.out.println("Tax:"+Tax);
			}
			else if(income>=800001){
				System.out.println("No Tax is applicable: 30%");
				 Tax=income*0.3;
				System.out.println("Tax:"+Tax);
			}
		}
	}
}