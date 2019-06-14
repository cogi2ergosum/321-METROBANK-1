package advancedoop;

public class InheritanceBasics {

	public static void main(String[] args) {
		Subclass subclass = new Subclass();
	}

}

class Superclass {
	public Superclass() { // no-arg constructor
		// TODO Auto-generated constructor stub
	}
	public Superclass(int num) {
		System.out.println("Superclass");
	}
}

class Subclass extends Superclass {
	public Subclass() {
		System.out.println("Subclass");
	}
}

