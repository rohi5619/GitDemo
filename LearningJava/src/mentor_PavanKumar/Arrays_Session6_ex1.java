package mentor_PavanKumar;

public class Arrays_Session6_ex1 {

	public static void main(String[] args) {
		// Print sum of values from Array
		
		int arr[]= {1,2,3,4,5};
		int sum=0;
		
		for(int r=0; r<arr.length; r++)
		{
			sum = sum + arr[r];
		}
		System.out.println(sum);

	}

}
