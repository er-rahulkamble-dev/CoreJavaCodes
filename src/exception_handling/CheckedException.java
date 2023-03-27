package exception_handling;

public class CheckedException {

	 public static void main(String[] args)    {
	        
	        System.out.println("Main method starts....");        
	        try {
	            aMethod();
	        }
	        catch(Exception e) {
	            System.out.println("class not available \n"+ e);
	        }            
	        System.out.println("Main method Ends....");
	    }
	    
	    static void aMethod() throws ClassNotFoundException {
	        
	        System.out.println("Method starts....");
	        // rule: for checked exception , either handle or declare
	        
	        Class.forName("com.abc.exceptions.Emp"); // throwing ClassNotFoundException which is checked
	                
	        //int c = 10/0; // throwing ArithmeticExcetion which is unchecked
	        
	        System.out.println("Method ends....");
	    }    
}
