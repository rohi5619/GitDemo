package mentor_PavanKumar;

public class Print_OneToTen_Jumping_ForLoop {

	public static void main(String[] args) 
	{
		// Print 1 to 10 except 2, 6, 9 using For loop.

		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==7 || i==9)
			{
				continue;
			}
			
			System.out.println(i);
		}
		

	}

}
