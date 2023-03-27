package opps_concepts.singletons.bean;

//--------Definition: Singleton pattern is mostly used in multi-threaded and database applications. 
//--------It is used in logging, caching, thread pools, configuration settings etc.

//-----------How is it Created ?-----
//-------Make private constructor: Private constructor to restrict instantiation of the class from other classes.
//-------Private static variable of the same Class that is the only instance of the class.
//-------Public static method that returns the instance of the class, this is the global access point for outer world
//-------to get the instance of the singleton class.

public class AppConfig {
	
	// Make default Constructor Private 
	private AppConfig() {
		
	} 
	// Create Static Object 
	private static AppConfig obj = null;
	
	private String logData = null;
	
	public void setLogData(String logData) {
		this.logData = logData;
	}
	public String getLogData() {
	
		return logData;
	}
	// Create Static Function to return that static Object on call
	public static AppConfig getInstance() {
		if(obj == null) { 

			// this condition signify that if there is need of singleton class then and then only it call 
			// Sometime we doesn't require the Singleton class but it call on software runs so to avoid that we use this condtion to object
			// this condition is to use this class's object at first time of software call to
			// To avoid 
	
			 obj = new AppConfig();
		}
		return obj;
	}
	// getInstance return the object. In whole Software 

}
