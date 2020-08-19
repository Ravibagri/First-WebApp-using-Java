
public class TestCorona {
		public static void main(String[] args)
		{
			String country = "India";
			String states="Delhi";
			switch(country)
			{
				case "China":
					System.out.println("Corona Started");
					break;
				case "Italy":
					System.out.println("Corona outbreak");
					break;
				case "Spain":
					System.out.println("Corona outbreak");
					break;
				case "India":
					switch(states)
					{
						case "MP":
							System.out.println("Corona outbreak in MP");
							break;
						case "Delhi":
							System.out.println("Corona outbreak in Delhi");
							break;
						case "Kerala":
							System.out.println("Corona outbreak in Kerala");
							break;
					}
					break;
			}
		}
	

}
