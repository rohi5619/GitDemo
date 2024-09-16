package mentor_PavanKumar;

import java.util.Scanner;

public class PrintWeekdayName_IfElse_UI {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weekday's name: ");
		String input = sc.next();
		
		if("Monday".equals(input))
		{
			System.out.println("Day..1");
		}
		else if("Tuesday".equals(input))
		{
			System.out.println("Day..2");
		}
		else if("Wednesday".equals(input))
		{
			System.out.println("Day..3");
		}
		else if("Thursday".equals(input))
		{
			System.out.println("Day..4");
		}
		else if("Friday".equals(input))
		{
			System.out.println("Day..5");
		}
		else if("Saturday".equals(input))
		{
			System.out.println("Day..6");
		}
		else if("Sunday".equals(input))
		{
			System.out.println("Day..7");
		}

	}

}
