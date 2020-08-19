package Class.prog;
import java.util.Scanner;

	public class Binary_String_Prime 
	{
		static double Binary_Sum(double f,double s) // 10 , 11
		{
			double temp=0; double temp1 = 0;
			while(f!=0 && s!=0)
			{
				temp= f % 10; //10%10-> 0 , 1%10-> 1
				temp1 = s % 10; // 11%10-> 1, 1%10->1
				f = f/10; //10/10-> 1 , 1/10-> 0
				s = s/10; // 11/10-> 1, 1/10-> 0
				double sum = temp + temp1;
				double sum1 = sum;
				if(temp==1 && temp1==1)
				{
					
				}
			}
			return temp;
			
		}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 1st Binary Number : ");
			double first = sc.nextInt();
			System.out.println("Enter the 2nd Binary Number : ");
			double second = sc.nextInt();
			Binary_Sum(first);
			
			/*System.out.println("Enter the 1st Integer : ");
			int first = sc.nextInt();
			System.out.println("Enter the 1st Integer : ");
			int second = sc.nextInt();
			if(first<second)
			{
				System.out.println(first + " < " +second);
			}
			else if(first!=second)
			{
				System.out.println(first + " != " +second);
			}
			else if(first>=second)
			{
				System.out.println(first + " >= " +second);
			}
			else
			{
				System.out.println(" Please Check Condition Again ");
			}*/
			
		}
	}

