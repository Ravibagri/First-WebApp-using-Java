import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int number=num;//123
		int rev=0;
		while(number!=0) {
			int dig=number%10;//3,2,1
			rev=rev*10+dig;//0*10+3=3*10+2=32*10+1=321
			number/=10;//12,1
		}
		if (num==rev) {
			System.out.println("Number is Palindrime");	
		}
		else {
			System.out.println("Number is not Palindrime");
		}
	}

}
