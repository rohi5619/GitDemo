package mentor_PavanKumar;

import java.util.Scanner;

public class PrintWeekdayName_SwitchCase_UI 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String input = sc.next();
		
		switch(input)
		{
		case "Monday":
			System.out.println("Day..1");
			break;
			
		case "Tuesday":
			System.out.println("Day..2");
			break;
			
		case "Wednesday":
			System.out.println("Day..3");
			break;
			
		case "Thursday":
			System.out.println("Day..4");
			break;
			
		case "Friday":
			System.out.println("Day..5");
			break;
			
		case "Saturday":
			System.out.println("Day..6");
			break;
			
		case "Sunday":
			System.out.println("Day..7");
			break;
		}
		

	}

}
