package First;

public class Inheritanceeg {
	int width;
	int height;
	
	void display(String item) {
		System.out.println(item+" Width "+width+" Height "+height);
	}
	
	public static void main(String[] args) {
		Chair neelkamal = new Chair();
		neelkamal.foo();
		
	}
}

class Chair extends Inheritanceeg {
	void foo() {
		width = 10;
		height = 20;
		display("Chair");
	}
}
class Table extends Inheritanceeg{
	void foo() {
		width = 30;
		height = 50;
		display("Table");
	}
}
class Almira extends Inheritanceeg{
	void foo() {
		width = 100;
		height = 200;
		display("Almira");
	}
}