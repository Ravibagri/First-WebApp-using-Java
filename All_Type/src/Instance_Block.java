
public class Instance_Block {
	{
		System.out.println("this is instance Block");
	}
	
	public static void main(String[] args) {
		System.out.println("craetede");
		Instance_Block b1=new Instance_Block();
		Instance_Block b2=new Instance_Block();
		Instance_Block b3=new Instance_Block();
		System.out.println(b1);

	}
	{
		System.out.println(" End this is instance Block");
	}

}
