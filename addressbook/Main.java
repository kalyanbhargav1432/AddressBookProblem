package addressbook;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		AddressBook person1 = new AddressBook();
		person1.setFirstName("kalyan");
		person1.setLastName("tanniru");
		person1.setAddress("12-1234");
		person1.setCity("Guntur");
		person1.setState("AndhraPradesh");
		person1.setZip("522616");
		person1.setPhoneNumber("9182169100");
		person1.setEmail("tannirukalyan1432@gmail.com");

		AddressBook person2 = new AddressBook();
		person2.setFirstName("Bhargav");
		person2.setLastName("tanniru");
		person2.setAddress("12-1234");
		person2.setCity("Guntur");
		person2.setState("AndhraPradesh");
		person2.setZip("522616");
		person2.setPhoneNumber("9642502811");
		person2.setEmail("tannirukalyan1234@gmail.com");

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
		
		AddressBook person4 = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of addressbook person4:");
		System.out.println("Enter firtstname:");
		person4.setFirstName(sc.nextLine());
		System.out.println("Enter lastname:");
		person4.setLastName(sc.nextLine());
		System.out.println("Enter address:");
		person4.setAddress(sc.nextLine());
		System.out.println("Enter city:");
		person4.setCity(sc.nextLine());
		System.out.println("Enter state:");
		person4.setState(sc.nextLine());
		System.out.println("Enter zip:");
		person4.setZip(sc.nextLine());
		System.out.println("Enter phoneNumber:");
		person4.setPhoneNumber(sc.nextLine());
		System.out.println("Enter email:");
		person4.setEmail(sc.nextLine());
		
		ContactBook contactBook = new ContactBook();
		contactBook.add(person1);
		contactBook.add(person2);
		contactBook.add(person3);
		contactBook.add(person4);
		
		UserInterface userInterface = new UserInterface();
		userInterface.print(contactBook.getContactList());

		System.out.println("enter name of contact you want to edit:");
		String name = scanner.nextLine();
		if (person1.getFirstName().equalsIgnoreCase(name) == true) 
			userInterface.edit(person1);
		 else if (person2.getFirstName().equalsIgnoreCase(name) == true) 
			userInterface.edit(person2);
		 else if (person3.getFirstName().equalsIgnoreCase(name) == true) 
			userInterface.edit(person3);
		
		System.out.println("contact list after edit");
		userInterface.print(contactBook.getContactList());

		System.out.println("enter name of contact person you want to delete:");
		String contact = scanner.nextLine();
		if (person1.getFirstName().equalsIgnoreCase(contact) == true) 
			contactBook.remove(person1);
		 else if (person2.getFirstName().equalsIgnoreCase(contact) == true) 
			contactBook.remove(person2);
		 else if (person3.getFirstName().equalsIgnoreCase(contact) == true) 
			contactBook.remove(person3);
		
		System.out.println("contact list after delete:");
		userInterface.print(contactBook.getContactList());
	}
}