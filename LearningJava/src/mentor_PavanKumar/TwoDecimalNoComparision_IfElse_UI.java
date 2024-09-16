package mentor_PavanKumar;

import java.util.Scanner;

public class TwoDecimalNoComparision_IfElse_UI {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		double inOne = sc.nextDouble();
		
		System.out.println("Enter 2nd no: ");
		double inTwo = sc.nextDouble();
		
		if(inOne == inTwo)
		{
			System.out.println("Both number is same");
		}
		else
		{
			System.out.println("They are different");
		}

	}

}
