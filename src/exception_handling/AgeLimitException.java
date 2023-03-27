package exception_handling;

public class AgeLimitException extends Exception {

private String message;
    
    public AgeLimitException(String message) {
        this.message = message;
    }

 

    @Override
    public String toString() {        
        //return "Not eligible for voute because your age is less than 18 years.";
        return "[ "+ message +" ]";
    }
}
