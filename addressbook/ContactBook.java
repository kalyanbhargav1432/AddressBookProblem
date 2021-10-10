package addressbook;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
	private Set<AddressBook> contactList = new HashSet<>();
	private Set<AddressBook1> contactList1 = new HashSet<>();

	public Set<AddressBook> getContactList() {
		return contactList;
	}
	public Set<AddressBook1> getContactList1() {
		return contactList1;
	}

	public void add(AddressBook contact) {
		contactList.add(contact);
	}
	
	public void remove(AddressBook contact) {
		contactList.remove(contact);
	}
	public void add(AddressBook1 contact) {
		contactList1.add(contact);
	}
	
	public void remove(AddressBook1 contact) {
		contactList1.remove(contact);
	}
}