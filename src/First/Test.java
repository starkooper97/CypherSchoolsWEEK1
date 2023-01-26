package First;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("+ve");
		}
		else if(num==0) {
			System.out.println("Neutral");
		}
		else {
			System.out.println("-ve");
		}
	}

}
