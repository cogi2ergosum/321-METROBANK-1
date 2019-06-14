package arrays;

public class ClassBasics {

	public static void main(String[] args) {
		Contact john = new Contact();
		john.gender = "male";
		john.firstName = "John";
		john.lastName = "Smith";
		john.email = "john@email.com";
		john.phoneNum = "555-44-33";
		System.out.println(john.firstName);
		
		// direct attribute access
		john.firstName = "Johnny";
		john.setFirstName("John Michael");
		
		System.out.println(john.firstName);
		System.out.println(john.getFirstName());
		
		System.out.println(john.getFullName());
	}

}

class ContactPrinter {
	static void printContact(Contact contact) {
		System.out.println(contact.getFullName());
	}
}

class Contact {
	String gender;
	String firstName;
	String lastName;
	String email;
	String phoneNum;
	
	public String getFullName() {
		String title = null;
		if (gender.equals("male")) {
			title = "Mr.";
		} else {
			title = "Ms.";			
		}
		return title + " " + firstName + " " + lastName;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	public void setFirstName(String firstName) {
		// do validation check
		if (firstName.equals("")) { // ....
			
		}
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}