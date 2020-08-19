import java.util.Scanner;

public class oddArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Element");
		int [] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		/*for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}*/
		int countodd=0;
		int counteven=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				countodd++;
			}
			else {
				counteven++;
			}
			System.out.print(arr[i]+" ");
		}
		int odd []=new int [countodd];
		int even[]=new int[counteven];
		int z=0;
		int y=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0){
				even[z]=arr[i];
				z++;
			}
			else {
				odd[y]=arr[i];
				y++;
			}
		}
		System.out.print("\nEven Array is  ");
		for(int i=0;i<even.length;i++){
			System.out.print(even[i]+" ");
		}
		System.out.print("\nodd Array is  ");
		for(int i=0;i<odd.length;i++){
			System.out.print(odd[i]+" ");
		}		
		
	}

}
