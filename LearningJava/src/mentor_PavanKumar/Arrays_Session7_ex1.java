package mentor_PavanKumar;

public class Arrays_Session7_ex1 
{

	public static void main(String[] args) 
	{
		// Print search element from Array
		
		int arr[] = {20, 10, 40, 30, 60,50};
		int searchEle=40;
		boolean temp=false;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==searchEle)
			{
				temp=true;
				break;
			}
		}
		if(temp==true)
		{
			System.out.println("Match found");
		}
		else
			System.out.println("Match not found");

	}

}
