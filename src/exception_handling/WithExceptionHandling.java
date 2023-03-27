package exception_handling;

public class WithExceptionHandling {

	 public static void main(String[] args) {        
	        
	        System.out.println("Main Starts....");    
	                
	        int a = 20;        
	        int b = 0;            
	        try {
	            int c = a/b;   //ArithmeticExceptin ex = new ArithmeticException(); //bad ; throw ex;
	            System.out.println("Result: "+c);                
	        }
	        catch(ArithmeticException e) { // ex reference is copied inside argument e
	            //System.out.println("Denominator should not be zero");
	            //System.out.println(e);
	            //System.out.println(e.getMessage());
	            e.printStackTrace();
	        }        
	        System.out.println("Main Ends....");
	    }

}
