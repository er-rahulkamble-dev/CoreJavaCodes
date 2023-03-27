package access_Specifiers;
 
class Test {

	 DemoTest dtst = new DemoTest(); // here dtst is instance variable of class DemoTest
	 
	 void testMethod1() {
	
		//error dtM1();// reference obj of that class is required to access its method 
		dtst.dtM1();
		dtst.dtM2();
		//error dtst.dtM3(); // dtM3 method is private
		dtst.dtM4();
	 }
	//error dtst.dtM2();// outside of method we cannot access method of other accessed class 
}