package opps_concepts.string_part;

public class StringCompare {

	 public static void main(String[] args) {
	        
//       String st1 = "hello"; // value assigned by literals
//       String st2 = "hello";
//       
//       if(st1==st2) {
//           System.out.println("Both strings refer to same object");
//       }else {
//           System.out.println("Both strings refer to different object");
//       }
       
       
       String st1 = new String("hello");
       String st2 = new String("hello");
       
       if(st1==st2) {
           System.out.println("Both strings refer to same object");
       }else {
           System.out.println("Both strings refer to different object");
       }

       if(st1.equals(st2)) {
           System.out.println("Both strings refer to same object");
       }else {
           System.out.println("Both strings refer to different object");
       }
    } 
}
