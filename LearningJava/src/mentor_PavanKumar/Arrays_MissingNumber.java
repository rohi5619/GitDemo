package mentor_PavanKumar;

public class Arrays_MissingNumber {

	public static void main(String[] args) 
	{
		// Print missing number in Arrays
		
		int arr[]= {1,2,3,5};
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum= sum + arr[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		
		for(int j=1; j<=5; j++)
		{
			sum1= sum1 + j;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);
	}

}
