package mentor_PavanKumar;

import java.util.Scanner;

public class NaturalNumber_Reverse_While {

	public static void main(String[] args) {
		// // Print Natural Number in Reverse eg. 50 to 1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting Number: ");
		int sn = sc.nextInt();
		
		System.out.println("Ending Number: ");
		int en = sc.nextInt();
		
		while(sn >= en)
		{
			System.out.println(sn);
			sn --;
		}

	}

}
