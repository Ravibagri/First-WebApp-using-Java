
public class Digit_Count {
	 int count(int a) {
		int count=0;
		while(a!=0) {
			a= a/10;
			count++;
			
		}
		return count;
	}
	public static void main(String[] args) {
		Digit_Count dc=new Digit_Count();
		System.out.println(dc.count(12345));
		
	}

}
