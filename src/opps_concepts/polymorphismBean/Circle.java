package opps_concepts.polymorphismBean;

import java.util.Scanner;

public class Circle extends Shape {

	Scanner s = new Scanner(System.in);
	 double pi = 3.14;
	 double radius = 10;
//	 System.out.println("enter radius");
// 	double radius = s.nextDouble();
// 	s.close();
	 // private double radius;
	    public void area() {
	   	 	System.out.println("enter radius");
	     	int radius = s.nextInt();
	     	s.close();
	    	double area = pi*(radius*radius);
	    	System.out.println("Area: "+area);
	        System.out.println("Circle area drawn....");
	        
	    }
}
