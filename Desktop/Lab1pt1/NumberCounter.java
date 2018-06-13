import java.util.Scanner;

public class NumberCounter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Prompts user to enter 3 digit number
		System.out.print("Enter a 3 digit number:    ");
		int number1 = scanner.nextInt();

		// Prompts user to enter another 3 digit number
		System.out.print("Enter anther 3 digit number:  ");
		int number2 = scanner.nextInt();

		// Returns the string representation of the integer argument
		String nbr1 = String.valueOf(number1);
		String nbr2 = String.valueOf(number2);

		// sets integer finalTotal and total to 0
		int finalTotal = 0, total = 0;

		//loops until i is not less than nubr length, and returns character specific index
		for (int i = 0; i < nbr1.length(); i++) {
			char character1 = nbr1.charAt(i);
			char character2 = nbr2.charAt(i);
			
			//Returns the numeric value of character
			total = Character.getNumericValue(character1) + Character.getNumericValue(character2);
			if (i == 0)
				finalTotal = total;
			else {
				if (total != finalTotal) {
					System.out.println("False");
					return;
				}
			}
		}
		System.out.println("True");
	}
}

