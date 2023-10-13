package assignment1;

class Customers {
	
	private String fName;
	private String sName;
	private int age;
	private String gender;
	private String email;
	private long phoneNumber;
	
	Customers(String fName, String sName, String gender, String email, long phoneNumber, int age) {
		this.fName = fName;
		this.sName = sName;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	void setFName(String fName) {
		this.fName = fName;
	}
	void setSName(String sName) {
		this.sName = sName;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	void setEmail(String email) {
		this.email = email;
	}
	void setPhoneNumber(int number) {
		this.phoneNumber = number;
	}
	String getFName() {
		return fName;
	}
	String getSName() {
		return sName;
	}
	int getAge(int age) {
		return age;
	}
	String getGender() {
		return gender;
	}
	String getEmail() {
		return email;
	}
	long getPhoneNumber() {
		return phoneNumber;
	}
	void customerInfo() {
		System.out.println("Firstname: " + fName);
		System.out.println("Surname: " + sName);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
	}
}