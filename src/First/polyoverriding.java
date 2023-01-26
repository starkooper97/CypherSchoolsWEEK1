package First;

abstract class Doctor{
	abstract void treatPatient();
}

class Physician extends Doctor{
	@Override
	void treatPatient() {
		System.out.println("Hi, I am Physician \n1 treat patient using Medicines");
		
	}
}

class Surgeon extends Doctor{
	@Override
	void treatPatient() {
		System.out.println("Hi, I am surgeon \n1 treat patients using Surgery");
		
	}
}

class Dentist extends Doctor{
	@Override
	void treatPatient() {
		System.out.println("Hi, I am Dentist \n1 treat patient teeth");
	}
}
public class polyoverriding {
	public static void main(String[] args) {
		System.out.println("Hi! i am lucy");
		System.out.println("Who are you looking");
		System.out.println("Press \n1. Physician\n2");
		
		int choice = new java.util.Scanner(System.in).nextInt();
		
		Doctor doc = null;
		
		switch(choice) {
		case 1:
			doc = new Physician();
			break;
		case 2:
			doc = new Surgeon();
			break;
		case 3:
			doc = new Dentist();
			break;
		default:
			System.out.println("A oh! invalid choice");
			break;
		}
		
		if (choice<0 || choice>3) {
			System.exit(0);
		}
		else {
			doc.treatPatient();
		}
	}
}
