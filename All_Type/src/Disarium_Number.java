
public class Disarium_Number {
	long Square(int num) {
		return num*num;
	}
	int sum_of_digit(int num) {
		int sum=0;
		while(num!=0) {
			int dig=num%10;
			sum=sum+dig;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Disarium_Number dn=new Disarium_Number();
		
		

	}

}
