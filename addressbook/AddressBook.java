package addressbook;

import java.util.Scanner;

public abstract class AddressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String email;
	private String phoneNumber;
	private String zip;

	Scanner scanner = new Scanner(System.in);

	public void getEmail() {
		System.out.println("Enter the Email:");
		email = scanner.nextLine();
	}

	public void getFirstName() {
		System.out.println("Enter the first Name:");
		firstName = scanner.nextLine();
	}

	public void getLastName() {
		System.out.println("Enter the Last Name:");
		lastName = scanner.nextLine();
	}

	public void getAddress() {
		System.out.println("Enter the Address:");
		address = scanner.nextLine();
	}

	public void getCity() {
		System.out.println("Enter the City:");
		city = scanner.nextLine();
	}

	public void getState() {
		System.out.println("Enter the State:");
		state = scanner.nextLine();
	}

	public void getPhoneNumber() {
		System.out.println("Enter the Phone Number:");
		phoneNumber = scanner.nextLine();
	}

	public void getZip() {
		System.out.println("Enter the Zip: ");
		zip = scanner.nextLine();
	}

	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", email=" + email + ", phoneNumber=" + phoneNumber + ", zip=" + zip
				+ ", scanner=" + scanner + "]";
	}

}