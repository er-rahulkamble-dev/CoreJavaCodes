package opps_concepts.super_keyword;

public class Imp2SuperKeyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cl_1 abc = new Cl_2(); // here you can come to know the IS-A relation 
		abc.m1(); // reference of ABC class have object of class XYZ
		// here it is possible code will run 
       
	}

}
class Cl_1 {    
    
	String str = "hello";
    void m1() {
        System.out.println("M1 inside class ABC");
    }
    void m2(int i) {
    	
    	i = i*i;
    	System.out.println("isqrt: "+i);
    }
    
}

 

class Cl_2 extends Cl_1 {    
    void m1() {  // here method of super class or parent class is overrided 
    	 super.m1();// this is used when even you superclass method is overriden, if u wnat to show supercalss method
    	 System.out.println("M1 is overridden inside class XYZ"); 
    	 super.m2(2);

    }
    
    
}