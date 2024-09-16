package mentor_PavanKumar;

public class ProductCat_Nested_If_Else {

	public static void main(String[] args) 
	{
	// Electronics: 10% discount.
	//	Clothing: 15% discount, but 20% if the purchase amount is over Rs. 5000.
	//	Food: No discount, unless the purchase amount is over Rs. 1000, then 5% discount.
		
		String productCat="Electronics";
		double orderAmount=4500;
		
		if("Food".equals(productCat))
		{
			if(orderAmount>=1000)
			{
				System.out.println("5% discount..");
			}
			else
			{
				System.out.println("No discount..");
			}
		}
		else if("Clothing".equals(productCat))
		{
			if(orderAmount>=5000)
			{
				System.out.println("20% discount..");
			}
			else
			{
				System.out.println("15% discount..");
			}
		}
		else
		{
			System.out.println("10% discount..");
		}

	}

}
