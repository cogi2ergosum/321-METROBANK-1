package ownclasses.misc;

public class TheThisKeyword {

	public static void main(String[] args) {
		Contact john = new Contact();
		john.gender = 0;
		System.out.println(john.gender);
		john.firstName = "John";
		john.lastName = "Smith";
		john.email = "john@email.com";
		john.phoneNum = "555-44-33";
		john.printSelf();
		Contact mary = new Contact();
		mary.gender = 1;
	}
}


class Gender {
	static int MALE = 0;
	static int FEMALE = 1;
}

class ContactPrinter {
	static void printContact(Contact contact) {
//		System.out.println(contact.getFullName());
		System.out.println(contact.email);
	}
}


class Contact {
	int gender; 
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
	


//	public String getFullName() {
//		String title = null;
//		if (gender.equals("male")) {
//			title = "Mr.";
//		} else {
//			title = "Ms.";
//		}
//		return title + " " + firstName + " " + lastName;
//	}

	public void printSelf() {
		ContactPrinter.printContact(this);
	}

}