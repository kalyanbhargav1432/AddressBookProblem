package addressbook;

public class Main {
	public static void main(String[] args) {
		System.out.println("welcome to address book program");
		AddressBook person1 = new AddressBook("Kalyan","tanniru","12-1234","Guntur","AndhraPradesh","522616","9182169100","tannirukalyan1432@gmail.com");
		AddressBook person2 = new AddressBook("Bhargav","tanniru","12-1234","Guntur","AndhraPradesh","522616","9642502811","tannirukalyan1234@gmail.com");
		ContactBook contactBook = new ContactBook();
		contactBook.add(person1);
		contactBook.add(person2);
		UserInterface userInterface = new UserInterface();
		userInterface.print(contactBook.getContactList());
	}
}
