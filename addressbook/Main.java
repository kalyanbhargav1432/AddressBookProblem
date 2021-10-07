package addressbook;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		AddressBook person3 = new AddressBook();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details of addressbook person3:");
		System.out.println("Enter firtstname:");
		person3.setFirstName(scanner.nextLine());
		System.out.println("Enter lastname:");
		person3.setLastName(scanner.nextLine());
		System.out.println("Enter address:");
		person3.setAddress(scanner.nextLine());
		System.out.println("Enter city:");
		person3.setCity(scanner.nextLine());
		System.out.println("Enter state:");
		person3.setState(scanner.nextLine());
		System.out.println("Enter zip:");
		person3.setZip(scanner.nextLine());
		System.out.println("Enter phoneNumber:");
		person3.setPhoneNumber(scanner.nextLine());
		System.out.println("Enter email:");
		person3.setEmail(scanner.nextLine());
		scanner.close();
		ContactBook contactBook = new ContactBook();
		contactBook.add(person3);
		UserInterface userInterface = new UserInterface();
		userInterface.print(contactBook.getContactList());
	}
}
