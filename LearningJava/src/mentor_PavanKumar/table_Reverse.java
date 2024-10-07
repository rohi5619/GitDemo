package mentor_PavanKumar;

import java.util.Scanner;

public class table_Reverse 
{

	public static void main(String[] args) 
	{
		// Print table of any number in reverse order.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting number: ");
		int sNo = sc.nextInt();
		
		System.out.println("Enter ending number: ");
		int eNo = sc.nextInt();
		
		System.out.println("Table of: ");
		int tNo = sc.nextInt();
		
		while(sNo >= eNo)
		{
			System.out.println(sNo + "*" + tNo + "=" +(sNo * tNo));
			sNo --;
		}

	}

}
