package opps_concepts.singletons.main;

import opps_concepts.singletons.bean.AppConfig;

public class AppConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppConfig obj1 = AppConfig.getInstance() ;
		AppConfig obj2 = AppConfig.getInstance() ;
		AppConfig obj3 = AppConfig.getInstance() ;
		// here we are calling same object which is created in AppConfig with Private access modifier.
		//--here is not creating differnt object each time it take same obj which is returning form getInstance public static method.
		obj1.setLogData("This user logined logined yesterday");
		obj2.setLogData("This user logined today");
		obj3.setLogData("This user logined day afer yesteday");
		
		System.out.println(obj1.getLogData());
		System.out.println(obj2.getLogData());
		
		// Important to read
		// If this class perform Time consuming tasks 
		// and if you need multiple objects of this class it will lead
		// lagging and software buffering to avoid this effect 
		// Java has introduced a Concept called Singletons which helps
		// you here, How does it works
		
		// It enforce to create only one object and use where it is required in
		// in Whole Software.
		
		// Let say Software creates a continues log files of which button user press more time
		// On which page user stays for more than 30 mins 
		// Which problem user face on software to note down all this kind of information
		// Software it self call a class to create log file of that particular file 
		
		// And if user using for long time and continue his operation on software then same class create new objects
		// for each new operation performs on application so to avoid this effect
		// and Call only one time object and required file from secondary memory location until the session finishes
		// we create singletons class of which performs creating a log files.
		
	
		
		
		
	}

}
