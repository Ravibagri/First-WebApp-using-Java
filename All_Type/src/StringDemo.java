
public class StringDemo {

	public static void main(String[] args) {
		String arr[]= {"Pooja","Neha","Richa","Pallavi"};
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i].compareTo(arr[j])>0) 
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int t=0;t<arr.length;t++) {
			System.out.print(arr[t]+" ");
		}

	}

}
