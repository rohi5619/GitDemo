package mentor_PavanKumar;

import java.util.Arrays;

public class String_Session8_ex3 {

	public static void main(String[] args) 
	{
		// Print "abc 123" as abc 123
		
		String s = "abc 123";
		
		String a[] = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[0]);
		System.out.println(a[1]);

	}

}
