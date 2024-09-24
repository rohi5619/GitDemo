package mentor_PavanKumar;

import java.util.Scanner;

public class Print_SumOfDigits {

	public static void main(String[] args) 
	{
		// Print sum of input digits
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
	//	int num=1234;
		int sum=0;
		
		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println(sum);
	}

}
