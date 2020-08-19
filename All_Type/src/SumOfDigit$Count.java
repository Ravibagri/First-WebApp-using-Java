import java.util.Scanner;

public class SumOfDigit$Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int sum=0;
		int digit=0;
		int count=0;
		int product=1;
		while(number!=0) {
			digit=number%10;
			sum+=digit;
			number/=10;
			count++;
			product*=digit;
		}
		System.out.print("Sum of Number is "+sum+"\nDigit is "+count);
		System.out.print("\nProduct of digit is "+product);

	}

}
