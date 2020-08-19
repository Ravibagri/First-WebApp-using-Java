
public class WrapperDemo {

	public static void main(String[] args) {
		int a=45;
		Integer b= Integer.valueOf(a);//b=45

		System.out.println(b+10);
		String s="50";
		
		Integer g=new Integer(10);
		Integer z=new Integer(20);
		
		System.out.println(g+z);
		
		String at="20"+"30";
		
		System.out.println(at);
		
		int y=g+z;
		System.out.println(y);
		int h=Integer.parseInt(s);
		System.out.println(h+10);
		String k="34.34";
		double d=Double.parseDouble(k);

	}

}
