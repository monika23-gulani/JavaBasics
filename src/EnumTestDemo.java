
public class EnumTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day[] days =Day.values();
		for(Day d:days)
		{
			switch(d)
			{
			case Sun:
				System.out.println("Sunday");
				break;
			case Mon:
				System.out.println("Monday");
				break;
			case Tue:
				System.out.println("Tuesday");
				break;
			case Wed:
				System.out.println("Wednesday");
				break;
			case Thur:
				System.out.println("Thursday");
				break;
			case Fri:
				System.out.println("Friday");
				break;
			case Sat:
				System.out.println("Saturday");
				break;
				default:
					System.out.println("Invalid day");
					break;
			}
		}

	}

	public enum Day
	{
		Sun,
		Mon,
		Tue,
		Wed,
		Thur,
		Fri,
		Sat
	}
}
