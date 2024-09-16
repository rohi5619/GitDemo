package mentor_PavanKumar;

public class ReverseString_StringConcatenation {

	public static void main(String[] args) {
		
		String str = "Kolkata";
		String rev = "";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
	}

}
