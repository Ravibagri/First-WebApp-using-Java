
public class For_To_While {

/*	While Loop:
		Syntax:
			while(condition)
			{
				statements
			}
	*/
		static int i=3; static int j=1;
		public static void main(String[] args)
		{	
			/*for(i=1;i<=3;i++)
			{
				for(j=1;j<=3;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}*/
			int i=1;
			
		while(i<=4) {
			i++;
			int j=1;
			while(j<=5) {
				System.out.print("* ");
				j++;
			}
			System.out.println("");
		}
	}
}
