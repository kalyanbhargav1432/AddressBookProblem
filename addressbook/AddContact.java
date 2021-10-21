package addressbook;

import java.util.Iterator;
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

	public void editDetails() {
		Iterator<String> checkName = contactDetails.iterator();
		String name = scanData.nextLine();
		int index = contactDetails.indexOf(name);
		while (true) {
			if (contactDetails.contains(name)) {
				System.out.println("enter the first name");
				contactDetails.set(index, scanData.nextLine());
				System.out.println("enter lastname");
				contactDetails.set(++index, scanData.nextLine());
				System.out.println("enter the address");
				contactDetails.set(++index, scanData.nextLine());
				System.out.println("enter the city");
				contactDetails.set(++index, scanData.nextLine());
				System.out.println("enter the state");
				contactDetails.set(++index, scanData.nextLine());
				System.out.println("enter the phonenumber");
				contactDetails.set(++index, scanData.nextLine());
				System.out.println("enter the Zip");
				contactDetails.set(++index, scanData.nextLine());
				System.out.println("enter the email");
				contactDetails.set(++index, scanData.nextLine());
				break;
			} else {
				System.out.println("not match any details");
				break;
			}
		}
	}
}