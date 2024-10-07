package mentor_PavanKumar;

import java.util.Scanner;

public class ArraysTwoD_UI {

	public static void main(String[] args) {
		// Print user input 2D arrays values(matrix).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Rows: ");
		int rowIn = sc.nextInt();
		
		System.out.println("Enter the no of Columns: ");
		int colIn = sc.nextInt();
		
		int arr[][]=new int[rowIn][colIn];
		
		System.out.println("Enter elements for 2D Array: ");
		
		for(int i=0; i<rowIn; i++)
		{
			for(int j=0; j<colIn; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Below is the matrix -->");
		
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
