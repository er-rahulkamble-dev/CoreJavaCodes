package opps_concepts.string_part;

public class StringEquals {

	public static void main(String[] args) {

		 

        Employee emp1 = new Employee(101,"Ritesh",80000);
        
        Employee emp2 = new Employee(101,"Ritesh",80000);
        
        String st1 = new String("abc");
        String st2 = new String("abc");
        
        System.out.println("-----string comparision-----");
        
        if(st1.equals(st2)) {
            System.out.println("Both strings are equal");//this ans bcz here equals method is already overriden in the of String class
        }else {											//String class is predefined class 
            System.out.println("Both strings are not equal");
        }        
        
        System.out.println("-----emp object comparision-----");
        
        if(emp1.equals(emp2)) {
            System.out.println("Both emps are equal");
        }
        else {
            System.out.println("Both emps are not equal");// this would have ans if we not override the equals and hashcode method in Employee class 
        }    												// here Employee class is User defined so in Employee class 
        									//we need to override equals and hashcode methods of Object class---Object class is Super class of all type of class used in java
        
    }

// Output:
//	 -----string comparision-----
//	 Both strings are equal 
//	 -----emp object comparision-----
//	 Both emps are equal


}
