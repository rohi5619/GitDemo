package mentor_PavanKumar;

import java.util.Scanner;

public class EvenOdd_OneToHundred {

	public static void main(String[] args) 
	{
		//  Print all even numbers between 1 to 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting no: ");
		int sn = sc.nextInt();
		
		System.out.println("Enter ending no: ");
		int en = sc.nextInt();
		
		while(sn<=en)
		{
			if(sn%2==0)
			{
				System.out.println("Even no.." +sn);
			}
			else
			{
				System.out.println("Odd no.." +sn);
			}
			sn++;
		}

	}

}
