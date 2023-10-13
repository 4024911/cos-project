package assignment1;

class Vendors {
	
	private String companyName;
	private String email;
	private int phoneNumber;
	private String address;
	private String activity;
	
	Vendors(String companyName, String email, int phoneNumber, String address, String activity) {
		this.companyName = companyName; 
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.activity = activity;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	void setEmail(String email) {
		this.email = email;
	}
	void setPhoneNumber(int number) {
		this.phoneNumber = number;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setActivity(String activity) {
		this.activity = activity;
	}
	String getCompanyName() {
		return companyName;
	}
	String getEmail() {
		return email;
	}
	int getPhoneNumber() {
		return phoneNumber;
	}
	String getAddress() {
		return address;
	}
	String getActivity() {
		return activity;
	}
	void customerInfo() {
		System.out.println("Company Name: " + companyName);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
		System.out.println("Activity: " + activity);
	}
}