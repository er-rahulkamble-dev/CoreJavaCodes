package exception_handling;
// Assignement
public class ValidateAgeWithException {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int age = 12;
		final int min_age = 18;
		int cal_rem_age;
		try {
			if(age <= min_age) {
				throw new Exception();
			}
			else 
			{
				System.out.println("Congratulations!, you can vote");
			}
		}catch(Exception ex) {
			System.out.println("your age is below 18 you cannot vote");
			cal_rem_age = min_age - age;
			System.out.println("Try next time after "+cal_rem_age+ " year/s");
		}
		
		System.out.println("Thank you!");	
	}
}
