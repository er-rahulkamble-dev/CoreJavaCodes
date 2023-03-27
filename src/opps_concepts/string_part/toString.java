package opps_concepts.string_part;

public class toString {

	

		 

	    public static void main(String[] args) {
	        
	        Emp e1 = new Emp(101,"Sachin");
	        //String value = e1.toString();
	        //System.out.println(value);        
	        System.out.println(e1); // by default, e1.toString() method called.
	        
	        //System.out.println(e1.toString()); //output: com.abc.strings.Emp@15db9742
	    }
}

	 


	

class Emp extends Object {
    
    private int empno;
    private String name;
    
    Emp(int empno,String name) {
        this.name= name;
        this.empno = empno;    
    }
    
    public String toString() {
        return "[ "+empno+","+name+" ]";
    }    
}