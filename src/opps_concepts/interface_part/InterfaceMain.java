package opps_concepts.interface_part;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        //MyClass myClass = new MyClass();
        MyInterface myClass = new MyClass(); // interface reference and implementation class object
        myClass.aMethod();
        
        System.out.println("PI value:"+MyInterface.PI);
	}

}
