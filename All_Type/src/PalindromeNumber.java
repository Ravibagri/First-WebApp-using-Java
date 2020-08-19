import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int number=sc.nextInt();
		int num=number;
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		if(number==rev) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}

	}

}
