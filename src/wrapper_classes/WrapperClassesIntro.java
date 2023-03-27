package wrapper_classes;

public class WrapperClassesIntro {



    public static void main(String[] args) {
        
        int i = 10;
        
        // convert primitive to object
        
        //@SuppressWarnings("deprecation")
		Integer i1 = new Integer(i); // boxing
        
        //get primitive from object
        
        int j = i1.intValue(); //unboxing
        
        //java 5 introduce auto boxing and unboxing
        
         Integer k1 = 10; // auto boxing
         
         int p = k1; // auto unboxing
         
         
        
        

 

    }

 
}
