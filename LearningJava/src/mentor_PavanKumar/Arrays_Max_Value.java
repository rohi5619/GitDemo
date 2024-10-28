package mentor_PavanKumar;

public class Arrays_Max_Value {

	public static void main(String[] args) 
	{
		// Print Max value in Array
		
		int arr[]= {20, 40, 10, 50, 30, 60};
		int max=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
