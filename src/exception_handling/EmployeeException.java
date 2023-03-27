package exception_handling;

public class EmployeeException extends Exception{
	
	String msg;
	EmployeeException(String msg){
		this.msg = msg;
	}
	public String retrnMsg() {
		
		return "[..."+msg+"...]";
	}

}
