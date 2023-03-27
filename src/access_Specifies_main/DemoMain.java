package access_Specifies_main;

//error import access_Specifiers.Test;// this Show error The type access_Specifiers.Test is not visible
								// Bcz Class Test has Default specifier

import access_Specifiers.DemoTest;


public class DemoMain {
	
	//error Test tst = new Test(); // here Test Class has Default Access Specifier
							// So it is showing error to access in different package
	
	DemoTest dtst = new DemoTest();
}
