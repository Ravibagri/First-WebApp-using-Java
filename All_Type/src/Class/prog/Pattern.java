package Class.prog;
	import java.util.Scanner;
	public class Pattern 
	{
		static void pattern1()
		{
			for(int i =0 ;i<=3;i++)
			{
				for(int j=0;j<=3;j++)
				{ 
					System.out.print(" * ");
				}
				System.out.println();
			}
		}
		static void pattern2()
		{
			for(int i =0; i<=3; i++)
			{
				for(int j = i; j<=3 ; j++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
		}
		static void pattern3()
		{
			for(int i =1; i<=5; i++)
			{
				for(int j = 1; j<=5 ; j++)
				{
					System.out.print(i +" ");
				}
				System.out.println();
			}
		}
		static void pattern4()
		{
			for(int i = 1 ; i<=5 ; i++)
			{
				for(int j = 1; j<=5; j++)
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		/*
		 1 3 5 7 9
		 2 4 6 8 10
		 1 3 5 7 9 
		 2 4 6 8 10
		 1 3 5 7 9 
		 */
		static void pattern5()
		{
			for(int i =1 ; i<=5; i++)
			{
				int odd = 1; int even = 2;
				for(int j=1; j<=5; j++)
				{
				if(i%2==0)
				{
					System.out.print(even + " ");
					even = even +2;
					
				}
				else
				{
					System.out.print(odd + " ");
					odd = odd +2;
				}
			}
				System.out.println();
		}
	}
		/*
		 0 0 0 0 0
		 1 1 1 1 1
		 0 0 0 0 0
		 1 1 1 1 1 
		 0 0 0 0 0
		 */
		static void pattern6()
		{
			for(int i =1 ;i<=5;i++)
			{
				int odd = 0; int even = 1;
				for(int j = 1 ; j<=5; j++)
				{
					if(i%2==0)
					{
						System.out.print(even + " ");
					}
					else
					{
						System.out.print(odd + " ");
					}
				}
				System.out.println();
			}
		}
		/*
		 A B C D E 
		 F G H I J 
		 K L M N O 
		 P Q R S T 
		 U V W X Y 
		 */
		static void pattern7()
		{
			char start = 'A';
			for(int i =1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					System.out.print(start + " ");
					start++;
				}
				System.out.println();
			}
		}
		/*
		 	1 1 1 1 1 
		 	B B B B B
		 	3 3 3 3 3
		 	D D D D D
		 	5 5 5 5 5
		 */
		static void pattern8()
		{
			char even = 'A';	
			for(int i=1 ; i<=5; i++)
			{
				for(int j =1 ; j<=5; j++)
				{
					if(i%2==0)
					{
						System.out.print(even + " ");
						
					}
					else
					{
						System.out.print(i + " ");
						
					}
				}even++;
				System.out.println();
			}
		}
		/*
		 A 2 C 4 E
		 A 2 C 4 E
		 A 2 C 4 E
		 A 2 C 4 E
		 A 2 C 4 E*/
		 static void pattern9()
		{
			for(int i=1; i<=5; i++)
			{ int even = 2;char odd = 'A';
				for(int j=1; j<=5; j++)
				{
					if(j%2==0)
					{
						System.out.print(even + " ");
						even = even + 2;
					}
					else
					{
						System.out.print(odd + " ");
					}	odd++;
				}
				System.out.println();
			}
		}
		 /*
		  	1 2 3 4 5 
		  	6 7 8 9 1 
		  	2 3 4 5 6 
		  	7 8 9 1 2 
		  	3 4 5 6 7
		  */
		 static void pattern10()
		 {
			 int num = 1;
			 for(int i =1;i<=5;i++)
			 {
				 for(int j =1; j<=5; j++)
				 {
					 System.out.print(num + " ");
					 num++;
					 if(num==10)
					 {
						 num=1;
					 }
				 }
				 System.out.println();
			 }
		 }
		 /*
		  
		  * * * * *
		  * * * * 
		  * * *
		  * *
		  * 
		  
		  */
		 static void pattern11()
		 {
			for(int i =1; i<=5; i++)
			{
				for(int j =i; j<=5; j++)
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
		 }
		 /*
		  					*
		  	             *		*
		  	          *     *       *
		  	        *    *      *     *
		  */
		 static void pattern12()
		 {
			 for(int i=1;i<=4;i++)
			 {
				 for(int j =4;j>=i;j--)
				 {
					 System.out.print(" ");
				 }
				 for(int k = 1; k<=i; k++)
				 {
					 
					 System.out.print(" * ");
				 }
				 System.out.println();
			 }
		 }
		 /*
		  		    *
		  	    *	*
		  * 	*   *
		  */
		 static void pattern13()
		 {
			 int i,j;
			for (i =1;i<5;i++)
			{
				System.out.print("\t\t");
			
			for(j=1; j <=i; j++)
			{
				 System.out.print(" * ");
			}
			
			System.out.println();
			}
			}
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println(" ------------ Lets create a Pattern ---------------- \n ");
			System.out.println(" Choose the pattern to be displayed -> ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println();
					pattern1();
					break;
			case 2:
					pattern2();
					break;
			case 3:
					pattern3();
					break;
			
			case 4:
					pattern4();
					break;
			case 5:
					pattern5();
					break;
			case 6:
					pattern6();
					break;
			case 7:
					pattern7();
					break;
			case 8:
					pattern8();
					break;
			case 9:
					pattern9();
					break;
			case 10:
					pattern10();
					break;
			case 11:
					pattern11();
					break;
			case 12:
					pattern12();
					break;
			case 13:
					pattern13();
					break;
				default:
				System.out.println(" You have entered Wrong Choice ");
				break;
			}
			
			sc.close();
		}
	}
