package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactDetailsMain {
	static ArrayList<AddContact> addDetails = new <AddContact>ArrayList();

	private static char inputCharater() {
		Scanner scanCharater = new Scanner(System.in);
		char charaterInput = scanCharater.next().charAt(0);
		return charaterInput;
	}

	public static void main(String[] args) {

		while (true) {
			AddContact addPersonDetails = new AddContact();
			System.out.printf(
					"Input the Charater A to add Details E to Edit details D to delete details\n Any charater to Ignore");
			char charater = inputCharater();
			if (charater == 'A' || charater == 'E' || charater == 'D' || charater == 'a' || charater == 'e'
					|| charater == 'd') {
				switch (charater) {
				case 'A':
					addPersonDetails.setContactDetails();
					addDetails.add(addPersonDetails);
					break;
				case 'E':
					System.out.println("Enter the name to edit");
					addPersonDetails.editDetails(addDetails);
					break;
				case 'D':
					addPersonDetails.deleteDetails(addDetails);
					break;
				default:
					System.out.println("you have not perform any operation");
					break;
				}

			} else {
				System.out.println("Details are uptodate");
				break;
			}
		}
		for (int i = 0; i < addDetails.size(); i++)
			System.out.println(addDetails.get(i));
	}
}