package advancedoop;

public class InheritanceDemoSimple {
	public static void main(String[] args) {
		Contact john = new Contact();
		john.firstName = "John";
		john.lastName = "Smith";
		john.email = "john@email.com";
		john.phoneNum = "555-44-33";
		System.out.println(john);

		Contact mary = new Contact();
		mary.firstName = "Mary";
		mary.lastName = "Watson";
		mary.email = "mary.w@email.com";
		mary.phoneNum = "1=355-44-33";
		System.out.println(mary);
	}
}

class Contact {
	String gender;
	String firstName;
	String lastName;
	String email;
	String phoneNum;

	public String toString() {
		return "FirstName: "+ firstName + ", LastName: " + lastName;
	}
	
	public String getFullName() {
		String title = null;
		if (gender.equals("male")) {
			title = "Mr.";
		} else {
			title = "Ms.";
		}
		return title + " " + firstName + " " + lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}