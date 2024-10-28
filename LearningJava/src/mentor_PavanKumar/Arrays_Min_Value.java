package mentor_PavanKumar;

public class Arrays_Min_Value {

	public static void main(String[] args) 
	{
		// Print Min value in Array
		
		int arr[]= {20, 40, 10, 50, 30, 60, 5};
		int min= arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min= arr[i];
			}
		}
		System.out.println(min);
	}

}
