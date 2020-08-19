
public class Squre {
	int sum(int base,int exp) {
		int result = base;
		for(int i=1;i<exp;i++) {
			result=result*base;
		}
		return result;
	}
public static void main(String[] args) {
	Squre m=new Squre();
	int c=m.sum(5,4);
	System.out.println(c);
	
	}
	
}