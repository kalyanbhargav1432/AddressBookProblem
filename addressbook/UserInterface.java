package addressbook;

import java.util.Set;

public class UserInterface {
	void print(Set<AddressBook> contactList) {

		for (Object i : contactList) {
			System.out.println(i);
		}
	}
}
