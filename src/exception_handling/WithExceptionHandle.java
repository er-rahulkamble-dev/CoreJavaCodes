package exception_handling;

public class WithExceptionHandle {

	 public static void main(String[] args) {
	        
	        System.out.println("Main Starts....");
	        
	        int a = 20;        
	        int b = 0; 
	        try {
	        	int c = a/b;      // automatically ArithmeticException class comes here i.e ArithmeiticException ex = new ArithmeticException 
	        	System.out.println("Result: "+c); 
	        }
	        catch(ArithmeticException e) { // reference ex copied here in e inside paranthesis 
	        	System.out.println("Invalid Input...Try other than 0");
	        }
	        
	        System.out.println("Main Ends....");

	    }

}
//System.out.println("Main Starts....");    
//
//int a = 20;        
//int b = 0;            
//try {​​​​​​​
// int c = a/b;   //ArithmeticExceptin ex = new ArithmeticException(); //bad
// System.out.println("Result: "+c);                
//}​​​​​​​
//catch(ArithmeticException e) {​​​​​​​ // ex reference is copied inside argument e
// System.out.println("Denominator should not be zero");
//}​​​​​​​        
//System.out.println("Main Ends....");
//