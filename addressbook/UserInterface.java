package addressbook;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	void print(Set<AddressBook> contactList) {

		for (Object i : contactList) {
			System.out.println(i);
		}
	}

	public void edit(AddressBook contact) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details of firstname,lastname,address,city,state,zip,phonenumber,email:");
		System.out.println("Enter firtstname:");
		contact.setFirstName(scanner.nextLine());
		System.out.println("Enter lastname:");
		contact.setLastName(scanner.nextLine());
		System.out.println("Enter address:");
		contact.setAddress(scanner.nextLine());
		System.out.println("Enter city:");
		contact.setCity(scanner.nextLine());
		System.out.println("Enter state:");
		contact.setState(scanner.nextLine());
		System.out.println("Enter zip:");
		contact.setZip(scanner.nextLine());
		System.out.println("Enter phoneNumber:");
		contact.setPhoneNumber(scanner.nextLine());
		System.out.println("Enter email:");
		contact.setEmail(scanner.nextLine());
		scanner.close();
	}

}
