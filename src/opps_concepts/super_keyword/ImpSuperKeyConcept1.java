package opps_concepts.super_keyword;

public class ImpSuperKeyConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC abc = new XYZ(); // here you can come to know the IS-A relation 
		abc.m1(); // reference of ABC class have object of class XYZ
		// here it is possible code will run 
        
	}

}
class ABC {    
    
    void m1() {
        System.out.println("M1 inside class ABC");
    }
}

 

class XYZ extends ABC {    
    
    void m1() {  // here method of super class or parent class is overrided 
    	 super.m1(); // this is used when even you superclass method is overriden, if u wnat to show supercalss method
        System.out.println("M1 is overridden inside class XYZ");        
    }
    
}