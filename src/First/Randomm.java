package First;
import java.util.Random;
import java.util.Scanner;
public class Randomm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int computerChoice = rnd.nextInt(20);
		System.out.println("Computer Choice : " + computerChoice);
		
		
		for(int i = 1; i <= 6; i++) {
		System.out.println("Guess a Number between 0 and 20");
		
		int userChoice  = sc.nextInt();
		
		if(userChoice > computerChoice) {
			System.out.println("Your guess is too high");
		}
		else if(userChoice < computerChoice) {
			System.out.println("Your guess is too low");
		}
		else {
			System.out.println("Gotchaa! you guessed it right");
			break;
		}
		}
		
	}
}
