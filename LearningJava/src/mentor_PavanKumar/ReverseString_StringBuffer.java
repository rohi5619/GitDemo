package mentor_PavanKumar;

public class ReverseString_StringBuffer {

	public static void main(String[] args) 
	{
		String str = "Rohit Basak";
		// String str = "123456";
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}

}
