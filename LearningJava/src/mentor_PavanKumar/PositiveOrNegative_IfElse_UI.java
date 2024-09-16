package mentor_PavanKumar;

import java.util.Scanner;

public class PositiveOrNegative_IfElse_UI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int input = in.nextInt();

		if (input > 0) {
			System.out.println("Positive number.. " + input);
		} else if (input < 0) {
			System.out.println("Negative number.. " + input);
		} else {
			System.out.println("It is ZERO");
		}

	}

}
