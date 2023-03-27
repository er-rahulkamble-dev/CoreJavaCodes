package opps_concepts.string_part;

public class ReferanceCompareEx {

	  public static void main(String[] args) {
	        
	        A a1 = new A(10);   
	        A a2 = new A(10);
	        
	        
	        System.out.println("a1 = "+a1);
	        System.out.println("a2 = "+a2);
	        
	        if(a1==a2) {
	            System.out.println("Both references refer to same object");
	        } else {
	            System.out.println("Both references refer to different objects");
	        }
	    }

}
class A {
    
    int i; 
    
    A(int i) {
        this.i = i;
    }    
    
}