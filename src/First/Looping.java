package First;

public class Looping {
	public static void main(String[] args) {
		char ch = 'A';
		while(ch <= 90) {
			System.out.print(ch+" ");
			ch++;
		}
		
		char ch1 = 'A';
		do {
			System.out.print(ch+" ");
		}while(ch<='Z');
	}
}
