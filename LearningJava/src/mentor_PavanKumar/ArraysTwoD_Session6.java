package mentor_PavanKumar;

public class ArraysTwoD_Session6 
{

	public static void main(String[] args) 
	{
		// Print all values in 2D Array.
		
		int arr[][] = {  {900,800}, {700,600}, {500,400}  };
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[r].length; c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}

	}

}
