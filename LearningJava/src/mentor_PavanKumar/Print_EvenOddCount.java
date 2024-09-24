package mentor_PavanKumar;

import java.util.Scanner;

public class Print_EvenOddCount {

	public static void main(String[] args) 
	{
		// Input= 23456, print number of Even & Odd count of Input.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numnber: ");
		int num = sc.nextInt();
		
	//	int num = 23456;
		int eCount=0;
		int oCount=0;
		int x=0;
		while(num>0)
		{
			x= num%10;
			num=num/10;
			
			if(x%2==0)
			{
				System.out.println("This is Even.. " +x);
				eCount++;
			}
			else
			{
				System.out.println("This is Odd.." +x);
				oCount++;
			}
			
		}
		System.out.println("Total No of Evens: " +eCount);
		System.out.println("Total No of Odds: " +oCount);

	}

}
