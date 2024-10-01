package mentor_PavanKumar;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// Print Table of any number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting no: ");
		int sn = sc.nextInt();
		
		System.out.println("Enter the ending no: ");
		int en = sc.nextInt();
		
		System.out.println("Enter the table's no ");
		int tn = sc.nextInt();
		
		while(sn<=en)
		{
		
			System.out.println(sn + "*" + tn + "=" + (sn*tn));
			sn++;
		}
		
	}

}
