package mentor_PavanKumar;

import java.util.Arrays;

public class String_Session8_ex4 {

	public static void main(String[] args) 
	{
		// "Rohit Basak", without using equalsIgnorecase() having "rohit" or not
		
		String name = "Rohit Basak";
		
		String a[] = name.split(" ");
		System.out.println(Arrays.toString(a));  // Rohit, Basak
		
		System.out.println(a[0].toLowerCase().contains("rohit"));  // true

	}

}
