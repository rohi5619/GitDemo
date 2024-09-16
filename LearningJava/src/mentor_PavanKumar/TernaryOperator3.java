package mentor_PavanKumar;

public class TernaryOperator3 {

	public static void main(String[] args) 
	{
		int a=5, b=11, c=-15;
		
		int low = (a<b)? a:b;
		low = (low < c) ? low : c;
		System.out.println(low);
	
	/*	
		int num1 = 5, num2 = 11, num3 = -15;
	    int lowest = (num1 <= num2) ? ((num1 <= num3) ? num1 : num3) : ((num2 <= num3) ? num2 : num3);
	    System.out.println("Minimum Number: " + lowest);
	    
	 */   
	}

}
