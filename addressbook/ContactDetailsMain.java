package addressbook;

import java.util.Scanner;
public class ContactDetailsMain {
	
	private static char inputCharater() {
		Scanner scanCharater = new Scanner(System.in);
		char charaterInput = scanCharater.next().charAt(0);
		return charaterInput;
	}

	public static void main(String[] args) {
		AddContact addPersonDetails = new AddContact();
		while (true) {
			System.out.println("Input the Charater to add Details A to Edit E and remove D any charater to Ignore");
			char charater = inputCharater();
			if (charater == 'A' || charater == 'E' || charater == 'D' || charater == 'a' || charater == 'e'
					|| charater == 'd') {
				switch (charater) {
				case 'A':
					addPersonDetails.SetContactDetails();
					addPersonDetails.getContactDetails();
					break;
				default :
					System.out.println("You not want to enter any details");
				}
			}
			System.out.println(addPersonDetails.contactDetails);
		}
	}
}