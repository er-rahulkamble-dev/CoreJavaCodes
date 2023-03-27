package Assignments;

//How do you pass program arguments in STS?
//How to Pass Command Line Arguments in Eclipse
//Step 1: Open the Class Run Configurations Settings. From the class editor, right click and chose “Run As” -> “Run Configurations…”. ...
//Step 2: Specify the Program Arguments in the Arguments Tab. In the pop up window, click on the Arguments tab. ...
//Step 3: Click on the Run button.

//following above steps provide Eggs number

public class EggsCount {

	public static void main(String[] args){

		//Scanner s = new Scanner(System.in);
		
		//System.out.println("enter Total Eggs");

		int Eggs= Integer.parseInt(args[0]);
		int gross_value = Eggs/144;
		int dozen_value = (Eggs-gross_value*144)/12;
		int remaining_eggs = Eggs - (gross_value*144 + dozen_value*12);
		remaining_eggs = remaining_eggs <= 0  ? 0 : remaining_eggs;
		
		System.out.println("Total Eggs: "+Eggs+"\n"+"Counted in units as below: \n"+gross_value+" Gross, "+dozen_value+" Dozen "+"\nEggs left uncounted in unit: "+remaining_eggs +" left.");
	}
}
