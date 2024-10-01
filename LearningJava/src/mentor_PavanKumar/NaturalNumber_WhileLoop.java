package mentor_PavanKumar;

import java.util.Scanner;

public class NaturalNumber_WhileLoop {

	public static void main(String[] args) 
	{
		// Print Natural Number eg. 1 to 50
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting Number: ");
		int sn = sc.nextInt();
		
		System.out.println("Ending Number: ");
		int en = sc.nextInt();
		
		while(sn<=en)
		{
			System.out.println(sn);
			sn ++;
		}

	}

}
