import java.util.Random;
import java.util.Scanner;

public class RollDice {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String usersChoice;
				
		System.out.println("Welcome to Grand Circus Casino!");
		
		do{
	    System.out.println("How many sides  does your dice have?");
		int sides = input.nextInt();
	    System.out.println("Roll the Dice!");
		
		int num1 = roll(sides);
		int num2 = roll(sides);
		System.out.println("" + num1 + " " +  + num2);
		System.out.println("Roll again Yes or No?");
		usersChoice = input.next();
		
		}while(usersChoice.equalsIgnoreCase("Yes"));
		System.out.println("Good Bye!");	
	}
	public static int roll (int sides)   {
		Random rand = new Random();
		return rand.nextInt(sides + 1);
	}
	
	
	}

	
	


