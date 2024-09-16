package mentor_PavanKumar;

import java.util.Scanner;

public class LargeAmontThree_IfElse_UI {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int inOne = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int inTwo = sc.nextInt();
		
		System.out.println("Enter 3rd no: ");
		int inThree = sc.nextInt();
		
		if(inOne > inTwo && inOne > inThree)
		{
			System.out.println("Largest No is: " +inOne);
		}
		else if(inTwo > inOne && inTwo > inThree)
		{
			System.out.println("Largest No is: " +inTwo);
		}
		else
		{
			System.out.println("Largest No is: " +inThree);
		}

	}

}
