package mentor_PavanKumar;

import java.util.Arrays;

public class String_Session8_ex2 
{

	public static void main(String[] args) 
	{
		// Print abc,123@xyz as abc 123 xyz
		
		String s = "abc,123@xyz";
		
		String arr[] = s.split(",");
		System.out.println(Arrays.toString(arr));  // abc, 123@xyz
		
		System.out.println(arr[0]);  // abc
		System.out.println(arr[1]);  // 123@xyz
		
		String arr1[] = arr[1].split("@");
		
		System.out.println(arr[0]);   // abc
		System.out.println(arr1[0]);  // 123
		System.out.println(arr1[1]);  // xyz

	}

}
