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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of firstname,lastname,address,city,state,zip,phonenumber,email:");
		System.out.println("Enter firtstname:");
		contact.setFirstName(sc.nextLine());
		System.out.println("Enter lastname:");
		contact.setLastName(sc.nextLine());
		System.out.println("Enter address:");
		contact.setAddress(sc.nextLine());
		System.out.println("Enter city:");
		contact.setCity(sc.nextLine());
		System.out.println("Enter state:");
		contact.setState(sc.nextLine());
		System.out.println("Enter zip:");
		contact.setZip(sc.nextLine());
		System.out.println("Enter phoneNumber:");
		contact.setPhoneNumber(sc.nextLine());
		System.out.println("Enter email:");
		contact.setEmail(sc.nextLine());
		sc.close();
	}

}
