import java.util.Scanner;

// express a number as sum of primes

public class GoldBach {
	static int isPrime(int n)
	{
		int flag=1;
		for (int i = 2; i <= n/2; i++) {
			if(n%i == 0)
			{
				flag=0;
				break;
			}
		}
		return flag;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = sc.nextInt();//20
	int flag =0;
	for (int i = 2; i <=num; i++) {//20
		if(isPrime(i)==1)//2
		{
			if(isPrime(num-i)==1)//1
			{
				System.out.println(num + " = " + i + " + " + (num-i));
				flag = 1;
			}
		}
	}
	if(flag==0)//1
	{
		System.out.println("The given number cannot be expressed as gold bach number");
	}
}
}

// any number that can be divided by 1 and by itself
// a number cannot be divided by more than half of its value20