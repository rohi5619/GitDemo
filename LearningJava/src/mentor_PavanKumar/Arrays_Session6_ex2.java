package mentor_PavanKumar;

public class Arrays_Session6_ex2 
{

	public static void main(String[] args) 
	{
		// Print Even & Odd from Array
		
		int arr[] = {1,2,3,4,5,6,7};
		int eCount=0;
		int oCount=0;
		
		for(int r=0; r<arr.length; r++)
		{
			if(arr[r]%2==0)
			{
				System.out.println("Even no: " +arr[r]);
				eCount ++;
			}
			else
			{
				System.out.println("Odd no: " +arr[r]);
				oCount ++;
			}
		}
		System.out.println(eCount);
		System.out.println(oCount);

	}

}
