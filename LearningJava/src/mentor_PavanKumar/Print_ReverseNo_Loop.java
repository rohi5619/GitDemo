package mentor_PavanKumar;

import java.util.Scanner;

public class Print_ReverseNo_Loop {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input=sc.nextInt(); //5678
		
		int rev=0;
		while(input!=0)
		{
			rev= rev*10 + input%10;
			input=input/10;
	//		rev++;
		}
		System.out.println(rev);

	}

}
