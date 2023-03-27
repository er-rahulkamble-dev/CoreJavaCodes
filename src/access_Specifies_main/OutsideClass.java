package access_Specifies_main;

import access_Specifiers.DemoTest;

public class OutsideClass extends DemoTest {

	public void oSCM() {
		//DemoTest dtst = new DemoTest(); DemoTest is super class
		//	so we dont need to create object reference of DemoTest class
			dtM1();
			dtM2();// protected method is accessible within sub class only 
			//	so this is not showing any error
//			error dtM3(); // dtM3 is private 
			//error dtM4();// dtM4 is Default
	}
}
