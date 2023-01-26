package First;
import java.util.Scanner;

public class PoliceBike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter speed : ");
		
		int speed = sc.nextInt();
		System.out.println("Today is your birthday : ");
		boolean isbirthday = sc.nextBoolean();
		
		if(isbirthday==true) {
			speed-=5;
		}
		
		if(speed>80)
			System.out.printf("High Ticket");
		else if(speed>=60) 
			System.out.printf("Mid Ticket");	
		else 
			System.out.printf("No ticket");

	}
}
