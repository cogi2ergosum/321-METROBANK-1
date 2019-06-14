package advancedoop;

public class OverridingDemo {

	public static void main(String[] args) {
		SalesEmployee emp = new SalesEmployee();
		emp.name = "Nick Jones";
		emp.salary = 50_000f;
		emp.commission = 5_000;
		System.out.println(emp.getSalary());
	}
}

class Person { 
	String name;
	int age;
}

class Employee extends Person {
	int employeeId;
	float salary;
	
	public float getSalary() {
		return salary;
	}
}

class SalesEmployee extends Employee {
	float commission;
	
	@Override public float getSalary() {
		return salary + commission;
	}
}