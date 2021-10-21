package addressbook;

import java.util.Scanner;

public class AddContact extends PersonDetail {
	Scanner scanData = new Scanner(System.in);

	public void SetContactDetails() {
		System.out.println("enter the First Name");
		setFirstName(scanData.nextLine());
		System.out.println("enter the Last Name");
		setLastName(scanData.nextLine());
		System.out.println("enter the Address Name");
		setAddress(scanData.nextLine());
		System.out.println("enter the city Name");
		setCity(scanData.nextLine());
		System.out.println("enter the State Name");
		setState(scanData.nextLine());
		System.out.println("enter the Phone Number");
		setPhoneNumber(scanData.nextLine());
		System.out.println("enter the Zip");
		setZip(scanData.nextLine());
		System.out.println("enter the Email");
		setEmail(scanData.nextLine());
	}

	public void getContactDetails() {
		getFirstName();
		getLastName();
		getAddress();
		getCity();
		getState();
		getPhoneNumber();
		getZip();
		getEmail();
	}
}