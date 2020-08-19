
public class EnumSwitch {
	public enum States{MP,KL,MH,UP,AP}
	public static void main(String[] args)
	{
		States[] affected = States.values();
		for(States st:affected)
		{
			switch(st)
			{
				case MP:
					System.out.println("MP is not affected");
					break;
				case KL:
					System.out.println("KL is affected");
					break;
				case MH:
					System.out.println("MH is affected");
					break;
				case UP:
					System.out.println("UP is affected");
					break;
				case AP:
					System.out.println("AP is affected");
					break;
			}
		}

	}

}
