package access_Specifiers;

public class DemoTest {
 
	Test tst = new Test(); // test class has Default access specifier so 
	// Default access specifier class is accessible within Package.
	
	public void dtM1() {
		
	}
	protected void dtM2() {// protected means also a default level, protected specified class you can only access within a package and in subclass or inheritance
		
	}
	private void dtM3() {// Private method is accessible within class only
		
	}
	void dtM4() {
		
	}

	
}
