package mentor_PavanKumar;

public class TernaryOperator2 {

	public static void main(String[] args) 
	{
		int bill = 17500;
		
		int discount = (bill > 10000)? (bill*10/100) : (bill*5/100);
		System.out.println(discount);

	}

}
