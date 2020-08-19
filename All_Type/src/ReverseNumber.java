import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int number=sc.nextInt();
		System.out.println("Number Before Reverse"+number);
		int reverse=0;
		while(number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number/=10;
		}
		System.out.println("Reverse Number is "+reverse);

	}

}
