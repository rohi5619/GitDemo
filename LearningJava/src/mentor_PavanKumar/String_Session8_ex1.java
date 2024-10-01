package mentor_PavanKumar;

public class String_Session8_ex1 
{

	public static void main(String[] args) 
	{
		// print $15,20,550 as 1520550
		
		String amount = "$15,20,550";
		
		System.out.println(amount.replace("$", ""));  // 15,20,550
		System.out.println(amount.replace("$", "").replace(",", ""));  // 1520550

	}

}
