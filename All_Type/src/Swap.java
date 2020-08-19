import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Ist Number");
		long a=sc.nextLong();
		System.out.println("Enter 2nd Number");
		long b=sc.nextLong();
		System.out.println("Before Swap Ist Number is "+a+"\nAnd Second is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap Ist Number is "+a+"\nAnd Second "+b);
		sc.close();
		

	}

}
