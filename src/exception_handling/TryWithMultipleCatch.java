package exception_handling;

// Execution instructions 
// Execute this program and give input at run time
// How to give run time inputs here in Eclipse --->
//--->Right click on wokspace and go to the 'Run As'---> Click on 'Run Configurations'--> Make sure the name of Projecct and Main class 
//--> and click on Apply --> then run and give inputs

public class TryWithMultipleCatch {

	public static void main(String[] args) {    

        System.out.println("Main Starts....");        
        
        try {
            int a = Integer.parseInt(args[0]);        
            int b = Integer.parseInt(args[1]);    
            
            int c = a/b;   
            System.out.println("Result: "+c);                
        }
        catch(ArithmeticException e) { 
            System.out.println("Denominator should not be zero");
        }
        catch(NumberFormatException e) { 
            System.out.println("Pass correct type of args...");
        }
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Pass correct number of args....");
        }
        System.out.println("Main Ends....");
    }

}
