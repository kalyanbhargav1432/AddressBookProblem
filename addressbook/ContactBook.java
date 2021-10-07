package addressbook;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class ContactBook {
	private Set<AddressBook> contactList = new HashSet<>();

	public Set<AddressBook> getContactList() {
		return contactList;
	}

	public void add(AddressBook contact) {
		contactList.add(contact);
	}
}