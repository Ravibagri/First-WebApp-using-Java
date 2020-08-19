import java.util.Scanner;

public class NumberPgms {

	int countDigits(int num)//153   
	{
		int count = 0;
		while(num!=0)
		{
			num/=10;
			count++; //
		}
		return count;
	}
	int power(int base, int exponent)
	{
		int result = base;//
		for (int i = 1; i < exponent; i++) {//2,4//2*2=4*2=8*2
			result = result * base;//result=3*3=9*3=27
		}
		return result;
	}
	int amstrong(int num)//153
	{
		int sum=0;
		int exp = countDigits(num);//3
		while (num!=0) //153								
		{
			int dig = num % 10;	//5		,1			//
			sum = sum + power(dig, exp);//0+27+125+1=153
			num /=10;//15,1,0						
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find whether it is amstrong number or not: ");
		int number = sc.nextInt();//153
		NumberPgms am = new NumberPgms();
		int result = am.amstrong(number);
		if(result == number)
		{
			System.out.println("Given number " + number + " is an amstrong number.");
		}
		else
		{
			System.out.println("Given number " + number + " is not an amstrong number.");
		}
				
	}
}