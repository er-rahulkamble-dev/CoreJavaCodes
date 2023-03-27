package exception_handling;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {

		 

        System.out.println("Main starts....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();
        sc.close();
        try {
            vote(age);
        }
        catch(AgeLimitException e) {
            //System.out.println("Not eligible for voting");
            System.out.println(e);
        }
        
        System.out.println("Main Ends");
    }
    
    static void vote(int age) throws AgeLimitException {
        
        if (age < 18) {
            AgeLimitException ex = new AgeLimitException("Not Eligible for voting.......");
            throw ex;
        } else {
            System.out.println("Eligible for vote");
        }
    }

}
