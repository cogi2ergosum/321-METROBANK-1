package ownclasses;



public class EnumDemo {

	public static void main(String[] args) {
		Contact john = new Contact();
		john.gender = Gender.MALE;
		System.out.println(john.gender);
		john.firstName = "John";
		john.lastName = "Smith";
		john.email = "john@email.com";
		john.phoneNum = "555-44-33";

		Contact mary = new Contact();
		mary.gender = Gender.FEMALE;
	}
}

enum Gender {
	MALE, FEMALE
}

class Contact {
	Gender gender; 
	String firstName;
	String lastName;
	String email;
	String phoneNum;

	public void finalize() {
		// finalizer code
	}
	
	Contact() {
		firstName = "<default>";
	}
	
}