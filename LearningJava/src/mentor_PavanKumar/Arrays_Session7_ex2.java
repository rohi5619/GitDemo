package mentor_PavanKumar;

public class Arrays_Session7_ex2 {

	public static void main(String[] args) 
	{
		// Print duplicates values from Array
		
		int arr[] = {10, 20, 30, 10, 40, 10, 10};
		int dupCount=0;
		int val=10;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==val)
			{
				dupCount ++;
			}
		}
		System.out.println(dupCount);

	}

}
