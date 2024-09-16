package mentor_PavanKumar;

import java.util.Scanner;

public class TicketPrice_Nested_If_Else {

	public static void main(String[] args) 
	{
		int age=120;
		boolean isWeekend=false;
		if(age<13)
		{
			if(isWeekend=true)
			{
				System.out.println("Ticket Price is 120");
			}
			else
			{
				System.out.println("Ticket Price is 100");
			}
		}
			else if(age >= 13 && age <64)
			{
				if(isWeekend=true)
				{
					System.out.println("Ticket Price is 180");
				}
				else
				{
					System.out.println("Ticket Price is 150");
				}
			}	
				else if(age >=65 && age <100)
				{
					if (isWeekend=true)
					{
						System.out.println("Ticket Price is 160");
					}
					else
					{
						System.out.println("Ticket Price is 130");
					}
				}
				else
				{
					System.out.println("FREE !!!");
				}
			}
		

	

}
