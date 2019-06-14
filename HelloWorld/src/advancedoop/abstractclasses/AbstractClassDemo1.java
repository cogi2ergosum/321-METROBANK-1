package advancedoop.abstractclasses;

public class AbstractClassDemo1 {

	public static void main(String[] args) {
		Employee person = new Employee();
	}
}

abstract class Person {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract int abstractMethod0();
	abstract int abstractMethod1();
}

class Employee extends Person {
	int employeeId;
	float salary;
	
	@Override
	int abstractMethod0() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	int abstractMethod1() {
		// TODO Auto-generated method stub
		return 0;
	}
}