package addressbook;

public class ContactDetails extends PersonDetail {
	public static void main(String[] args) {
		ContactDetails person1 = new ContactDetails();
		person1.getFirstName();
		person1.getLastName();
		person1.getAddress();
		person1.getCity();
		person1.getState();
		person1.getPhoneNumber();
		person1.getEmail();
		person1.getZip();
		System.out.println(person1.toString());
	}
}