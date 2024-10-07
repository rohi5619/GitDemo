package mentor_PavanKumar;

import java.util.Arrays;

public class Arrays_Session7_ex3 
{

	public static void main(String[] args) 
	{
		// Print values in Array, ascending order
		
		int arr[] = {30, 10, 40, 20, 50, 60};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(arr));

	}

}
