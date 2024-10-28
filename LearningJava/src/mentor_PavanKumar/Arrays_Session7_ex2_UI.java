package mentor_PavanKumar;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Session7_ex2_UI {

	public static void main(String[] args) 
	{
		// Print duplicates values from Array using User Input
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[6];
	//	int val=20;
		int dupCount=0;
		boolean dup=false;
		
		System.out.println("Enter the Numbers: ");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]==20)
			{
				dupCount ++;
				dup=true;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		if(dup==true)
		{
			System.out.println("Total duplicate count is: " +dupCount);
		}
		else
		{
			System.out.println("No duplicate Found");
		}
	}

}
