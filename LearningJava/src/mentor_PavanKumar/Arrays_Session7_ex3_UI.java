package mentor_PavanKumar;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Session7_ex3_UI 
{

	public static void main(String[] args) 
	{
		// Print values in Array, ascending order with User Input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number before sorting..");
		
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("After sorting, values are..");
		System.out.println(Arrays.toString(arr));

	}

}
