package opps_concepts.polymorphismMain;

import java.util.Scanner;

import opps_concepts.polymorphismBean.Circle;
import opps_concepts.polymorphismBean.Rectangle;
import opps_concepts.polymorphismBean.Shape;
import opps_concepts.polymorphismBean.Triangle;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shape name");
        String shapeName = sc.next();
        sc.close();
        
        Shape shape = null;
        
        if(shapeName.equals("circle")) {
            shape = new Circle();        
        }
        else if(shapeName.equals("triangle")) {
            shape = new Triangle();            
        }
        else if(shapeName.equals("rectangle")) {
            shape = new Rectangle();            
        }
        else {
            System.out.println("Invalid option");
        }    
        
        if(shape != null) {
            shape.area();
        }        
    }

 
	

}
