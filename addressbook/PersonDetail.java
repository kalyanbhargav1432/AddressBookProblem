package addressbook;

import java.util.Scanner;
import java.util.ArrayList;

public abstract class PersonDetail {
	ArrayList<String> contactDetails = new <String>ArrayList(4);

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String email;
	private String phoneNumber;
	private String zip;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		contactDetails.add(firstName);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		contactDetails.add(lastName);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		contactDetails.add(address);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		contactDetails.add(city);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		contactDetails.add(state);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String e_mail) {
		this.email = e_mail;
		contactDetails.add(e_mail);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		contactDetails.add(phoneNumber);
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip= zip;
		contactDetails.add(zip);
	}

	@Override
	public String toString() {
		return "PersonDetail [contactDetails=" + contactDetails + ", firstName=" + firstName + ", lastName="
				+ lastName + ", address=" + address + ", city=" + city + ", state=" + state + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", zip=" + zip + "]";
	}
}