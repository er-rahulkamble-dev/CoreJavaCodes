package Assignments;

public class Maths {

	public static void main(String[] args){
		int a = 12;
		
		int result = isPrime(a);// isPrime method is calling here.

		if(result==1){
			System.out.println(a+" is not prime number");
		}
		else{
			System.out.println(a+" is prime number");
		}

		boolean palindromeresult = isPalindrome(a);// isPalindrome method is calling here.

		if(palindromeresult==true){
			System.out.println(a+" is palindrome");
		}
		else{
			System.out.println(a+" is not palindrome");
		}


	}
	//--------main method ends here--------------
	static int isPrime(int a){
		int flag=0;
		for(int i = 2; i*2 < a; i++){
			if(a%i==0){
				  flag=1;
				  break;
			}
			else{
				 flag=0;
			}
		}
		return flag;
	}
	//-----------isPrime method ends here----------
	static boolean isPalindrome(int a){
		int rm=0,sum=0, temp;
		temp=a;
		boolean value=false;
		while(temp>0)
		{
			rm=temp%10;
			sum=(sum*10)+rm;
			temp/=10;
		}
		if(a==sum){
			value=true;
		}
		else{
			value=false;
		}
		return value;
	}
}