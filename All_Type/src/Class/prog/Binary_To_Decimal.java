package Class.prog;
import java.util.Scanner;

	public class Binary_To_Decimal 
	{
		static int isEvilNumber(int num)
		{
			String res = "";
			int count = 0;
			while(num!=0)
			{
				int rem = num%2;
				if(rem==1)
				{
					count++;
				}
				res = rem+res;
				num = num/2;
			}
			return count;
		}
		static int Binary_To_Decimal(int num)
		{
			int sum = 0, power = 1;
			while(num!=0)
			{
				int dig = num%10;
				sum = sum + dig*power;
				power = power*2;
				num = num/10;
			}
			return sum;
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the Number : ");
			int number = sc.nextInt();
			//int decimal = Binary_To_Decimal(number);
			//System.out.println(" Converted decimal form is " +decimal);
			int evil = isEvilNumber(number);
			if(evil%2==0)
			{
				System.out.println(" The number entered " +number+ " is evil number ");
			}
			else
			{
				System.out.println(" The number entered " +number+ " is Not an evil number ");
			}
			sc.close();
		}
	}
