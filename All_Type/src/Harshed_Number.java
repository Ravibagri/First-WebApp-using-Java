
public class Harshed_Number {

	public static void main(String[] args) {
		int number=21;
		int sumofdig=0;
		while(number!=0) {
			int digit=number%10;
			sumofdig=sumofdig+digit;
		}
		if(number%sumofdig==0) {
			System.out.println("Number is Harshed");
		}
		else {
			System.out.println("Number is not Harshed");
		}

	}

}
