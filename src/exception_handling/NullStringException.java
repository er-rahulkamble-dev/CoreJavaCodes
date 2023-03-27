package exception_handling;

public class NullStringException extends Exception{
	
	String msg;
	NullStringException(String msg){
		this.msg = msg;
	}
	public String rtrnString() {
		
		return msg;
				
	}

}
