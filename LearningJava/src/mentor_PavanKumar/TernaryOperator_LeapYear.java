package mentor_PavanKumar;

public class TernaryOperator_LeapYear {

	public static void main(String[] args) 
	{
		int year = 2024;
		
		String leapYear= (year%4==0)? "Leap Year.." : "No.. It is not";
		System.out.println(leapYear);

	}

}
