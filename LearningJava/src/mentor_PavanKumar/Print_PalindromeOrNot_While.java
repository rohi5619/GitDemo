package mentor_PavanKumar;

import java.util.Scanner;

public class Print_PalindromeOrNot_While 
{

	public static void main(String[] args) 
	{
		// Checking Palindrome or Not !!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		int rev=0;
		int org_num=num;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
	//	String str = Integer.toString(rev);

		if(org_num == rev)
		{
			System.out.println("Palindrome: " +org_num);
		}
		else
		{
			System.out.println(rev);
		}
	
	
		
	}

}
