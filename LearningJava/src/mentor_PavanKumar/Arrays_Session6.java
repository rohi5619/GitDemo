package mentor_PavanKumar;

public class Arrays_Session6 
{

	public static void main(String[] args) 
	{
		// Print values in array
		
		int a[] = {100,200,300,400,500};
		
		// Using For loop
		
	/*	for(int x:a)
		{
			System.out.println(x);
		}
	*/
		// Using For-each loop
		
		for(int i=0;i<=a.length-1;i++)  // i<=4, i<5, i<a.length, i<=a.length-1
		{
			System.out.println(a[i]);
		}
		
	}

}
