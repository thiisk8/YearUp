
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args)
	{
		System.out.println("Enter the day of the week:");
		Scanner sc = new Scanner(System.in);
		String dayOfWeek = sc.nextLine();
		EvaluateDayOfWeek(dayOfWeek);
	}

	public static void EvaluateDayOfWeek(String dayOfWeek)
	{

		if(dayOfWeek != null)

		{

			if (!dayOfWeek.isEmpty())

			{
				if (dayOfWeek.equalsIgnoreCase("Monday") ||
						dayOfWeek.equalsIgnoreCase("Tuesday") ||
						dayOfWeek.equalsIgnoreCase("Wednesday") ||
						dayOfWeek.equalsIgnoreCase("Thursday") ||
						dayOfWeek.equalsIgnoreCase("Friday"))
				{
					System.out.println(dayOfWeek + "is a weekday!");
				}
				else if (dayOfWeek.equalsIgnoreCase("Saturday") ||
						dayOfWeek.equalsIgnoreCase("Sunday"))
				{
					System.out.println(dayOfWeek + " is not a valid day!!");
				}
				else
				{
					System.out.println(dayOfWeek +" is not a valid day!!");
				}
			}
			else
			{
				System.out.println("Day of week is an empty string!!");
			}

		}

		else

		{
			System.out.println("You have give me a null string!!");
		}

	}
}